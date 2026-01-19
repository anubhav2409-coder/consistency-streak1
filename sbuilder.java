import java.util.*;
public class sbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Anubhav");
        System.out.println(sb);

        // char at index 0

        System.out.println(sb.charAt(0));

        // set at index 0

        sb.setCharAt(0, 'p');
        System.out.println(sb);
    
    }
    
}
