import java.util.*;
public class numberisdivisiblebythreeandfivebtnotfifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        if(n%15!=0 &&(n%5==0 || n%3==0)){
            System.out.println("The number is divisible by 3 and 5 but not by 15");
        }
        else{
            System.out.println("Not matching the required condition");
        }
    }
    
}
