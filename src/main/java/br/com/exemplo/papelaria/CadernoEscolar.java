package br.com.exemplo.papelaria;

/** Produto concreto da linha escolar. */
public class CadernoEscolar implements Caderno {

    @Override
    public String descricao() {
        return "caderno espiral de 96 folhas";
    }
}
