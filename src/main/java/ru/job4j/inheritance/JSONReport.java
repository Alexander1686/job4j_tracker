package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "name" + " : " + name + ","  + System.lineSeparator()
                + "body" + " : " + body + System.lineSeparator()  + "}";
}

    public static void main(String[] args) {
        JSONReport jSONReport = new JSONReport();
        System.out.println(jSONReport.generate("name", "body"));
        System.out.println(jSONReport.generate("Report's name", "Report's body"));
        System.out.println(jSONReport.generate("David Gilmour", "Shine On You Crazy Diamond"));
    }
}