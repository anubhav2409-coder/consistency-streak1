import java.util.*;
public class pyramidbysecondmethod {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int nst=1;
        int nsp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" " );
            }for(int j=1; j<=nst; j++){
                System.out.print((char)(j+64)+" ");
               
            }
             nst +=2;
                nsp -=1;
            System.out.println();
        }
    }
}
