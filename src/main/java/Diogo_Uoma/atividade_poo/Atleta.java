package Diogo_Uoma.atividade_poo;
import java.util.Scanner;

public class Atleta {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;

    public void nome(){
        System.out.println("Nome do atleta:  ");
        nome = input.next();
    }

    public void idade(){
        
        System.out.println("Idade do atleta:  ");
        idade = input.nextInt();
    }
}
