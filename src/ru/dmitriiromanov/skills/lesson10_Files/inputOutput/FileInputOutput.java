package src.learnGubin.lesson10_files.inputOutput;

import java.io.*;

public class FileInputOutput {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            String[] num = new String[0];
            int countSum = 0;
            while ((line = reader.readLine()) != null) {
                num = line.split(" ");
            }
            for (int i = 0; i < num.length; i++) {
                countSum += Integer.parseInt(num[i]);
            }

            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(countSum);
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
