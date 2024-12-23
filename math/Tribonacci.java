package math;

class Tribonacci {
    static void tribo(int n){
        int a = 0;
        int b = 1;
        int c = 2;
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }

    public static void main(String[] args) {
        tribo(10);
    }
}
