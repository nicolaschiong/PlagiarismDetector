package process;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Nick on 9/3/2016.
 */
public class Tokenizer {
    
    public String[] initSentenceSegmention(String text){
        System.out.println("Initializing Sentence Segmention");
        String delimiters = ".?!"; 
      
        return tokenize(text, delimiters);
        
    }
    
    public String [] initTokenization(String text){
        System.out.println("Initializing Tokenization");
        String delimiters = ",.?<>?;':[]{}-=_+\" ";
        
        return tokenize (text, delimiters);
    }
    public String[] tokenize (String full_text, String delimeter, String[] text){
        int counter = 0;
        StringTokenizer st = new StringTokenizer(full_text, delimeter);
        while (st.hasMoreTokens()) {
            //System.out.println(st.nextToken());
            text[counter] = st.nextToken().toLowerCase();
            System.out.println("token[" + counter + "] = " + text[counter]);
            counter++;
        }
        return text;
    }
    
    public String[] tokenize (String full_text, String delimeter){
        
        int counter = 0;
        StringTokenizer st = new StringTokenizer(full_text, delimeter);
        
        int counts = st.countTokens();
        //System.out.println("Counts: " + counts);
        
        String[] text = new String[counts];
        while (st.hasMoreTokens()) {
            //System.out.println(st.nextToken());
            text[counter] = st.nextToken().toLowerCase();
            //System.out.println("token[" + counter + "] = " + text[counter]);
            counter++;
        }
        return text;
    }
    
    public String[] listTokens(String text, String delimiter){
        StringTokenizer multiTokenizer = new StringTokenizer(text, delimiter);
        int tokenCount = multiTokenizer.countTokens();
        String [] list = new String[tokenCount];

        int counter = 0;
        while (multiTokenizer.hasMoreTokens())
        {
            list[counter] = multiTokenizer.nextToken().toLowerCase();
            counter++;
        }

        return list;
    }
    
    public String[] alphaSort(ArrayList <String> wordList) {
        String[] alphaList = new String[wordList.size()];
        int count = 0;
        while(count < wordList.size()) {
            alphaList[count] = wordList.get(count);
            count++;
        }
        int shortestStringIndex;
        for(int j = 0; j < alphaList.length - 1; j++) {
            shortestStringIndex = j;
            for(int i = j + 1; i < alphaList.length; i++) {
                if(alphaList[i].trim().compareTo(alphaList[shortestStringIndex].trim()) < 0) {
                    shortestStringIndex = i;
                }
            }
            if(shortestStringIndex != j) {
                String temp = alphaList[j];
                alphaList[j] = alphaList[shortestStringIndex];
                alphaList[shortestStringIndex]= temp;
            }
        }
        count = 0;
       

        return alphaList;
    }

}
