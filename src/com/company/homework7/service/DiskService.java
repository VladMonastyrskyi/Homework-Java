package com.company.homework7.service;

import com.company.homework7.model.Composition;
import com.company.homework7.model.Disk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiskService {

    public int getTotalDuration(Disk disk) {
        return disk.getCompositions().stream().mapToInt(Composition::getLength).sum();
    }

    public List<Composition> getCompositionsByStyle(Disk disk, Composition.Style style) {
        return disk.getCompositions().stream()
                .filter(i -> i.getStyle().equals(style))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Composition> getCompositionsByRangeOfDuration(Disk disk, int from, int to) {
        return disk.getCompositions().stream()
                .filter(i -> i.getLength() >= from && i.getLength() <= to)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
