
import javax.swing.JOptionPane;


public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome,cargo,telefone;
        int idade,ra;
        double salario;
        char sexo;
        
        nome=JOptionPane.showInputDialog("Digite seu nome");
        cargo=JOptionPane.showInputDialog("Digite seu cargo");
        telefone=JOptionPane.showInputDialog("Informe seu numero de telefone");
        idade=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        ra=Integer.parseInt(JOptionPane.showInputDialog("Informe seu RA_"));
        salario=Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
        sexo=JOptionPane.showInputDialog("Informe seu sexo_").toUpperCase().charAt(0);
        
        JOptionPane.showMessageDialog(null,sexo);
        
        
        
        
        
        
        
        
        
        
    }
    
}
