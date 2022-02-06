package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Добавим окно
        Okno okno = new Okno();

        // Наше поле
        Pole pole = new Pole();

        // Таймер на обновление картинки
        Timer timerDraw = new Timer(50, e -> pole.repaint());
        timerDraw.start();

        // Добавим компонент поля в окно
        okno.add(pole);

        // Отобразить окно
        okno.setVisible(true);





        // Добавим окно
        Okno okno2 = new Okno();

        // Наше поле
        Pole pole2 = new Pole();

        // Таймер на обновление картинки
        Timer timerDraw2 = new Timer(50, e -> pole2.repaint());
        timerDraw2.start();

        // Добавим компонент поля в окно
        okno2.add(pole2);

        // Отобразить окно
        okno2.setVisible(true);
    }
}




