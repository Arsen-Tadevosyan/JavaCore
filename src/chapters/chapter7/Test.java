package chapters.chapter7;

public class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equaleTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

