
package dados_conexao_bd;


public class FuncionarioDao {
    private String nome;
    private String cargo;
    private String sexo;
    private String nasc;
    private String cpf;
    private double sal;
    private String matric;
    
    public FuncionarioDao(){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNasc() {
        return nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSal() {
        return sal;
    }

    public String getMatric() {
        return matric;
    }
    
    
}

