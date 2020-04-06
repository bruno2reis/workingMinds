public class workingTest2 {
    static void spiralAll(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x;

                x = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));

                if (i <= j)
                    System.out.print((n - 2 * x) * (n - 2 * x) - (i - x) - (j - x) + "\t");
                else
                    System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        spiralAll(n);
    }

}