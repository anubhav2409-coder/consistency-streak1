import java.util.*;
public class radiusofacircle {
    public static void main(String[] args) {

        //co-ordinates of the center of the circle 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        System.out.print("Enter the x ordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y ordinate: ");
        int y = sc.nextInt();

        //co-ordinates of the point

        System.out.print("Enter the x1 ordinate: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the y1 ordinates");
        int y1 = sc.nextInt();

        int z = (x - x1) + (y - y1);

        if(z*z>r){
            System.out.println("point lies outside the circle");
        }else if((z*z)<r){
            System.out.println("point lies inside the circle");
        }else{
            System.out.println("lies on the circle");
        }
    }
    
}
