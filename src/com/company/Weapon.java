package com.company;

public class Weapon {

    private String weaponType;
    private String weaponName;



    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Weapon(String weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

}
