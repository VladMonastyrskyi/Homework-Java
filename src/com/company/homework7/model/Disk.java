package com.company.homework7.model;

import com.company.homework7.composition.ClassicComposition;
import com.company.homework7.composition.PopComposition;
import com.company.homework7.composition.RapComposition;

import java.util.ArrayList;
import java.util.List;

public class Disk {

    private List<Composition> compositions;

    public Disk() {
        compositions = new ArrayList<>();

        compositions.add(new ClassicComposition("Шелест весны", "Кристиан Синдинг", 155));
        compositions.add(new ClassicComposition("Загородные сады", "Перси Грейнджер", 156));
        compositions.add(new ClassicComposition("Аве, Мария", "Франц Шуберт", 169));
        compositions.add(new PopComposition("Natural", "Imagine Dragons", 184));
        compositions.add(new PopComposition("Moonlight", "Gaullin", 142));
        compositions.add(new RapComposition("Porchy", "Faded", 176));
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }
}
