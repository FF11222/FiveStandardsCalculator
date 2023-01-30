package util;

import entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OutPutFile {
    public static void outPutFile(List<Student> studentList, Map<String, List<Float>> map) throws IOException {
        String outPut = "output.txt";
        BufferedWriter bf = new BufferedWriter(new FileWriter(outPut));

        for (Student student : studentList){
            float average = (student.getChineseScore()+student.getEnglishScore()+ student.getMathScore()+ student.getSocialScore()+ student.getSocialScore())/5;
            String studentScores = student+"average="+average+"}";
            bf.write(studentScores);
            bf.newLine();
        }

        Set<Map.Entry<String, List<Float>>> entrySet = map.entrySet();

        for (Map.Entry<String, List<Float>> entry : entrySet) {
            String key = entry.getKey();
            List<Float> value = entry.getValue();
            bf.write(key+": \n");

            int temp = 1;
            for (Float i : value) {
                switch (temp){
                case 1:
                    bf.write("\tTopStandard:"+i+"\n");
                    temp++;
                    break;
                case 2:
                    bf.write("\tFrontStandard:"+i+"\n");
                    temp++;
                    break;
                case 3:
                    bf.write("\tAverageStandard:"+i+"\n");
                    temp++;
                    break;
                case 4:
                    bf.write("\tBackStandard:"+i+"\n");
                    temp++;
                    break;
                case 5:
                    bf.write("\tBottomStandard:"+i+"\n");
                    temp++;
                    break;
                }
            }
        }
        bf.flush();
        bf.close();
    }
}
