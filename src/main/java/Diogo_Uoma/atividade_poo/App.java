package Diogo_Uoma.atividade_poo;

public class App {
    public static void main(String[] args) {
        System.out.println("Cadastro para atletas");

        Atleta id = new Atleta();
        id.nome();
        id.idade();

        Esporte modalidade = new Esporte();
        modalidade.categoria();


        if(id.idade > 30){
            System.out.println("Atleta nao pode participar!");
        }else{
            System.out.println("Atleta pode participar");

            Quantidade pessoas = new Quantidade();
            pessoas.limite();
        }
    }
}
