import java.util.*;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int x = sc.nextInt();
        if(x%4==0){
            System.out.println("yes, it is a leap year");
        }else{
            System.out.println("it is not a leap year");
        }
    }
    
}
