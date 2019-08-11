package com.company.util.save;

import com.company.gameobjects.Entity;
import com.company.gameobjects.Player;

import java.io.Serializable;

public class SaveSlot implements Serializable {
    private Player m_player;
    private String m_location;

    public SaveSlot(Player player, String location){
        this.m_player = player;
        this.m_location = location;
    }
}
