
package data;

/**
 *
 * @author Guglielmo H T
 */
public class Funcionario_ extends Pessoa_{
    private String cargo;
    private double salario;
    
    //Construtor

    public Funcionario_(String cargo, double salario, String cpf, String nome, String email, String telefone) {
        super(cpf, nome, email, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
