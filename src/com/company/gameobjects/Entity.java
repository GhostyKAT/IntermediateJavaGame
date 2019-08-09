package com.company.gameobjects;

public class Entity {
    private int m_HP, m_AP;

    public Entity(int HP, int AP) {
        this.m_HP = HP;
        this.m_AP = AP;
    }
    public int setHP(){
        return this.m_HP;
    }
    public int setAP(){
        return this.m_AP;
    }
}
