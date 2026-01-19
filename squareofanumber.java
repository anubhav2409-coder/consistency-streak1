import java.util.Scanner;
public class squareofanumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
         x = x * x;
        System.out.print("Square of the number is: " + x);
        
    }
    
}
