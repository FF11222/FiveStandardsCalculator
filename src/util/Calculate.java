package util;

import entity.Student;

import java.util.*;

public class Calculate {
    public static Map<String, List<Float>> fiveStandards(List<Student> studentList){
        List<Integer> chinese = new ArrayList<>() ;
        List<Integer> english = new ArrayList<>();
        List<Integer> math = new ArrayList<>();
        List<Integer> social = new ArrayList<>();
        List<Integer> science = new ArrayList<>();


        for (Student student : studentList){
            chinese.add(student.getChineseScore());
            english.add(student.getEnglishScore());
            math.add(student.getMathScore());
            social.add(student.getSocialScore());
            science.add(student.getScienceScore());
        }

        Map<String, List<Float>> map = new HashMap<>();

        Collections.sort(chinese);
        map.put("Chinese", calStandard(chinese));
        Collections.sort(english);
        map.put("English", calStandard(english));
        Collections.sort(math);
        map.put("Math", calStandard(math));
        Collections.sort(social);
        map.put("Social", calStandard(social));
        Collections.sort(science);
        map.put("Science", calStandard(science));

        return map;
    }

    private static List<Float> calStandard(List<Integer> scoreList){

        int size = scoreList.size();
        float[] standard = new float[5];
        for (int i = 1; i < 6; i++) {
            switch (i){
                case 1:
                    if (0.88 * (size + 1) % 100 == 0) {
                        standard[i-1] = scoreList.get((int) (size * 0.88));
                    } else {
                        standard[i-1] = (scoreList.get((int) (size * 0.88)) + scoreList.get((int) (size * 0.88) + 1)) / 2;
                    }
                    break;
                case 2:
                    if (0.75 * (size + 1) % 100 == 0) {
                        standard[i-1] = scoreList.get((int) (size * 0.75));
                    } else {
                        standard[i-1] = (scoreList.get((int) (size * 0.75)) + scoreList.get((int) (size * 0.75) + 1)) / 2;
                    }
                    break;
                case 3:
                    if (0.50 * (size + 1) % 100 == 0) {
                        standard[i-1] = scoreList.get((int) (size * 0.50));
                    } else {
                        standard[i-1] = (scoreList.get((int) (size * 0.50)) + scoreList.get((int) (size * 0.50) + 1)) / 2;
                    }
                    break;
                case 4:
                    if (0.25 * (size + 1) % 100 == 0) {
                        standard[i-1] = scoreList.get((int) (size * 0.25));
                    } else {
                        standard[i-1] = (scoreList.get((int) (size * 0.25)) + scoreList.get((int) (size * 0.25) + 1)) / 2;
                    }
                    break;
                case 5:
                    if (0.12 * (size + 1) % 100 == 0) {
                        standard[i-1] = scoreList.get((int) (size * 0.12));
                    } else {
                        standard[i-1] = (scoreList.get((int) (size * 0.12)) + scoreList.get((int) (size * 0.12) + 1)) / 2;
                    }
                    break;
                default:
                    standard[i-1] = 0F;
                    break;
            }
        }

        List<Float> fiveStandards = new ArrayList<>();
        for (int i = 0; i < standard.length; i++) {
            fiveStandards.add(standard[i]);
        }

        return fiveStandards;
    }


}
