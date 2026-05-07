public class Locacao {

    private Veiculo veiculo;
    private Cliente cliente;
    private boolean ativa;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public Locacao(Veiculo veiculo, Cliente cliente){
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.ativa = true;
    }

    public void iniciarLocacao() {
        if (veiculo.isDisponivel() && !cliente.isAlugouUmCarro()) {
            veiculo.setDisponivel(false);
            cliente.setAlugouUmCarro(true);
            System.out.println("Locação iniciada com sucesso!");
        } else if (!veiculo.isDisponivel()) {
            System.out.println("Não foi possível alugar o veículo. Veículo indisponível.");
        } else if (cliente.isAlugouUmCarro()){
            System.out.println("Não foi possível alugar o veículo. Cliente já possui um veículo alugado.");
        } else {
            System.out.println("revisar essa classe infernal");
        }

    }
}

