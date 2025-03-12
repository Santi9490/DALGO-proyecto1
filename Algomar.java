import java.util.*;

public class Algomar {

    private static int calcularMinimo(int[][] elementos, int j, int m) {
        int[][] dp = new int[j + 1][m + 1];
        for (int[] fila : dp){
             Arrays.fill(fila, Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;

        for (int[] elem : elementos) {
            int valor = elem[0];
            int indice = elem[1];
            for (int k = j; k >= 1; k--) {
                for (int s = m; s >= 0; s--) {
                    int costo = indice - (k - 1);
                    if (costo < 0){
                        continue;
                    }
                    if (s >= costo && dp[k - 1][s - costo] != Integer.MAX_VALUE / 2) {
                        dp[k][s] = Math.min(dp[k][s], dp[k - 1][s - costo] + valor);
                    }
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int s = 0; s <= m; s++) {
            minSum = Math.min(minSum, dp[j][s]);
        }
        return minSum;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int m = sc.nextInt();
            int[][] elementos = new int[n][2];
            for (int i = 0; i < n; i++) {
                elementos[i][0] = sc.nextInt();
                elementos[i][1] = i;            
            }
            System.out.println(calcularMinimo(elementos, j, m));
        }
        sc.close();
    }
}

