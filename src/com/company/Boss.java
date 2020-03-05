package com.company;

public class Boss {
    private int bossHealth;
    private double bossDamage;
    private String bossDeffenceType;

    public Boss(int bossHealth, double bossDamage, String bossDeffenceType) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDeffenceType = bossDeffenceType;

    }

    public void printInfo() {
        System.out.println(bossHealth + bossDamage + bossDeffenceType);

    }

    public int getBossHealth() {
        return bossHealth;

    }

    public double getBossDamage() {
        return bossDamage;

    }

    public String getBossDeffenceType() {

        return bossDeffenceType;

    }


}
