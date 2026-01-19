import java.util.*;
public class sumofevennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int LastDigit = n%10;
            if(LastDigit%2 == 0){
                n/=10;
                continue;
            }
            sum +=LastDigit;
            n/=10;
        }
        System.out.println("value of the sum of odd no. is: "+sum);
    }
    
}
