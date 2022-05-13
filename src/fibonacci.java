public class fibonacci {
    public static void fib(int n){
        int b = 0;
        int a = 1;
        int c;
        System.out.print(b + " ");
        System.out.print(a + " ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c +" ");
            b = a;
            a =c;
        }

    }

    public static void main(String[] args) {
        fib(10);
    }
}
