package br.com.exemplo.papelaria;

/** Fábrica concreta: só cria produtos da linha executiva. */
public class FabricaMaterialExecutivo implements FabricaMaterial {

    @Override
    public Caneta criarCaneta() {
        return new CanetaExecutiva();
    }

    @Override
    public Caderno criarCaderno() {
        return new CadernoExecutivo();
    }
}
