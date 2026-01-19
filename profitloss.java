import java.util.*;
public class profitloss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Your profit is: ");
            int profit = sp - cp;
            System.out.println(profit);

        }else{
            System.out.println("your loss is: ");
            int loss = cp - sp;
            System.out.println(loss);
        }
    }
    
}
