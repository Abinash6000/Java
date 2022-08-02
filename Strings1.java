import java.util.*;
public class Strings1 {
    public static void main(String args[]) {
        // Access characters of a string
        String firstName = "Tony";
        String secondName = "Stark";
        String fullName = firstName +" "+ secondName;
        for(int i = 0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        System.out.println();
        //Compare two Strings...
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else{
            System.out.println("They are differen tstrings");
        }
        String abc = "Abinash";
        System.out.println(abc.substring(3,7));

        // ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1);
        ////////// question 1
        // Take an array of Strings input from the user and find the cumulative (combined) length of all those things.
        // Scanner sc = new Scanner(System.in);
        // String[] arrayOfStr = new String[5];
        // for (int i = 0; i<5; i++) {
        //     System.out.println("Enter a String ");
        //     arrayOfStr[i]=sc.next();
        // }
        // String culmulativeString = "";
        // for (int i = 0; i<5; i++) {
        //     culmulativeString += arrayOfStr[i];
        // }
        // System.out.println(culmulativeString);
        // System.out.println();                       //// question 2
        // Scanner sc = new Scanner(System.in);
        // String newString = sc.next();
        // String result = "";
        // for (int i = 0; i<newString.length(); i++) {
        //     if(newString.charAt(i) != 'e') {
        //     result += newString.charAt(i);
        //     }else {
        //         result += "i";
        //     }
        // }
        // System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address : ");
        String email = sc.next();
        String username = "";
        for (int i = 0; i< email.length(); i++) {
            if(email.charAt(i)!= '@') {
                username += email.charAt(i);
            } else{
                break;
            }
        }
        System.out.println(username);
    }
}
