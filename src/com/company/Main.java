package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Алексей","Рома","Данил"};
        for (int i = 0; i < 4 ; i++) {
	switch (names[i]) {
        case "Алексей":
            System.out.println("Доброе утро Алексей.");
            break;
        case "Рома":
            System.out.println("Дорбрый день Рома.");
            break;
        case "Данил":
            System.out.println("Добрый вечер Данил.");
            break;
	}
    }
    }
}
