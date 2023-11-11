package homework.fileUtil;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        contentSearch();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("please input folder path");
        String directoryPath = scanner.nextLine();
        System.out.println("please input file name ");
        String fileName = scanner.nextLine();
        String filePath = directoryPath + File.separator + fileName;
        File file = new File(filePath);
        System.out.println(file.exists());
    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
//    // 1 - path թե որ ֆոլդերում ենք փնտրելու
//    // 2 - keyword - ինչ որ բառ
//    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
//    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input folder path");
        String directoryPath = scanner.nextLine();
        System.out.println("please input keyword ");
        String keyword = scanner.nextLine();
        File file = new File(directoryPath);
        if (!file.isDirectory()) {
            return;
        }
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().contains("txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(files[i].getAbsolutePath()))) {
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(files[i].getName());
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
//    // 1 - txtPath txt ֆայլի փաթը
//    // 2 - keyword - ինչ որ բառ
//    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input file path");
        String directoryPath = scanner.nextLine();
        System.out.println("please input keyword ");
        String keyword = scanner.nextLine();
        File file = new File(directoryPath);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().contains("txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(files[i].getAbsolutePath()))) {
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(line);
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
//    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
//    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (!file.isDirectory()) {
            System.out.println("it is a folder");
            return;
        }
        File[] files = file.listFiles();
        long length = 0;
        for (int i = 0; i < files.length; i++) {
            length += files[i].length();
        }
        System.out.println(length);
    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
//    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
//    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
//    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
//    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input folder path");
        String folder = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        File file = new File(folder + File.separator + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("file created");
            } catch (IOException e) {
                System.out.println("can not create file" + e);
            }
        } else {
            System.out.println("file not created!");
        }
        System.out.println("please input content ");
        String content = scanner.nextLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(content);
    }
}
