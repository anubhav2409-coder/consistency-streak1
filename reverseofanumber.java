import java.util.*;
public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        // int originalnum=n;
        // int sum=rev+originalnum;
        while(n !=0){
            int LastDigit = n%10;
            rev*=10;
            rev+=LastDigit;
            n/=10;
        }
        System.out.print("reverse number is: "+rev);
    }
    
}
