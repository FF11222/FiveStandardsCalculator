import entity.Student;
import util.Calculate;
import util.OutPutFile;
import util.ReadFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("檔案格式必須如下:\n名字 國文 英文 數學 社會 自然\n名字 國文 英文 數學 社會 自然\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入檔案路徑:");
        String path = scanner.nextLine();
        List<Student> studentList = ReadFile.readFile(path);
        Map<String, List<Float>> map = Calculate.fiveStandards(studentList);
        OutPutFile.outPutFile(studentList, map);
        scanner.close();
    }
}