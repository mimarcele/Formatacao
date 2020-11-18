package com.validacao.formatacao.formatacao;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class FormatarNumeroPorExtenso {
    public static void main(String[] args) {
        NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
        BigDecimal valor = new BigDecimal("75.00");
        String valorPorExtenso = conversor.toWords(valor.doubleValue());
        System.out.println(valorPorExtenso + " reais");

        NumericToWordsConverter conversor1 = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor1 = new BigDecimal("1.75");
        String valorPorExtenso1 = conversor1.toWords(valor1.doubleValue());
        System.out.println(valorPorExtenso1);


    }
}
