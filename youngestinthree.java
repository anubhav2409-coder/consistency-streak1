import java.util.*;
public class youngestinthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age of ram: ");
        int a = sc.nextInt();
        System.out.println("Age of shyam: ");
         int b = sc.nextInt();
         System.out.println("Age of ramesh: ");
          int c = sc.nextInt();
          if(a<b){
            if(a<c){
                System.out.println("Ram is youngest" + " " + a);
            }else{
                System.out.println("ramesh is youngest" + " " + c);
            }
          }else{
            if(b<c){
                System.out.println("Shyam is youngest" + " " + b);
            }else{
                System.out.println("Ramesh is youngest" + " " + c);
            }
          }
    }
    
}
