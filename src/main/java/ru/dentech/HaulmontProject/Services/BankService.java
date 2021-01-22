package ru.dentech.HaulmontProject.Services;

import ru.dentech.HaulmontProject.Entities.Bank;
import ru.dentech.HaulmontProject.Entities.Client;
import ru.dentech.HaulmontProject.Entities.Credit;

import java.util.List;
import java.util.Optional;

public interface BankService {
    void deleteByID(Long id);
    void delete(Bank bank);
    void addBank(Bank bank);
    List<Bank> getAll();
    Optional<Bank> getBank(Client client, Credit credit);


}
