package com.github.saopimbapow.apiestudos.Repository;

import com.github.saopimbapow.apiestudos.model.produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<produto, String> {

    List<produto> findByNome(String nome);

}
