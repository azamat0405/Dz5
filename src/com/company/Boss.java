package com.company;

public class Boss {
    private int bossHealth;
    private double bossDamage;
    private String typeOfProtection;

    public Boss(int bossHealth, double bossDamage, String bossDeffenceType) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.typeOfProtection = bossDeffenceType;

    }

    public void printInfo() {
        System.out.println("-------------------\n" +
                "Жизнь" +getBossHealth() + "\n"
                + "Атака" + getBossDamage() + "\n"
                + "Урон" +  getBossHealth() + "\n" +
                "---------------------------------");

    }

    public int getBossHealth() {
        return bossHealth;

    }

    public double getBossDamage() {
        return bossDamage;

    }

    public String getBossDeffenceType() {

        return typeOfProtection;

    }


}
