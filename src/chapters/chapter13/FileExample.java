package chapters.chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\test\\asdf.txt";
        String newfilePath = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\test\\folder1\\1234\\a";

        File file = new File(newfilePath);


//
//        File file = new File(newfilePath);
//        System.out.println(file);
//        if ( !file.exists()) {
//            System.out.println(file.mkdirs());
//        }


//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("deleted");
//            }
//        }


//        if (!file.exists()) {
//
//            try {
//                file.createNewFile();
//                System.out.println("file created");
//            } catch (IOException e) {
//                System.out.println("can not create file" + e);
//            }
//        }else {
//            System.out.println("file not created!");
//        }
//

//        if (file.isDirectory()) {
//            File[] list = file.listFiles();
//            for (File f : list) {
//                if (f.isFile()) {
//                    System.out.println(f.getName() + " " + f.length() + " " + new Date(f.lastModified()));
//                }
//            }
//        }

    }
}
