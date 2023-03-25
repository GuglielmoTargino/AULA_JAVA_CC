/*

 String nome, cargo;
        
        nome=JOptionPane.showInputDialog(null,"Qual seu nome?");// linha para fazer pergunta pro usuario
        cargo=JOptionPane.showInputDialog("Digite seu cargo.");
                
        JOptionPane.showMessageDialog(null, "Boa noite!"+nome+cargo);// linha para mostrar mensagem (similiar printf)


*/




import javax.swing.JOptionPane;

/*
 * @author Guglielmo H T
 */
public class Exemplo1 {// programa para teste em aula

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String ra,nome,materia,status;// variaveis de uso geral
        double nt1,nt2,media; // variaveis de uso geral
        
        ra=JOptionPane.showInputDialog("Digite seu número de RA_");
        nome=JOptionPane.showInputDialog("Digite seu nome_");
        materia=JOptionPane.showInputDialog("Digite a disciplina_");
        nt1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua AV1_"));
        nt2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua AV2_"));
        
        media=(nt1+nt2)/2;// linha para calcular a media
        
        //  comando para verificar se o aluno foi reprovado.
        if( media<6){
            status="Reprovado";
        } else{
            status="Aprovado";
        }
        
        JOptionPane.showMessageDialog(null,nome+ " ,Sua média é " +media+ ". Você foi " +status);
    }
    
}
