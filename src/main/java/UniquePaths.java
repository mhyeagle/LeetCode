public class UniquePaths {
    public static void main(String[] args) {
        int total = uniquePaths(3, 7);
        System.out.print(total);
    }

    public static int uniquePaths(int m, int n) {
        int[][] cube = new int[m][n];
        for (int i = 0; i < n; i++) {
            cube[0][i] = 1;
        }

        for (int j = 0; j < m; j++) {
            cube[j][0] = 1;
        }

        for (int k = 1; k < m; k++) {
            for (int h = 1; h < n; h++) {
                cube[k][h] = cube[k - 1][h] + cube[k][h - 1];
            }
        }

        return cube[m - 1][n - 1];
    }
}
