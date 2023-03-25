
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guglielmo H T Programa para criar tela de cadastro
 */
public class TelaCadastro extends JFrame {// adição de extends JFrame para criação de tela

    //Construtor utilizado para construir a tela
    //Precisa ter o mesmo nome da classe nesse caso (TelaCadastro)
    public TelaCadastro() {
        
        // ---------------------------------------------------tela cadastro
        setTitle("Cadastro de Funcionários");
        setSize(400, 300);
        setLocation(200, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // --------------------------------------------------------label nome
        JLabel lblNome;
        lblNome = new JLabel("Nome");
        lblNome.setSize(70, 30);
        lblNome.setLocation(20, 30);
        add(lblNome);
        
        // --------------------------------------------------------campo nome
        JTextField txtNome;
        txtNome = new JTextField("");
        txtNome.setSize(200, 30);
        txtNome.setLocation(80, 30);
        add(txtNome);
        
        // ---------------------------------------------------------label cargo
        JLabel lblCargo;
        lblCargo = new JLabel("Cargo");
        lblCargo.setSize(40, 30);
        lblCargo.setLocation(20, 60);
        add(lblCargo);
        
        // ---------------------------------------------------------campo cargo
        JTextField txtCargo;
        txtCargo = new JTextField("");
        txtCargo.setSize(100, 30);
        txtCargo.setLocation(80, 60);
        add(txtCargo);
        
        //-------------------------------------------------------label salario        
        JLabel lblSalario;
        lblSalario = new JLabel("Salario");
        lblSalario.setSize(40, 30);
        lblSalario.setLocation(20, 90);
        add(lblSalario); 
        
        // -------------------------------------------------------campo salario
        JTextField txtSalario;
        txtSalario = new JTextField("");
        txtSalario.setSize(100, 30);
        txtSalario.setLocation(80, 90);
        add(txtSalario);
        // ----------------------------------------------------label telefone
        JLabel lblTelefone;
        lblTelefone = new JLabel("Tel:");
        lblTelefone.setSize(50, 30);
        lblTelefone.setLocation(20, 120);
        add(lblTelefone);
        
        // -----------------------------------------------------campo telefone
        JTextField txtTelefone;
        txtTelefone = new JTextField("");
        txtTelefone.setSize(100, 30);
        txtTelefone.setLocation(80, 120);
        add(txtTelefone);       
        
        // --------------------------------------------------------label email
        JLabel lblEmail;
        lblEmail = new JLabel("Email");
        lblEmail.setSize(70, 30);
        lblEmail.setLocation(20, 150);
        add(lblEmail);
        
        // -----------------------------------------------------campo email
        JTextField txtEmail;
        txtEmail = new JTextField("");
        txtEmail.setSize(200, 30);
        txtEmail.setLocation(80, 150);
        add(txtEmail);
        
        // ----------------------------------------------adição botao salvar
        JButton btnSalvar;
        btnSalvar = new JButton("Salvar");
        btnSalvar.setSize(90, 30);
        btnSalvar.setLocation(180, 200);
        add(btnSalvar);
       
        // ----------------------------------------------adição botao pesquisar
        JButton btnCalcular;
        btnCalcular = new JButton("Pesquisar");
        btnCalcular.setSize(90, 30);
        btnCalcular.setLocation(80, 200);
        add(btnCalcular);
        
       
        

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //chama construtor TelaCadastro
        new TelaCadastro().setVisible(true);

    }

}
