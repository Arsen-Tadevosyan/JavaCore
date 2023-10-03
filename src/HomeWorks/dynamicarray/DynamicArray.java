package HomeWorks.dynamicarray;


public class DynamicArray {

    private int[] array = new int[10];
    private int size;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("error");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);
//        for (int i = 0; i < size; i++) {
//            tmp[i] = array[i];
//        }
        array = tmp;
    }

    int getbyindex(int index) {
        if (index < 0 || index > size) {
            System.out.println("error");
            return 0;
        }
        return array[index];
    }

    public void deleteBylndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("error");
            return;
        }
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    void set(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("error");
            return;
        }
        array[index] = value;
    }

    boolean exists(int valeu) {
        for (int i = 0; i < size; i++) {
            if (array[i] == array[valeu]) {
                return true;
            }
        }
        return false;
    }

    int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    int getSize(){
        return size;
    }

}


