import java.util.*;
public class divisiblebyfiveandthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("This number follow the condition");
        }
        else{
            System.out.println("This number cnt't follow the conditiom");
        }
    }
    
}
