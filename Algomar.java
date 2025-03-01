import java.util.*;

public class Algomar {

    public static int menorPesoEnergetico(int n, int j, int m, int[] pesos) {
        
        
        int resultado = 0;
        

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int m = sc.nextInt();
            int[] pesos = new int[n];

            for (int i = 0; i < n; i++) {
                pesos[i] = sc.nextInt();
            }

            System.out.println(menorPesoEnergetico(n, j, m, pesos));
        }
        sc.close();
    }
}
