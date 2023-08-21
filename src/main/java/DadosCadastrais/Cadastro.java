package DadosCadastrais;

public class Cadastro {
    private String nome;
    private int idade;
    private double altura;

    public Cadastro(String Nome, double Altura) {
        this.nome = Nome;
        this.altura = Altura;
    }

    public Cadastro(String Nome, int Idade, double Altura) {
        this.nome = Nome;
        this.idade = Idade;
        this.altura = Altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Nome : "
                + nome
                + "\nIdade : "
                + idade
                + " \n";


    }
}


