package br.com.biblioteca.api.service;


import br.com.biblioteca.api.model.Cliente;
import br.com.biblioteca.api.model.Livro;
import br.com.biblioteca.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void criarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public void deletarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

    public Optional<Cliente> BuscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void atualizarClientePorId(Long id, Cliente cliente){
        Optional<Cliente> ClienteBancodeDados = BuscarClientePorId(id);

        if (ClienteBancodeDados.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não existe no banco de dados");
        }

        Cliente clienteEditado = ClienteBancodeDados.get();

        clienteEditado.setNome(cliente.getNome());
        clienteEditado.setEmail(cliente.getEmail());

        clienteRepository.save(clienteEditado);
    }
}
