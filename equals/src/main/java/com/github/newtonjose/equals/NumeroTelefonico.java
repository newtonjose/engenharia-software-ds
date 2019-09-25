package com.github.newtonjose.equals;

import java.util.Objects;

/**
 * Classe com contrutor básiso e sobrescrita do metodo equals da classe Object.
 */
public class NumeroTelefonico {
    private final String codigoPais;
    private final String codigoEstato;
    private final String numTelefonico;

    /**
     * Construtor default.
     *
     * @param codPais String Código do país.
     * @param codEstado String Código do estado.
     * @param numTel String Número telefónico.
     */
    public NumeroTelefonico(final String codPais, final String codEstado,
                            final String numTel) {
        this.codigoPais = codPais;
        this.codigoEstato = codEstado;
        this.numTelefonico = numTel;
    }


    /**
     * Sobrescrita o método default de Object para verificar se dois números
     * telefonicos são iguais.
     *
     * @param obj Intância da classe default Object.
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NumeroTelefonico)) {
            return false;
        }

        final NumeroTelefonico nt = (NumeroTelefonico) obj;

        return this.codigoPais.equals(nt.codigoPais)
                && this.codigoEstato.equals(nt.codigoEstato)
                && this.numTelefonico.equals(nt.numTelefonico);

    }


    /**
     * @return Soma dos hashCode dos parametros do objeto NumeroTelegonico.
     */
    @Override
    public int hashCode(){
        return Objects.hash(this.codigoEstato, this.codigoPais,
                this.numTelefonico);
    }
}
