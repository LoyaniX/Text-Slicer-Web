package com.loyanix.Beans;

import java.io.Serializable;

public class LineInfo implements Serializable {

    private int lineId;
    private int fileId;
    private String longestWord;
    private int lengthOfLongestWord;
    private String shortestWord;
    private int lengthOfShortestWord;
    private int avgLengthWord;
    private int lengthLine;
    private FileInfo fileInfo;

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public LineInfo() {
    }

    public LineInfo(int lineId, int fileId, String longestWord, int lengthOfLongestWord, String shortestWord, int lengthOfShortestWord, int avgLengthWord, int lengthLine) {
        this.lineId = lineId;
        this.fileId = fileId;
        this.longestWord = longestWord;
        this.lengthOfLongestWord = lengthOfLongestWord;
        this.shortestWord = shortestWord;
        this.lengthOfShortestWord = lengthOfShortestWord;
        this.avgLengthWord = avgLengthWord;
        this.lengthLine = lengthLine;
    }

    public int getLineId() { return lineId; }

    public void setLineId(int lineId) { this.lineId = lineId; }

    public int getFileId() { return fileId; }

    public void setFileId(int fileId) { this.fileId = fileId; }

    public String getLongestWord() { return longestWord; }

    public void setLongestWord(String longestWord) { this.longestWord = longestWord; }

    public int getLengthOfLongestWord() { return lengthOfLongestWord; }

    public void setLengthOfLongestWord(int lengthOfLongestWord) { this.lengthOfLongestWord = lengthOfLongestWord; }

    public String getShortestWord() { return shortestWord; }

    public void setShortestWord(String shortestWord) { this.shortestWord = shortestWord; }

    public int getLengthOfShortestWord() { return lengthOfShortestWord; }

    public void setLengthOfShortestWord(int lengthOfShortestWord) { this.lengthOfShortestWord = lengthOfShortestWord; }

    public int getAvgLengthWord() { return avgLengthWord; }

    public void setAvgLengthWord(int avgLengthWord) { this.avgLengthWord = avgLengthWord; }

    public int getLengthLine() { return lengthLine; }

    public void setLengthLine(int lengthLine) { this.lengthLine = lengthLine; }

    public FileInfo getFileInfo() {
        return fileInfo;
    }
}
