package ru.dentech.HaulmontProject.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import ru.dentech.HaulmontProject.Entities.Client;
import ru.dentech.HaulmontProject.Repo.ClientRepo;
import ru.dentech.HaulmontProject.Services.ClientService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public void deleteById(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public void delete(Client client) {
        clientRepo.delete(client);
    }

    @Override
    public void addClient(Client client) {
        clientRepo.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepo.findAll();
    }

    @Override
    public List<Client> sortAll() {
        List<Client> list = clientRepo.findAll();
        Collections.sort(list);
        return list;
    }

    @Override
    public Optional<Client> getClient(Long passport) {
        Client client = new Client();
        client.setPassport(passport);
        return clientRepo.findOne(Example.of(client));
    }
}
