package br.com.biblioteca.api.service;


import br.com.biblioteca.api.model.Livro;
import br.com.biblioteca.api.model.LivrosComprados;
import br.com.biblioteca.api.repository.LivrosCompradosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosCompradosService {

    @Autowired
    LivrosCompradosRepository livrosCompradosRepository;

    public void criarLivroC (LivrosComprados livrosComprados) {
        livrosCompradosRepository.save(livrosComprados);
    }

    public List<LivrosComprados> listarTodosLivrosC() {
        return  livrosCompradosRepository.findAll();
    }

    public void deletarLivroC(Long id) {
        livrosCompradosRepository.deleteById(id);
    }

    public Optional<LivrosComprados> BuscarlivroCPorId(Long id) {
        return livrosCompradosRepository.findById(id);
    }


    public List<LivrosComprados> listarPorLivroId(Long livroId) {
        return livrosCompradosRepository.findByLivroId(livroId);
    }

    public List<LivrosComprados> listarPorClienteId(Long clienteId) {
        return livrosCompradosRepository.findByClienteId(clienteId);
    }

    public void atualizarLivroCporId(Long id, LivrosComprados livrosComprados){
        Optional<LivrosComprados> LivroCBancodeDados = BuscarlivroCPorId(id);

        if (LivroCBancodeDados.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não existe no banco de dados");
        }

        LivrosComprados livroCeditado = LivroCBancodeDados.get();

        livroCeditado.setCliente(livrosComprados.getCliente());
        livroCeditado.setLivro(livrosComprados.getLivro());
        livroCeditado.setPreco(livrosComprados.getPreco());

        livrosCompradosRepository.save(livroCeditado);
    }
}
