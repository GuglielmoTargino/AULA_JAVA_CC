
import javax.swing.JFrame;


/**
 *
 * @author Guglielmo H T
 * Programa para exercício com tela modo raiz
 */

public class CadastroTela extends JFrame {
    
    public CadastroTela(){
        
        setSize(500,200);
        setTitle( "cadastro tela");
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
       new CadastroTela().setVisible(true);
        
    } 
    
}
