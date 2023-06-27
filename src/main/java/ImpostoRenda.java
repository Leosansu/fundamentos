import java.util.Locale;//programa calcula imposto de renda sobre o que excede a R$ 2000
import java.util.Scanner;

public class ImpostoRenda{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário:");
        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento de I.R");
        } else if (salario <= 3000) {
            double excedente = (salario - 2000);
            System.out.println("Excedente = R$ " + excedente);
            double impostoRenda = excedente * 0.08;
            System.out.printf("Seu imposto de renda = R$ %.2f", impostoRenda);
        }
        else if (salario < 4500) {
            double excedente = (salario - 2000);
            double impostoRenda = excedente * 0.18;
            System.out.printf("Seu imposto de renda = R$ %.2f ", impostoRenda);
        }
        else {
            double excedente = (salario - 2000);
            double impostoRenda = excedente * 0.28;
            System.out.printf("Seu imposto de renda = R$ %.2f", impostoRenda);


            sc.close();
        }
    }
}