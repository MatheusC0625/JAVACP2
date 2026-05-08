package br.com.fiap.aluguelCarro.terminal;

import br.com.fiap.aluguel.model.Cliente;
import br.com.fiap.aluguel.model.Locacao;
import br.com.fiap.aluguel.model.Veiculo;

import javax.swing.*;

public class Terminal {
    public static void main(String [] args){

        String modelo = JOptionPane.showInputDialog("Cadastro de veículo\nModelo:");
        String marca = JOptionPane.showInputDialog("Marca: ");
        String placa = JOptionPane.showInputDialog("Placa: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

        Veiculo veiculo = new Veiculo(modelo, marca, placa, ano);

        String nome = JOptionPane.showInputDialog("Cadastro de cliente\nNome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");

        Cliente cliente = new Cliente(nome,cpf);

        Locacao locacao = new Locacao(veiculo, cliente);
        locacao.iniciarLocacao();
    }
}
