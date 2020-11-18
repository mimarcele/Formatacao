package com.validacao.formatacao.formatacao;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;


public class FormatarCep {
    public static void main(String[] args) {
        ViaCEPClient cliente = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = cliente.getEndereco("82010340");
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getLocalidade());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
