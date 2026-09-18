package br.com.exemplo.papelaria;

/** Fábrica concreta: só cria produtos da linha escolar. */
public class FabricaMaterialEscolar implements FabricaMaterial {

    @Override
    public Caneta criarCaneta() {
        return new CanetaEscolar();
    }

    @Override
    public Caderno criarCaderno() {
        return new CadernoEscolar();
    }
}
