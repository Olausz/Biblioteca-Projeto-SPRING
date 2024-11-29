package br.com.biblioteca.api.controller;


import br.com.biblioteca.api.model.Cliente;
import br.com.biblioteca.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCliente(@RequestBody Cliente cliente) {
        clienteService.criarCliente(cliente);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> listarTodosoClientes() {
        return clienteService.listarTodosClientes();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarClientePorId(@PathVariable Long id) {
        clienteService.deletarClientePorId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> BuscarlivroPorId(@PathVariable Long id) {
        return clienteService.BuscarClientePorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarClientePorId(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizarClientePorId(id, cliente);
    }
}
