package com.company.homework7.composition;

import com.company.homework7.model.Composition;

public class PopComposition extends Composition {

    public PopComposition(String name, String author, int length) {
        super(name, author, Style.POP, length);
    }
}
