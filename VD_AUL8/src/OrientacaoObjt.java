
import javax.swing.JOptionPane;



/**
 *
 * @author Guglielmo H T
 * Continuaçaõ de pregramação arientado a objeto
 */
public class OrientacaoObjt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario;//...............criação objeto funcionario
        funcionario= new Funcionario();
        
        funcionario.setNome(JOptionPane.showInputDialog("diga seu nome"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("informe seu salario")));
        
        JOptionPane.showMessageDialog(null,"Nome é " + funcionario.getNome());
        JOptionPane.showMessageDialog(null,"salario normal é " + funcionario.getSalario());       
        
        funcionario.calcularSalario();
        
        JOptionPane.showMessageDialog(null,"salario ajustado é "+ funcionario.getSalario());
        
        
        
    }
    
}
