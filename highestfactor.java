import java.util.*;
public class highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }

        //highest common factor


         int hf = 1;
        //  for(int i=1; i<n; i++){
        //     if(n%i==0){
        //          hf=i;
        //     }
        // }
        //  System.out.println(hf);

        for(int i=n-1; i>=1; i--){
            if(n%i==0){
                 hf=i;
                 break;
            }
        }
         System.out.println(hf);

    }

    }
    

