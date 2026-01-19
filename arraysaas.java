import java.util.*;
public class arraysaas {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
    
        int numbers[] = new int[size];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        
        // numbers.length = size

        for(int i=0; i<size; i++ ){
            if(numbers[i]==x){
               System.out.println("x found at index : " + i);
            }

        }

    }
    
}
