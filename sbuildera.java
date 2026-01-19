import java.util.*;
public class sbuildera {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Anubhav");
    System.out.println(sb);
    
    sb.insert(0, 'A');
    System.out.println(sb);

    // delete the extra 'A'/

    sb.delete(0, 1);
    System.out.println(sb);

    }
    
}
