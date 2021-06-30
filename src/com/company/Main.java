package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Задайте день недели: ");

        switch (in.next()){
            case "Понедельник":
                System.out.println(daysOfWeek.Monday.getInfo());
                break;
            case "Вторник":
                System.out.println(daysOfWeek.Tuesday.getInfo());
                break;
            case "Среда":
                System.out.println(daysOfWeek.Wednesday.getInfo());
                break;
            case "Четверг":
                System.out.println(daysOfWeek.Thursday.getInfo());
                break;
            case "Пятница":
                System.out.println(daysOfWeek.Friday.getInfo());
                break;
            case "Суббота":
                System.out.println(daysOfWeek.Saturday.getInfo());
                break;
            case "Воскресенье":
                System.out.println(daysOfWeek.Sunday.getInfo());
                break;
        }
    }
}
