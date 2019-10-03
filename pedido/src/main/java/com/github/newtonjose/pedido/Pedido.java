package com.github.newtonjose.pedido;

import com.github.newtonjose.produto.Produto;

import java.util.ArrayList;

/**
 * Inteface pública do pacote, com assinatura do endpoint para criar um pedido.
 */
public class Pedido {


    /**
     * Método para criar um pedido dado uma lista de itens.
     *
     * @param listaItensIds Array de item id a ser adicionado no pedido.
     * @return Interger Id do pedido.
     */
    public int criaPedidoEndPoint(final ArrayList listaItensIds);

    protected void adicionarItem(Produto produto, int quantidade);


}
