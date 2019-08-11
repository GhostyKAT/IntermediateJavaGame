package com.company.gameobjects;

public class Entity implements java.io.Serializable {
    protected int m_HP, m_AP;
    protected Status m_status;

    public void inflict(double infliction, Status status) {
        this.m_HP -= infliction;
    }

    public Entity(int HP, int AP, Status status) {
        this.m_HP = HP;
        this.m_AP = AP;
        this.m_status = status;
    }
    public int setHP(){
        return this.m_HP;
    }
    public int setAP(){
        return this.m_AP;
    }
    public void getHP(){
        /*
        DO THIS STUFF BEN OR ELSE
         */
    }

    public enum Status {
        POISON,
        BURN,
        FROZEN,
        ASLEEP,
        HEALTHY
    }
}