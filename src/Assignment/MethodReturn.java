package Assignment;

public class MethodReturn {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(6, 8);
        System.out.println(z);  //OUTPUT 14
    }
}
