package br.com.exemplo.papelaria;

/**
 * Abstract Factory: declara a criação de uma família de produtos relacionados
 * (caneta + caderno) sem expor as classes concretas.
 */
public interface FabricaMaterial {

    Caneta criarCaneta();

    Caderno criarCaderno();
}
