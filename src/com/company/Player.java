package com.company;

public class Player extends Entity {
    private int m_MP, m_VP, m_DP;

    public Player(int HP, int AP, int MP, int VP, int DP){
        super(HP, AP);
        this.m_MP = MP;
        this.m_VP = VP;
        this.m_DP = DP;
    }

    public int setMP(){
        return this.m_MP;
    }
    public int setVP(){
        return this.m_VP;
    }
    public int setDP(){
        return this.m_DP;
    }
    public int getMP(){
        return this.m_MP;
    }
    public int getVP(){
        return this.m_VP;
    }
    public int getDP(){
        return this.m_DP;
    }
}
