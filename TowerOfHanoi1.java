import java.util.*;
public class TowerOfHanoi1 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n==1){ 
            System.out.println("Transper disk "+n+" From "+src+" to "+dest); 
            return;}
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transper disk "+n+" From "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest); 
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S","H","D");
    }
}
