
package data;

/**
 *
 * @author Guglielmo H T
 */
public class Cliente_ extends Pessoa_ {
    private String dataCadastro;
    
    // Construtor

    public Cliente_(String dataCadastro, String cpf, String nome, String email, String telefone) {
        super(cpf, nome, email, telefone);
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
        
}
