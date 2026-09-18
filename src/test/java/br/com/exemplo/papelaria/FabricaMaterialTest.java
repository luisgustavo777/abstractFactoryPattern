package br.com.exemplo.papelaria;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

class FabricaMaterialTest {

    @Test
    void cadaFabricaCriaProdutosDaMesmaLinha() {
        FabricaMaterial escolar = new FabricaMaterialEscolar();
        assertInstanceOf(CanetaEscolar.class, escolar.criarCaneta());
        assertInstanceOf(CadernoEscolar.class, escolar.criarCaderno());

        FabricaMaterial executivo = new FabricaMaterialExecutivo();
        assertInstanceOf(CanetaExecutiva.class, executivo.criarCaneta());
        assertInstanceOf(CadernoExecutivo.class, executivo.criarCaderno());
    }
}
