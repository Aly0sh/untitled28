package com.company;

public enum daysOfWeek {
    Monday("Понедельник","Выходной"),
    Tuesday("Вторник","Тренировка во вторник"),
    Wednesday("Среда","Выходной"),
    Thursday("Четверг","Тренировка в четверг"),
    Friday("Пятница","Выходной"),
    Saturday("Суббота","Тренировка в субботу"),
    Sunday("Воскресенье","Выходной");

    private final String name;
    private final String info;

    daysOfWeek (String name, String info){
        this.name=name;
        this.info=info;
    }


    public String getName(){
        return this.name;
    }
    public String getInfo(){
        return this.info;
    }
}
