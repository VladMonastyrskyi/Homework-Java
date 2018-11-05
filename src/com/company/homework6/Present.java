package com.company.homework6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Present {

    private List<Sweet> content;

    public Present() {
        content = new ArrayList<>();

        content.add(new Candy(240, 56, "Конфеты АВК Шоколадная ночь"));
        content.add(new Candy(130, 28, "Конфеты Красный мак"));
        content.add(new Candy(190, 45, "Конфеты Candy Nut Карамель"));

        content.add(new Chocolate(90, 32, "Шоколад Roshen чёрный"));
    }

    public List<Sweet> getContent() {
        return content;
    }

    public void addToContent(Sweet sweet) {
        content.add(sweet);
    }

    public double getWeight() {
        return content.stream()
                .map(Sweet::getWeight).mapToDouble(i -> i)
                .sum();
    }

    public List<Sweet> sortByWeight() {
        return content.stream()
                .sorted(Comparator.comparing(Sweet::getWeight))
                .collect(Collectors.toList());
    }

    public List<Sweet> sortBySugar() {
        return content.stream()
                .sorted(Comparator.comparing(Sweet::getSugar))
                .collect(Collectors.toList());
    }

    public List<Sweet> sortByName() {
        return content.stream()
                .sorted(Comparator.comparing(Sweet::getName))
                .collect(Collectors.toList());
    }

    public List<Sweet> getContentByRangeOfSugar(double from, double to) {
        return content.stream()
                .filter(i -> i.getSugar() >= from && i.getSugar() <= to)
                .collect(Collectors.toList());
    }
}
