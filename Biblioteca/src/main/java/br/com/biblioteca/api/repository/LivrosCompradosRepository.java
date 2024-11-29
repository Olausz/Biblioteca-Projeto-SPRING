package br.com.biblioteca.api.repository;


import br.com.biblioteca.api.model.Cliente;
import br.com.biblioteca.api.model.Livro;
import br.com.biblioteca.api.model.LivrosComprados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivrosCompradosRepository extends JpaRepository<LivrosComprados, Long> {
    List<LivrosComprados> findByLivroId(Long livroId);
    List<LivrosComprados> findByClienteId(Long clienteId);
}
