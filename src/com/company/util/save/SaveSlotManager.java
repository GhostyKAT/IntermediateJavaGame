package com.company.util.save;

import com.company.gameobjects.Player;

import java.io.*;

public class SaveSlotManager {
    SaveSlot[] saveSlots = new SaveSlot[3];
    private static final SaveSlotManager INSTANCE = new SaveSlotManager("SaveSlots");
    private int m_currentSaveSlot;

    public void saveAll(String location){
        try{
            for(int i = 0; i < 3; i++){
                FileOutputStream fileOut = new FileOutputStream(location + "Slot" + Integer.toString(i + 1) + "scr");
                ObjectOutputStream obj = new ObjectOutputStream(fileOut);

                obj.writeObject(saveSlots[i]);
                fileOut.close();
                obj.close();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public void save(String location){
        try{
            FileOutputStream fileOut = new FileOutputStream(location + "Slot" + Integer.toString(this.m_currentSaveSlot) + ".scr");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);

            obj.writeObject(saveSlots[this.m_currentSaveSlot]);
            fileOut.close();
            obj.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public SaveSlotManager(String location){
        try{
            for(int i = 0; i < 3; i++){
                FileInputStream fileIn = new FileInputStream(location + "Slot" + Integer.toString(i + 1) + ".scr");
                ObjectInputStream obj = new ObjectInputStream(fileIn);

                saveSlots[i] = (SaveSlot) obj.readObject();
                System.out.println("Save Slot " + Integer.toString(i) + " Successfully Loaded!");
                fileIn.close();
                obj.close();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static SaveSlotManager getInstance(){
        return INSTANCE;
    }
}
