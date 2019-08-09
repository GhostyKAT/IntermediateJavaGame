package com.company.util;

import java.io.BufferedReader;

public class DialogueEngine {
    public static String yOrN(String prompt, BufferedReader reader) {
        String result;
        String anwser = "";
        try {
            do {
                System.out.print(prompt);
                System.out.flush();
                anwser = reader.readLine();

                System.out.print("Are You Sure? (Y/N) ");
                result = reader.readLine();

                result = result.toUpperCase();
                while (!result.equals("Y") && !result.equals("N")) {
                    System.out.println("That is not allowed.");
                    System.out.print("Are You Sure? (Y/N) ");
                    result = reader.readLine();
                    result = result.toUpperCase();
                }
            } while (!result.equals("Y"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return anwser;
    }

    public static int getNumInRange(String prompt, BufferedReader reader, int min, int max) {
        Integer numResult = null;
        String yOrNResult;
        try {
            while(true) {
                System.out.print(prompt);
                System.out.flush();
                numResult = Integer.parseInt(reader.readLine());
                if(numResult >= min && numResult <= max) {

                    System.out.print("Are You Sure? (Y/N) ");
                    yOrNResult = reader.readLine().toUpperCase();

                    while (!yOrNResult.equals("Y") && !yOrNResult.equals("N")) {
                        System.out.println("That is not allowed.");
                        System.out.print("Are You Sure? (Y/N) ");
                        yOrNResult = reader.readLine();
                        yOrNResult = yOrNResult.toUpperCase();

                    }
                    if(yOrNResult.equals("N")) {
                        numResult = null;
                    }
                }
                if(numResult != null) {
                    if(numResult >= min && numResult <= max) {
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return numResult;
    }
}
