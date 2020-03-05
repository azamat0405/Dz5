package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(100, 50, "Mental");
        boss.printInfo();

    }
    public static Hero [] createHeroes(){
        Hero [] arrayHero = new Hero[3];
        Hero hero = new Hero(200, 50,  "Mental");
        hero.printInfo();
        arrayHero [0] = hero;
        Hero hero1 = new Hero(250, 100);
        hero1.secondPrintInfo();
        arrayHero [1] = hero1;
        Hero hero2 = new Hero(300, 150, "Physikal" );
        hero2.secondPrintInfo();
        arrayHero [2] = hero2;
        return arrayHero;

    }
}
