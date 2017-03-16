package com.jlmd.simpleneuralnetwork.neuralnetwork.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Utils for read external data and save it in memory
 * @author jlmd
 */
public class DataUtils {
    /**
     * Parse input txt data separated by "," in two-dimensional float array
     * @param fileURI
     * @return float[][] with data
     */
    public static int[][] readInputsFromFile(String fileURI){
        int[][] fArray = new int[0][];

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(fileURI), StandardCharsets.UTF_8);
            fArray = new int[lines.size()][];

            for(int i = 0; i<lines.size(); i++){
                fArray[i] = convertStringArrayToFloatArray(lines.get(i).split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       return fArray;
    }

    /**
     * Parse output txt data separated by "," in two-dimensional float array
     * @param fileURI
     * @return int[] with data
     */
    public static float[] readOutputsFromFile(String fileURI){
        float[] iArray = new float[0];

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(fileURI), StandardCharsets.UTF_8);
            iArray = new float[lines.size()];

            for(int i = 0; i<lines.size(); i++){
                iArray[i] = Float.parseFloat(lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return iArray;
    }

    /**
     * Convert array of strings to array of float
     * @param num Array of string
     * @return array of float
     */
    private static int[] convertStringArrayToFloatArray(String[] num){
        if (num != null) {
            int fArray[] = new int[num.length];
            for (int i = 0; i <num.length; i++) {
                fArray[i] = (int) Float.parseFloat(num[i]);
            }
            return fArray;
        }
        return null;
    }

}
