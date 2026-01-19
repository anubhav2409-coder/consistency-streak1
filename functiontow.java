import java.util.*;
public class functiontow {
    public static int  CalculateSum(int a, int b) {
        int add = a + b;
        
         
        return add;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int b = sc.nextInt();

       int sum = CalculateSum(a, b);
       System.out.println("sum of tow numbers is : "+ sum);
        
    }
    
}
