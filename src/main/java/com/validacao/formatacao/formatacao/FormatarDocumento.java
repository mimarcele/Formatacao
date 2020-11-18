package com.validacao.formatacao.formatacao;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatarDocumento {
    public static void main(String[] args) {
        String cpf = "597.632.489-58";
        String cnpj = "98.610.832/0001-24";
        String tituloEleitor = "417453530112";

        CPFFormatter formatadorCpf = new CPFFormatter();
       String cpfSemFormatacao = formatadorCpf.unformat(cpf);
        System.out.println(cpf);
        System.out.println(cpfSemFormatacao);

        CNPJFormatter formatadorCnpj = new CNPJFormatter();
        String cnpjSemFormatacao = formatadorCnpj.unformat(cnpj);
        System.out.println(cnpj);
        System.out.println(cnpjSemFormatacao);

        TituloEleitoralFormatter formatadorTituloEleitoral = new TituloEleitoralFormatter();
        String tituloEleitoralComFormatacao = formatadorTituloEleitoral.format(tituloEleitor);
        System.out.println(tituloEleitor);
        System.out.println(tituloEleitoralComFormatacao);
    }

}
