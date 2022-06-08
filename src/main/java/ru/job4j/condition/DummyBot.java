package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else if ("Как тебя зовут?".equals(question)) {
            rsl = "Я тупой Бот.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Как тебя зовут?");
        System.out.println(rsl);
        rsl = DummyBot.answer("Где ты живёшь?");
        System.out.println(rsl);
    }
}
