package Teste.DAO;

import java.util.*;
import Teste.Model.Produto;

public class ProdutoDAO {
    private List<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return listaProdutos;
    }
}
