package com.loyanix.Beans;

import java.io.Serializable;
import java.util.List;

public class FileInfo implements Serializable {

    private int id;
    private String fileName;
    private String longestWord;
    private int lengthOfLongestWord;
    private String shortestWord;
    private int lengthOfShortestWord;
    private int avgLengthWord;
    private int avgLengthLine;
    private List<LineInfo> lineInfos;

    public FileInfo() {
    }

    public FileInfo(int id, String fileName, String longestWord, int lengthOfLongestWord, String shortestWord, int lengthOfShortestWord, int avgLengthWord, int avgLengthLine, List<LineInfo> lineInfos) {
        this.id = id;
        this.fileName = fileName;
        this.longestWord = longestWord;
        this.lengthOfLongestWord = lengthOfLongestWord;
        this.shortestWord = shortestWord;
        this.lengthOfShortestWord = lengthOfShortestWord;
        this.avgLengthWord = avgLengthWord;
        this.avgLengthLine = avgLengthLine;
        this.lineInfos = lineInfos;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

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

    public int getAvgLengthLine() { return avgLengthLine; }

    public void setAvgLengthLine(int avgLengthLine) { this.avgLengthLine = avgLengthLine; }

    public List<LineInfo> getLineInfos() { return lineInfos; }

    public void setLineInfos(List<LineInfo> lineInfos) { this.lineInfos = lineInfos; }
}
