
import javax.swing.JOptionPane;


//Exercicio de aula utilizando parametros

public class Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nr1,nr2,resu1,resu2;
        
        nr1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primero número_"));
        nr2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número_"));
        resu1=somar_(nr1,nr2);// chama parametro somar_
        resu2=multi_(nr1,nr2);// chama paramentro multi_
        
        
        JOptionPane.showMessageDialog(null,"A soma é "+ resu1+" \nAmultiplicação é "+resu2);        
        
    }
    
    private static int somar_(int nr1,int nr2){
        
        return nr1+nr2;        
    }
    
    private static int multi_(int nr1, int nr2){
        return nr1*nr2;
    }
}
