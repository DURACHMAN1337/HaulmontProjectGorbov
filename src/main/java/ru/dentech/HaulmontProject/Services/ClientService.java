package ru.dentech.HaulmontProject.Services;

import ru.dentech.HaulmontProject.Entities.Client;

import java.util.List;

public interface ClientService {
    void deleteById(Long id);
    void delete(Client client);
    void addClient(Client client);
    List<Client> getAll();
    List<Client> sortAll();
    Client getClient(Long passport);
}
