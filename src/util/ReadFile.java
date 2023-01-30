package util;

import entity.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Student> readFile(String path) {

        List<Student> students = new ArrayList<>();
        try {
            List<String> lineText = Files.lines(Paths.get(path)).toList();
            for (String line : lineText) {
                Student student = new Student();
                String[] data = line.split(" ");

                student.setName(data[0]);
                student.setChineseScore(Integer.parseInt(data[1]));
                student.setEnglishScore(Integer.parseInt(data[2]));
                student.setMathScore(Integer.parseInt(data[3]));
                student.setSocialScore(Integer.parseInt(data[4]));
                student.setScienceScore(Integer.parseInt(data[5]));
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
