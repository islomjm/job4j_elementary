package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String mark;
        switch (day) {
            case 1:
                mark = "Понедельник";
                break;
            case 2:
                mark = "Вторник";
                break;
            case 3:
                mark = "Среда";
                break;
            case 4:
                mark = "Четверг";
                break;
            case 5:
                mark = "Пятница";
                break;
            case 6:
                mark = "Суббота";
                break;
            case 7:
                mark = "Воскресенье";
                break;
            default:
                mark = "Ошибка";
                break;
        }
        return mark;
    }
}
