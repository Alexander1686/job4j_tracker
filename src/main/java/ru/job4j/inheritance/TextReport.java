package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
// формальная правка для задания 7. Аннотация @Override [#174891]
