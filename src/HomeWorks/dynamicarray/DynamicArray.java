package HomeWorks.dynamicarray;


public class DynamicArray {

    int[] array = new int[10];
    int size;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    int getbyindex(int index) {
        if (index < 0 || index > size) {
            System.out.println("error");
            return 0;
        }
        return array[index];
    }
}


