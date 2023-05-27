
package dados_conexao_bd;


public class UsuarioEncap {
    
    private String usuario;
    private int senha;
    private String cargo;

public UsuarioEncap()    {
    
}

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public String getCargo() {
        return cargo;
    }
    


}
