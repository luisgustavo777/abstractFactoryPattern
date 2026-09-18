package br.com.exemplo.papelaria;

/**
 * Cliente: só conhece as interfaces. Trocando a fábrica, troca a linha inteira
 * do kit, sem nunca misturar produtos de linhas diferentes.
 */
public class Papelaria {

    public static void main(String[] args) {
        venderKit(new FabricaMaterialEscolar());
        venderKit(new FabricaMaterialExecutivo());
    }

    private static void venderKit(FabricaMaterial fabrica) {
        Caneta caneta = fabrica.criarCaneta();
        Caderno caderno = fabrica.criarCaderno();
        System.out.println("Kit: " + caneta.descricao() + " + " + caderno.descricao());
    }
}
