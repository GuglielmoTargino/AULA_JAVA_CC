
/**
 *
 * @author Guglielmo H T
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(){//...................Construtor
        
    }
    
    //............................................setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //............................................getter
    
      public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularSalario()  {
        if(this.salario>2000){
            this.salario*=3;
            } else if(this.salario>1000){
            this.salario*=2;
            } else{
            this.salario+=50;
            }
        
        
    }
    
}
