
import javax.swing.JOptionPane;

/*
    |** Programa´para utilizar classes e metodos **|
 */
public class TiposPrimitivosVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        double nr1,nr2,nr3, resu;
        int x1, x2, x3, resu2;
        
        nr1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero _"));
        nr2=Double.parseDouble(JOptionPane.showInputDialog("Digite o sugundo  numero _"));
        nr3=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero _"));
        
        x1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro x _"));
        x2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo x _"));
        x3=Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro x _"));
        
        
        // resu=Calcular.somar_(x1, x2, x3);// comando para usar o static lá na clase
        
        Calcular calc, mult;// calc e mult são é o objeto criado da classe <Calcular>
        calc= new Calcular();        
        resu=calc.somar_(x1, x2, x3);// comando para chamar a clasee <Calcular>
        
        mult= new Calcular();
        resu2=mult.multiplicar_(x2, x3);
        
        JOptionPane.showMessageDialog(null,"A soma de x é "+ resu);
        JOptionPane.showMessageDialog(null,"A multiplicação é "+ resu2);
        
        
        
                
        

       

    }

}
