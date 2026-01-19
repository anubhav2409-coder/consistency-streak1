import java.util.*;
public class arraysq {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }

        int anubhav=numbers.length;
       //print the numbers in array
       for(int i=0; i<anubhav; i++) {
           System.out.println(numbers[i]);
       }
   }
}
