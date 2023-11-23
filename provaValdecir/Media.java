 import java.util.Scanner;
 public class Media {

    public static void main(String[] args ){
        double nota1 = 9.8;
        double nota2 = 6.5;
        double nota3 = 7.0;
        double nota4 = 8.7;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6 ) {
            System.out.println("media " + media + " Aprovado");

        } else { 
            System.out.println("media " + media + " Reprovado");
        }

    
    }
}