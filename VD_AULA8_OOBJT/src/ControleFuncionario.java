
import javax.swing.JOptionPane;



/**
 *
 * @author Guglielmo H T
 * Video aula com com orientação a objeto
 */
public class ControleFuncionario {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario funcionario;// linha para chamar os metodos d o objeto Funcionario.
        funcionario= new Funcionario();
        
        funcionario.setCargo("chefe");
        funcionario.setNome("Guga");
        funcionario.setSalario(4545);
        funcionario.setRa("1245");
        
        JOptionPane.showMessageDialog(null,funcionario.getNome() +" é o nome, e "+funcionario.getCargo()+ " é o cargo");        
        
    }
    
}
