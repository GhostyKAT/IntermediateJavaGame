package com.company.gameobjects;

public class Player extends Entity {
    private int m_MP, m_VP, m_DP;
    private static Player instance;
    public static void load(int HP, int AP, int MP, int VP, int DP, Status status){
        instance = new Player(HP, AP, MP, VP, DP, status);
    }

    public static Player getInstance(){
        return instance;
    }

    private Player(int HP, int AP, int MP, int VP, int DP, Status status){
        super(HP, AP, status);
        this.m_MP = MP;
        this.m_VP = VP;
        this.m_DP = DP;
    }

    @Override
    public void inflict(double infliction, Status status){
        if(status != Status.ASLEEP){
            this.m_status = status;
        }
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
