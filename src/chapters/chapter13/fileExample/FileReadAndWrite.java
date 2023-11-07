package chapters.chapter13.fileExample;

import java.io.*;

public class FileReadAndWrite {

    public static final String FILE_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\fileExample\\example.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    public static void write() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.close();
    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {

        }
    }
}
