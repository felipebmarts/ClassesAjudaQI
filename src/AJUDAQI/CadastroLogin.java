package AJUDAQI;

public class CadastroLogin {
    private String TipodeUsuario;
    public String Username;
    public String Nome;
    private String Senha;
    private String CPF;
    private String Email;

    public String getTipodeUsuario() {
        return TipodeUsuario;
    }

    public void setTipodeUsuario(String tipodeUsuario) {
        TipodeUsuario = tipodeUsuario;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
