import java.util.*;
public class towdigitnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n>10 && n<99){
            System.out.println("This is a two digit number");
        }else{
            System.out.println("this not a two digit number");
        }

    }
    
}
