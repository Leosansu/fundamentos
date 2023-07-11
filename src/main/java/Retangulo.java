public class Retangulo {
    public double largura;

    public double altura;

    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return 2 * (largura + altura);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(largura , 2)+(Math.pow(altura, 2)));
    }
    public String toString(){
        return "Retângulo : "
                +largura
                + " , "
                +altura
                +" , "
                +"Àrea : "
                +String.format("%.2f , ", area())
                +" Perímetro : "
                +String.format("%.2f , ",perimetro())
                +" Diadonal : "
                +String.format("%.2f.",diagonal());

    }
}

