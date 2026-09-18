package br.com.exemplo.papelaria;

/** Produto concreto da linha executiva. */
public class CadernoExecutivo implements Caderno {

    @Override
    public String descricao() {
        return "caderno capa dura de 200 folhas";
    }
}
