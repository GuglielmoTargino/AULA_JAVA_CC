
import javax.swing.JOptionPane;


/**
 *
 * @author Guglielmo H T
 * Array,  Vetores e Tabelas
 */
public class Exemplo1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int nr;
        nr=Integer.parseInt(JOptionPane.showInputDialog("quantos nomes vc quer cadastrar?"));
        String nm[];// variável criada como array 
        nm= new String[nr]; // array com 2 indeces/elementos
        
        //laço de repetição para pedir ao usuário os nomes
        for ( int c=0; c<nr; c++){
            nm[c]=JOptionPane.showInputDialog("Informne o nome");
        }
        
        /*nm[0]=JOptionPane.showInputDialog("Informe o primeiro nome");
        nm[1]=JOptionPane.showInputDialog("Informe outro nome");
        */
        for ( int c=0;c<nr ;c++ ){
            JOptionPane.showMessageDialog(null,nm[c]);
        }
        
        
        
        
        
    }
    
}
