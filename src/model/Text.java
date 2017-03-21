
package model;

/**
 *
 * @author Nick
 */
public class Text {
    private String[] sentenceSegments;
    private String[] tokens;
    private String[] tokensWithoutStopWords;
    private String[] sentenceSegments_replaced;

    public String[] getSentenceSegments() {
        return sentenceSegments;
    }

    public void setSentenceSegments(String[] sentenceSegments) {
        this.sentenceSegments = sentenceSegments;
    }

    public String[] getTokens() {
        return tokens;
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

    public String[] getTokensWithoutStopWords() {
        return tokensWithoutStopWords;
    }

    public void setTokensWithoutStopWords(String[] tokensWithoutStopWords) {
        this.tokensWithoutStopWords = tokensWithoutStopWords;
    }

    public String[] getSentenceSegments_replaced() {
        return sentenceSegments_replaced;
    }

    public void setSentenceSegments_replaced(String[] sentenceSegments_replaced) {
        this.sentenceSegments_replaced = sentenceSegments_replaced;
    }
    
    
    
    
    
    
    
}
