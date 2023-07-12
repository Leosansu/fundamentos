package NotasAluno;

public class Estudante {

    public String nome;
    public int nota1;

    public int nota2;

    public int nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;

    }

    public void seFinal() {
        if (notaFinal() < 60) {
            System.out.print("Reprovado");
            System.out.println();
            System.out.print("Ainda resta : ");
            System.out.print(60 - notaFinal());
        }
        else {

            System.out.println("Aprovado");

        }
    }
}
