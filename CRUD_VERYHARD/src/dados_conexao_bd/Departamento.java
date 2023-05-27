
package dados_conexao_bd;


public class Departamento {
    private int codigo;
    private String nome;
    private String cidade;
    private String tel; 
    
    //construtor
    public Departamento(){     
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTel() {
        return tel;
    }
    
    
}

