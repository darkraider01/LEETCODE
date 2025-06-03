public class LT118 {
    static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            long ans = 1;

            // Print spaces for formatting (optional)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(ans + "   ");
                ans = ans * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
