package Practice5;

public class Pro01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("\b]");
    }
}
