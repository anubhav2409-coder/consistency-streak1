import java.util.*;
public class absolutevalue {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0){
            x = x * (-1);
        }
        System.out.println("Absolute of x is: "+x);


    }
    
}
