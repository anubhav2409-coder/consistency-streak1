import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean flag = false;  //false means prime

        for(int i=2; i<n; i++){
            flag=true;
            break;
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
        else if(flag==false){
            System.out.println("number is prime");
        }else{
            System.out.println("number is composite");
        }
    }
    
}
