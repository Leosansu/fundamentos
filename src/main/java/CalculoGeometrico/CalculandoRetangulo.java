package CalculoGeometrico;

import java.util.Scanner;

public class CalculandoRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo ret1 = new Retangulo();
        System.out.println("Digite a largura e altura do retângulo : ");
        ret1.largura = sc.nextDouble();
        ret1.altura = sc.nextDouble();

        System.out.printf("Área = %.2f%n", ret1.area());
        System.out.printf("Perímetro = %.2f%n", ret1.perimetro());
        System.out.printf("Diagonal = %.2f%n", ret1.diagonal());


        System.out.println(ret1);

        sc.close();
    }
}


