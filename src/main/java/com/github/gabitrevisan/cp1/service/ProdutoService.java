package com.github.gabitrevisan.cp1.service;

import java.util.ArrayList;
import java.util.List;

import com.github.gabitrevisan.cp1.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList();
    private Long id = 1L;

    public Produto save(Produto produto) {
        produto.setId(id);
        return produto;
    }
}