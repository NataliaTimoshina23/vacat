package ru.netology.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // количество месяцев отдыха
        int money = 0; //баланс

        for (int month = 0; month < 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}
