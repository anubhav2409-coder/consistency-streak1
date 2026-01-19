import java.util.*;
public class remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter divisior: ");
        int b = sc.nextInt();
       int q = a/b;
       int r = a - (b * q);
       System.out.println("The value of remainder when " + a + " divided by " + b + " is " + r);
    }
    
}
