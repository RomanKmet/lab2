public class task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        if(a>b)
            if(a>c)
                System.out.println(a);
            else {
                if(b>c)
                    System.out.println(b);
            }else {
            System.out.println(c);
        }
    }
}
