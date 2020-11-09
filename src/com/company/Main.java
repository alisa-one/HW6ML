package com.company;

public class Main {


    public static void main(String[] args) {


        Boss boss = new Boss(2000, 50);


        Weapon weapon = new Weapon("Automat", "AK-47");


        boss.setDangerous(weapon);



        System.out.println("Boss healthe: "+boss.getHealtheBoss()+ ",  Boss damage: "+
                boss.getDamageBoss()+ ",  Boss weapon:  " +boss.getDangerous().getWeaponType()+"  "+boss.getDangerous().getWeaponName());
    }


}


