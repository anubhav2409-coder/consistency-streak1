import java.util.*;
public class sumofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
        int n=sc.nextInt();
        // int sum=0;

        int product=1;

        while(n!=0){
             int last_digit=n%10;
            if(last_digit==0){
                  n/=10;
                continue;
            }
            
            // sum+=last_digit;

            product*=last_digit;
            n/=10;
        }
        System.out.print("product of the no. is:" + product);
    }    
    
}
