package homework.fileUtil;

import javax.swing.*;
import java.io.File;
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
        String[] list = file.list();
        File[] files = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (list[i].contains("txt")){
                for (int j = 0; j < files.length; j++) {
                    //if (files[i].i)
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

    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
//    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
//    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {

    }

    //
//    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
//    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
//    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
//    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
//    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

    }
}
