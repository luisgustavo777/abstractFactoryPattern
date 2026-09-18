package br.com.exemplo.papelaria;

/** Produto concreto da linha escolar. */
public class CanetaEscolar implements Caneta {

    @Override
    public String descricao() {
        return "caneta esferográfica azul";
    }
}
