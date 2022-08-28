public class RevisionInvite {
    public static int inviteN(int n) {
        if (n <= 1)
            return 1;
        // single
        int sin = inviteN(n - 1);
        // pair
        int pair = (n - 1) * inviteN(n - 2);
        return sin + pair;
    }

    public static void main(String[] args) {
        System.out.println(inviteN(4));
    }
}
