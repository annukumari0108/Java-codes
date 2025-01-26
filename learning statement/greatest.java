public class greatest {
    public static void main(String[] args) {
        int a = 20, b = 44, c = 50;
        if (a > b) {
            if (a > c)
                System.out.print(a);
            else
                System.out.print(c);
        } else {
            if (b > c)
                System.out.print(b);
            else
                System.out.print(c);
        }
    }
}
