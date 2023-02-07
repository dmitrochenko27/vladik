package ru.otus;

import java.util.Scanner;




    /**
     * Заготовка для выполнения ДЗ "Система тестирования".
     */
    public class HomeworkTemplate3 {

        public static void main(String[] args) {
            int correctCount = 0;

            String[][] answerOptions = {
                    {"Какова цель метода «public static void main (String [] args)» в Java?",
                            " Он объявляет основной метод для приложения Java",
                            " Он указывает начальную точку для приложения Java",
                            " Он позволяет приложению Java принимать аргументы командной строки",
                            " Все вышеперечисленное"},
                    {" Что такое наследование в Java?",
                            "Механизм создания новых классов из существующих классов",
                            "Механизм совместного использования методов и полей между классами ",
                            "Механизм повторного использования существующего кода в новых приложениях",
                            "Все вышеперечисленное"},
                    {"Что такое интерфейс в Java?",
                            " Схема классов",
                            "Тип, который может содержать методы, поля и внутренние классы",
                            "Набор абстрактных методов и константных значений",
                            " Набор связанных классов"}
            };

            int[] wrongAnswers = {
                    3,
                    0,
                    2
            };

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < answerOptions.length; i++) {
                String[] entry = answerOptions[i];
                System.out.println("Внимание, вопрос:");
                System.out.println(entry[0]);
                System.out.println("Варианты ответов:");
                System.out.println("1) " + entry[1]);
                System.out.println("2) " + entry[2]);
                System.out.println("3) " + entry[3]);
                System.out.println("4) " + entry[4]);

                int userAnswer = Integer.parseInt(scanner.nextLine());
                if ((userAnswer - 1) == wrongAnswers[i]) {
                    correctCount++;
                }
            }
            System.out.println("Верных ответов: " + correctCount + "/" + answerOptions.length);
            System.out.println("Неверных ответов: " + (answerOptions.length - correctCount) + "/" + answerOptions.length);
        }
    }

