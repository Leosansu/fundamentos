package NotasAluno;

import java.util.Scanner;

public class BoletimEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante aluno = new Estudante();

        System.out.print("Nome : ");
        aluno.nome = sc.nextLine();

        aluno.nota1 = sc.nextInt();
        aluno.nota2 = sc.nextInt();
        aluno.nota3 = sc.nextInt();

        System.out.print("Nota final : " + aluno.notaFinal());
        System.out.println();
        aluno.seFinal();


        sc.close();
    }
}
