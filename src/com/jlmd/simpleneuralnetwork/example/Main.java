package com.jlmd.simpleneuralnetwork.example;

import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Result;
import com.jlmd.simpleneuralnetwork.neuralnetwork.utils.DataUtils;
import com.jlmd.simpleneuralnetwork.neuralnetwork.NeuralNetwork;
import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Error;
import com.jlmd.simpleneuralnetwork.neuralnetwork.callback.INeuralNetworkCallback;

/**
 * @author jlmd
 */
public class Main {
    public static void main(String [] args){
        
        System.out.println("Starting neural network sample... ");

        int[][] x = DataUtils.readInputsFromFile("E:\\Final Project\\House\\info15.txt");
        float[] t = DataUtils.readOutputsFromFile("E:\\Final Project\\House\\price8.txt");
        //float[] TDATA = DataUtils.readOutputsFromFile("E:\\Final Project\\House\\t6.txt");
        
        /*GradientDescent gd = new GradientDescent(0,0);
        gd.train(0.00001,t);
        System.out.println("THETA0: " + gd.getTheta0() + " - THETA1: " + gd.getTheta1());
        System.out.println("PREDICTION: " + gd.getHypothesisResult(300));*/
             

        NeuralNetwork neuralNetwork = new NeuralNetwork(x, t, new INeuralNetworkCallback() {
            @Override
            public void success(Result result) {
                float[] valueToPredict = new float[] {2,2,46,1,1,2,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,0,0,28,30,28,27};
                System.out.println("Success percentage: " + result.getSuccessPercentage());
                System.out.println("Predicted result: " + result.predictValue(valueToPredict));
                System.out.println("Predicted price: " + result.predictValue(valueToPredict)*280);
            }

            
            @Override
            public void failure(Error error) {
                System.out.println("Error: " + error.getDescription());
            }
        });

        
        neuralNetwork.startLearning();
}
}
