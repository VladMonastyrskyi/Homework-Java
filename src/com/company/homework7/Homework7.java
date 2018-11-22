package com.company.homework7;

import com.company.homework7.model.Composition;
import com.company.homework7.model.Disk;
import com.company.homework7.service.DiskService;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        DiskService diskService = new DiskService();
        Disk disk = new Disk();
        int seconds = diskService.getTotalDuration(disk) % 60;
        int minutes = diskService.getTotalDuration(disk) / 60;
        System.out.println("Продолжительность " + minutes + " минут(ы) " + seconds + " секунд(ы)");
        System.out.println("\nСписок классических композиций\n" + diskService.getCompositionsByStyle(disk, Composition.Style.CLASSIC));
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите продолжительность композиции");
        System.out.print("От ");
        int from = in.nextInt();
        System.out.print("До ");
        int to = in.nextInt();
        System.out.println("Результат");
        System.out.println(diskService.getCompositionsByRangeOfDuration(disk, from, to));
    }
}
