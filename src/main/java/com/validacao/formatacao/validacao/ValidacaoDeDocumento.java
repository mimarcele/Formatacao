package com.validacao.formatacao.validacao;

import br.com.caelum.stella.validation.*;

public class ValidacaoDeDocumento {
    public static void main(String[] args) {
        String cpf = "59763248958";
        try{
            validarDocumentos(new CPFValidator(), cpf);
            System.out.println("CPF VÁLIDO");
        }
        catch (InvalidStateException e){
            System.out.println("CPF INVÁLIDO " + e);
        }

        String cnpj = "82588641000173";
        try{
            validarDocumentos(new CNPJValidator(), cnpj);
            System.out.println("CNPJ VÁLIDO");

        }
        catch (InvalidStateException e){
            System.out.println("CNPJ INVÁLIDO " + e);
        }

        String tituloEleitor = "417453530112";
        try{
            validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
            System.out.println("TÍTULO ELEITORAL VÁLIDO");

        }
        catch (InvalidStateException e){
            System.out.println("TÍTULO ELEITORAL INVALIDO "+ e);
        }
    }

    private static void  validarDocumentos(Validator<String> validador, String documento){
        validador.assertValid(documento);
    }
}
