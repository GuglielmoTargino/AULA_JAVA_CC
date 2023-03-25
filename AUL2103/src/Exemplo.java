
import javax.swing.JOptionPane;


/**
 *
 * @author Guglielmo H T
 */
public class Exemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        String idade;
        double salario;
        
        nome=JOptionPane.showInputDialog("Digite seu nome_");
        idade=JOptionPane.showInputDialog("Digite sua idade");
        salario=Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario"));
        
        JOptionPane.showMessageDialog(null," minha idade é "+ idade);
        JOptionPane.showMessageDialog(null,"Meu salrio é "+salario);
        
        
        
        
        
        
        
    }
    
}
