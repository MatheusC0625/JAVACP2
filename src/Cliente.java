public class Cliente {

    private String nome;
    private String cpf;
    private boolean alugouUmCarro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAlugouUmCarro() {
        return alugouUmCarro;
    }

    public void setAlugouUmCarro(boolean alugouUmCarro) {
        this.alugouUmCarro = alugouUmCarro;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.alugouUmCarro = false;

    }

}
