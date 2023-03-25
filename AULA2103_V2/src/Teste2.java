
import java.util.Scanner;



/**
 *
 * @author Guglielmo H T
 * 
 * Programa para utilização da ferramenta scanner
 */
public class Teste2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        String idade;
        double salario;
        
        Scanner scn;
        scn= new Scanner(System.in);
        // cadastro de valores   
        
        System.out.print("digite seu nome");
        nome=scn.nextLine();
        
        System.out.print("digite sua idade");
        idade=scn.nextLine();
        
        System.out.print("Digite seu salario");
        salario=scn.nextDouble();
        
        System.out.print("nome="+nome +"\nidade= "+ idade +"\nsalario= "+ salario);
        
    }
    
}

/*
//Cadastro de valores (Entrada de dados)
        System.out.print("Digite seu nome: ");
        nome = scn.nextLine(); //armazenar a resposta como String
        System.out.print("Digite sua idade: ");
        idade = scn.nextByte(); //armazenar a resposta como byte
        System.out.print("Digite seu salário: ");
        salario = scn.nextDouble(); //armazenar a resposta como double

===================================================
//Exibe os dadops cadastrados
        System.out.print(
                "Nome: " + nome
                + "\nIdade: " + idade
                + "\nsalário: " + salario
        );


*/
