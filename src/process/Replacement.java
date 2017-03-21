/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

/**
 *
 * @author Nick
 */
public class Replacement {
   
    public String[] replace(String[] sentenceSegments){
        String [] numberReplacement_Processed = new String[sentenceSegments.length];
        for(int i = 0; i < sentenceSegments.length; i++){
            String temp = sentenceSegments[i];
            
            temp = temp.replaceAll("zero", "0");
            temp = temp.replaceAll("one", "1");
            temp = temp.replaceAll("two", "2");
            temp = temp.replaceAll("three", "3");
            temp = temp.replaceAll("four", "4");
            temp = temp.replaceAll("five", "5");
            temp = temp.replaceAll("six", "6");
            temp = temp.replaceAll("seven", "7");
            temp = temp.replaceAll("eight", "8");
            temp = temp.replaceAll("nine", "9");
            
            temp = temp.replaceAll("\"", "");
            temp = temp.replaceAll(",", "");
            temp = temp.replaceAll("'", "");
            temp = temp.replaceAll("<", "");
            temp = temp.replaceAll(">", "");
            temp = temp.replaceAll(":", "");
            temp = temp.replaceAll(";", "");
            
            System.out.println(temp);
            numberReplacement_Processed[i] = temp;
        }
        
        return numberReplacement_Processed;
    }
    
    
}
