package com.jlmd.simpleneuralnetwork.neuralnetwork.parser.result;

/**
 * Binary implementation of result parser
 * @author jlmd
 */
public class BinaryResultParser implements IResultParser<Integer> {
    @Override
    public int countSuccesses(int success, float fOut, float t){
        //if ((fOut > 0 && fOut  <= 0.02  && t > 0 && t <= 0.02) || (fOut >= 0.03 && fOut  < 0.05  && t >= 0.03 && t < 0.05) ||  (fOut >= 0.06 && fOut  < 0.08  && t >= 0.06 && t < 0.08) ||  (fOut >= 0.09 && fOut  < 0.1  && t >= 0.09 && t < 0.1) ||  (fOut >= 0.1 && fOut  < 0.2  && t >= 0.1 && t < 0.2) ||  (fOut >= 0.2 && fOut  <= 0.3  && t >= 0.2 && t <= 0.3) ||  (fOut >= 0.4 && fOut  <= 0.5  && t >= 0.4 && t <= 0.5) ||  (fOut >= 0.6 && fOut  <= 0.7  && t >= 0.6 && t <= 0.7) ||  (fOut >= 0.8 && fOut  <= 0.9  && t >= 0.8 && t <= 0.9) ||  (fOut > 0.9 && fOut  <= 1  && t > 0.9 && t <= 1))     
      // if ((fOut < 0.1 && t <= 0.1) || (fOut > 0.1 && t <= 0.2) || (fOut > 0.2 && t <= 0.3) || (fOut > 0.3 && t <= 0.4) || (fOut > 0.4 && t <= 0.5)|| (fOut > 0.5 && t <= 0.6) || (fOut > 0.6 && t <= 0.7)|| (fOut > 0.7 && t <= 0.8) || (fOut > 0.8 && t <= 0.9)|| (fOut > 0.9 && t <= 1))
            //if ((fOut < 0.5 && t <= 0.5) || (fOut > 0.5 && t > 0.5) )
            if ((fOut < 0.1 && fOut <= 0.1  && t <= 0.1) || (fOut > 0.1 && fOut <= 0.2 && t <= 0.2) || (fOut > 0.2 && fOut <= 0.3 && t <= 0.3) || (fOut > 0.3 && fOut <= 0.4 && t <= 0.4) || (fOut > 0.4 && fOut <= 0.5 && t <= 0.5)|| (fOut > 0.5 && fOut <= 0.6 && t <= 0.6) || (fOut > 0.6 && fOut <= 0.7 && t <= 0.7)|| (fOut > 0.7 && fOut <= 0.8 && t <= 0.8) || (fOut > 0.8 && fOut <= 0.9 && t <= 0.9)|| (fOut > 0.9 && fOut <= 1 && t <= 1))
        //for(success+=1; success==100; success++){
            success += 1;            
        
        return success;
    }
    
    @Override
    public Integer parseResult(float result) {
        return (result < 0.5) ? 0 : 1;
    }
}
