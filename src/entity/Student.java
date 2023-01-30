package entity;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int chineseScore;
    private int englishScore;
    private int mathScore;
    private int socialScore;
    private int scienceScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                ", socialScore=" + socialScore +
                ", scienceScore=" + scienceScore +
                ", ";
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getSocialScore() {
        return socialScore;
    }

    public void setSocialScore(int socialScore) {
        this.socialScore = socialScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }

}
