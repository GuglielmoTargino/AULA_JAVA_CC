

import javax.swing.JOptionPane;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


//import calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




/*
 * @author Guglielmo H T
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String ra,nome,materia,status;// variaveis de uso geral
        double nt1,nt2,media; // variaveis de uso geral
        
        ra=JOptionPane.showInputDialog("Digite seu número de RA_");
        nome=JOptionPane.showInputDialog("Digite seu nome_");
        materia=JOptionPane.showInputDialog("Digite a disciplina_");
        nt1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua AV1_"));
        nt2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua AV2_"));
        
        media=(nt1+nt2)/2;// linha para calcular a media
        
        //  comando para verificar se o aluno foi reprovado.
        if( media<6){
            status="Reprovado";
        } else{
            status="Aprovado";
        }
        
        JOptionPane.showMessageDialog(null,nome+ " ,Sua média é " +media+ ". Você foi " +status);
    }
    
 
    


    
}
