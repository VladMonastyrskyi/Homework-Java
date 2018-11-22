package com.company.homework7.composition;

import com.company.homework7.model.Composition;

public class ClassicComposition extends Composition {

    public ClassicComposition(String name, String author, int length) {
        super(name, author, Style.CLASSIC, length);
    }
}
