public class Main {

    public static void getPermutations(int n, int numClosed, int numOpen, String result) {
        if (numClosed == n) {
            System.out.println(result);
            return;
        }

        if (numOpen < n) {
            getPermutations(n, numClosed, numOpen + 1, result + "(");
        }

        if (numOpen > numClosed) {
            getPermutations(n, numClosed + 1, numOpen, result + ")");
        }
    }

    public static void main(String[] args) {
        getPermutations(4, 0, 1, "(");
    }
}
