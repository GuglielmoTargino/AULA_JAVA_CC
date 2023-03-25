
import javax.swing.JOptionPane;



/**
 *
 * @author Guglielmo H T
 * Exercicio utilizando programação orientado a objeto
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double media;
        
        Aluno aluno;
        aluno= new Aluno();
        
        aluno.setRa(JOptionPane.showInputDialog("Digite seu o número do seu RA"));
        aluno.setNm(JOptionPane.showInputDialog("Digite seu nome"));
        aluno.setDiscip(JOptionPane.showInputDialog("Informe seu disciplina"));
        aluno.setNt1(Integer.parseInt( JOptionPane.showInputDialog("Informe a nota av1")));
        aluno.setNt2(Integer.parseInt( JOptionPane.showInputDialog("Informe sua nota av2")));
        media= (aluno.getNt1()+aluno.getNt2())/2;
        
        if (media>6){
             JOptionPane.showMessageDialog(null,", VC foi aprovado com a média "+aluno.getNm()+media);
        }else{
             JOptionPane.showMessageDialog(null,aluno.getNm()+", VC foi reprovado com a média "+media);
        }
       
        
       
        
        
        
    }
    
}
