package org.example;
/*
    1. stwórz minimum 5 zmiennych opisujących samochód.
    2. użyj przynajmniej raz następujące typy:
    - byte
    - short
    - int
    - float / double
    - boolean
    3. Staraj się użyć nazwy dobrze opisujące przechowywaną wartość np: accelerationTime
 */
public class Main {
    public static void main(String[] args) {
        byte iloscKol = 4;
        short rok = 2007;
        int iloscDrzwi = 5;
        float pojemnosc = 0.8f;
        boolean czyCiezarowka = false;
        System.out.println("Ilość kół: " + iloscKol + " Rocznik: " + rok + " Ilość drzwi: " + iloscDrzwi + " Pojemność: " + pojemnosc + " Czy ciężarówka" + czyCiezarowka);
    }
}