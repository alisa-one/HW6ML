package com.company;

public class Boss extends GameEntity {


    private Weapon dangerous;


    public Boss(int healtheBoss, int damageBoss){
        super(healtheBoss, damageBoss);
    }

    public Weapon getDangerous() {
        return dangerous;
    }
    public void setDangerous(Weapon dangerous) {
        this.dangerous = dangerous;
    }



}
