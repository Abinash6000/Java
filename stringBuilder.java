import java.util.*;

public class stringBuilder {
    public static void main(String args[]) {
        //Declaration
        StringBuilder sb = new StringBuilder("Apna College");
        System.out.println(sb);

        //Get a character from Index
        System.out.println(sb.charAt(0));

        // Set a character at Index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert a character at some index
        sb.insert(0, 'S');
        System.out.println(sb);

        //Delete char at some Index
        sb.delete(0,2);
        System.out.println(sb);

        //Append a char
        sb.append('A');
        System.out.println(sb);

        //Print length of string
        System.out.println(sb.length());

        //
    }
}
