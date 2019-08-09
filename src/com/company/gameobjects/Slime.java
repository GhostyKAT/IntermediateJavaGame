package com.company.gameobjects;

import com.company.gameobjects.Entity;

public class Slime extends Entity {
    private int m_HP, m_AP, m_level;

    public Slime(int HP, int AP, int Level){
        super(HP, AP);
        this.m_HP = HP;
        this.m_AP = AP;
        this.m_level = Level;
    }

    public int getHP(){
        return this.m_HP;
    }
    public int getAP(){
        return this.m_AP;
    }
    public int getLevel(){
        return this.m_level;
    }
}
