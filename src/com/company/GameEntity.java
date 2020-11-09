package com.company;

public class GameEntity {


    private  int healtheBoss;

    private  int damageBoss;


    private int healtheHero;
    private int damageHero;


    public GameEntity(int healtheBoss, int damageBoss) {
        this.damageBoss = damageBoss;
        this.healtheBoss = healtheBoss;
    }


        public  int getHealtheBoss() {
        return healtheBoss;
    }

    public void setHealtheBoss(int healtheBoss) {
        this.healtheBoss = healtheBoss;
    }

    public  int getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }


    public int getHealtheHero() {
        return healtheHero;
    }

    public void setHealtheHero(int healtheHero) {
        this.healtheHero = healtheHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }


}
