package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Алексей","Рома","Данил"};
	String[] newNames = Arrays.copyOf(names, names.length + 1);
	newNames[names.length] = "Артур";
        for (int i = 0; i < names.length ; i++) {
	switch (names[i]) {
        case "Алексей":
            System.out.println("Доброе утро Алексей.");
            break;
        case "Рома":
            System.out.println("Дорбрый день Рома.");
            break;
        case "Данил":
            System.out.println("Добрый вечер Данил.");
        case "Артур":
            System.out.println("Доброй ночи Артур");
            break;
	}
    }
    }
}
