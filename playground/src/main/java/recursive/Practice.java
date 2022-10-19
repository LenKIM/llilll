package recursive;

public class Practice {

    public static void main(String[] args) {

        System.out.println(func(3, 5, 1));;
    }

    public static long func(int a, int b, int m) {
        long val = 1;
        while (b-- != 0){
            val *= a;
        }
        return val % m;

    }
}
