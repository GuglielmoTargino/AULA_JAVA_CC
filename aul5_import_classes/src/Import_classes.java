
import javax.swing.JOptionPane;


// Programa para impórtação de classes

public class Import_classes {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        
        Calcular j;
        j= new Calcular(); // Criado objeto da classe <Calcular> para chamada sem o "static".
        
        resu=j.somar_(4,5,2); // passado nr fixo sem pedir para o usuário.
        JOptionPane.showMessageDialog(null," A soma é "+ resu);
        
        
        
       
        
    }
    
}
