package DadosCadastrais;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia de pessoas: \n ");

        int n = sc.nextInt();
        Cadastro[] vetor = new Cadastro[n];

        for(int i = 0;i < n;i++){
            sc.nextLine();

            System.out.printf("Dados da %da pessoa\n",i + 1);
            System.out.print("Nome : ");
            String nome  = sc.nextLine();

            System.out.print("Idade : ");
            int idade = sc.nextInt();

            System.out.print("Altura : ");
            double altura = sc.nextDouble();
            vetor[i] = new Cadastro(nome,idade,altura);

        }
        System.out.println();
        System.out.print("Altura média : ");
        double soma = 0;
        double alturaMed = 0;
        for(int i = 0 ;i < n; i ++){
            soma = soma + vetor[i].getAltura();
            alturaMed = soma / n;

        }
        System.out.print(alturaMed);
        System.out.println();
        System.out.println("Menor de idade : ");
        double nMenores = 0;
        for(int i = 0;i < n;i++){
            if(vetor[i].getIdade() < 18){
                nMenores ++;
                System.out.printf("%s\n",vetor[i].getNome());


            }

        }
        double media = nMenores / n;
        System.out.print("Menores : " + media * 100+"%");
        sc.close();
    }
}


