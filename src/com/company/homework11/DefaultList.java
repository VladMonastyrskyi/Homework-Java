package com.company.homework11;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DefaultList<T> implements MyList<T>, ListIterable<T> {

    private static final Object[] EMPTY_ARRAY = {};

    private T[] array;
    private int size;

    public DefaultList() {
        array = (T[]) EMPTY_ARRAY;
    }

    @Override
    public void add(T e) {
        array = Arrays.copyOf(array, ++size);
        array[size - 1] = e;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean remove(T o) {
        if (indexOf(o) != -1) {
            int moveStep = size - indexOf(o) - 1;
            if (moveStep > 0) {
                System.arraycopy(array, indexOf(o) + 1, array, indexOf(o), moveStep);
            }
            array[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean containsAll(MyList<T> l) {
        if (l.size() != 0) {
            Object[] objs = l.toArray();
            for (int i = 0; i < l.size(); i++) {
                if (!contains((T) objs[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private int indexOf(T o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return i;
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIteratorImpl();
    }

    private class IteratorImpl implements Iterator<T> {

        private int pointer;
        private boolean canRemove = false;

        public IteratorImpl() {
            pointer = -1;
        }

        public boolean hasNext() {
            return size > 0 && (pointer + 1) < size;
        }

        public T next() {
            canRemove = true;
            return array[++pointer];
        }

        public void remove() {
            if (pointer == -1 || !canRemove)
                throw new IllegalStateException();
            DefaultList.this.remove(array[pointer--]);
            canRemove = false;
        }
    }

    private class ListIteratorImpl extends IteratorImpl implements ListIterator<T> {

        private int pointer;
        private boolean canSet = false;
        private boolean canRemove = false;

        public ListIteratorImpl() {
            pointer = -1;
        }

        public boolean hasNext() {
            return size > 0 && (pointer + 1) < size;
        }

        @Override
        public boolean hasPrevious() {
            return size > 0 && (pointer - 1) >= 0;
        }

        public T next() {
            canSet = true;
            canRemove = true;
            return array[++pointer];
        }

        @Override
        public T previous() {
            canSet = true;
            canRemove = true;
            return array[--pointer];
        }

        public void remove() {
            if (pointer == -1 || !canRemove)
                throw new IllegalStateException();
            DefaultList.this.remove(array[pointer--]);
            canRemove = false;
        }

        @Override
        public void set(T e) {
            if (pointer == -1 || !canSet)
                throw new IllegalStateException();
            array[pointer] = e;
            canSet = false;
        }
    }
}

