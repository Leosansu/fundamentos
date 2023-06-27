import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantia = sc.nextInt();
        double resultado = 0;

        if (codigo == 1) {
            resultado = 4 * quantia;
        } else if (codigo == 2) {
            resultado = 4.5 * quantia;
        } else if (codigo == 3) {
            resultado = 5.0 * quantia;
        } else if (codigo == 4) {
            resultado = 2.0 * quantia;
        } else if (codigo == 5) {
            resultado = 1.5 * quantia;
        }
        System.out.printf("Total: R$ %.2f%n", resultado);
        sc.close();
    }
}