package chapters.chapter10;

public class MyExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        try {
            System.out.println(a / 0);
        }catch (ArithmeticException e){
            System.out.println("");
        }


//        int[] numbers = {1, 3, 5};
//        try {
//            System.out.println(numbers[6]);
//            System.out.println("end of try block");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("catch block works!");
//        }
    }
}
