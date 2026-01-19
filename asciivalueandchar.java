import java.util.*;
public class asciivalueandchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=65;
        while(n>=i){
            System.out.println(i+" "+(char)i);
            i++;

        }
    }
    
}
