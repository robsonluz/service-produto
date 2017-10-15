package edu.usf.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.usf.produto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
