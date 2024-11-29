package br.com.biblioteca.api.controller;

import br.com.biblioteca.api.model.Livro;
import br.com.biblioteca.api.model.LivrosComprados;
import br.com.biblioteca.api.service.LivroService;
import br.com.biblioteca.api.service.LivrosCompradosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/livros-comprados")
public class LivrosCompradosController {

    @Autowired
    LivrosCompradosService livrosCompradosService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarLivroC(@RequestBody LivrosComprados livrosComprados) {
        livrosCompradosService.criarLivroC(livrosComprados);
    }

    @GetMapping("/por-livro/{livroId}")
    @ResponseStatus(HttpStatus.OK)
    public List<LivrosComprados> listarPorLivro(@PathVariable Long livroId) {
        return livrosCompradosService.listarPorLivroId(livroId);
    }

    @GetMapping("/por-cliente/{clienteId}")
    @ResponseStatus(HttpStatus.OK)
    public List<LivrosComprados> listarPorCliente(@PathVariable Long clienteId) {
        return livrosCompradosService.listarPorClienteId(clienteId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LivrosComprados> listarTodososLivros() {
        return livrosCompradosService.listarTodosLivrosC();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<LivrosComprados> BuscarlivroCPorId(@PathVariable Long id) {
        return livrosCompradosService.BuscarlivroCPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarLivroC(@PathVariable Long id) {
        livrosCompradosService.deletarLivroC(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarLivroCporId(@PathVariable Long id, @RequestBody LivrosComprados livrosComprados) {
        livrosCompradosService.atualizarLivroCporId(id, livrosComprados);
    }
}