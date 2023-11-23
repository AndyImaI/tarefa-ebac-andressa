public class Cliente {

    private String nome;

    private String endereco;

    private int senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereco do Cliente";
    }

   

    
    
}
