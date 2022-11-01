public class Revision65 {
    public static int countPaths(int p, int q, int n, int m) {
        if (p == n-1 && q == m-1) return 1;
        if (p==n) return 0;
        if (q==m) return 0;
        // right
        int right = countPaths(p,q+1,n,m);
        // down
        int down = countPaths(p+1,q,n,m);
        return right+down;
    }
    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3, 4));
    }
}
