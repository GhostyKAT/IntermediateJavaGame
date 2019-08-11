package com.company;

import com.company.util.DialogueEngine;
import com.company.util.save.SaveSlot;
import com.company.util.save.SaveSlotManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Ben's RPG 2.0!");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int numSlot = DialogueEngine.getNumInRange("Please select your current save slot!", bufferedReader, 0, 2);
        SaveSlotManager.getInstance().setCurrentSaveSlot(numSlot);
    }
}
