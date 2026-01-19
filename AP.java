import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        // for(int i=4; i<=3*n+1; i+=3){
        //     System.out.print(i+" ");
        // }

        // int a=4, d=3;
        // for(int i=1; i<=n; i++){
        //     System.out.print(a+" ");
        //             a += d;
        // }

       // print 1 2 4 8 16 32 ...
       //GP
        int a=1, r=2;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");

            a *= r;
        }


    }
    
}
