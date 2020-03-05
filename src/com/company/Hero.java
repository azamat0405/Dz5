package com.company;

public class Hero {
    private int Health;
    private double Damage;
    private String pushDeffenceType;

    public Hero(int pushHealth, double pushDamage, String pushDeffenceType) {
        this.Health = pushHealth;
        this.Damage = pushDamage;
        this.pushDeffenceType = pushDeffenceType;

    }

    public Hero(int pushHealth, double pushDamage) {
        this.Health = pushHealth;
        this.Damage = pushDamage;

    }

    public void printInfo() {
        System.out.println(Health + Damage + pushDeffenceType);
    }

    public void secondPrintInfo() {
        System.out.println(Health + Damage);
    }

    public int getHealth() {
        return Health;

    }

    public double getDamage() {
        return Damage;
    }

    public String getPushDeffenceType() {
        return pushDeffenceType;
    }
}





