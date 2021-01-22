package ru.dentech.HaulmontProject.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import ru.dentech.HaulmontProject.Entities.Bank;
import ru.dentech.HaulmontProject.Entities.Client;
import ru.dentech.HaulmontProject.Entities.Credit;
import ru.dentech.HaulmontProject.Repo.BankRepo;
import ru.dentech.HaulmontProject.Services.BankService;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepo bankRepo;

    @Override
    public void deleteByID(Long id) {
        bankRepo.deleteById(id);
    }

    @Override
    public void delete(Bank bank) {
        bankRepo.delete(bank);
    }

    @Override
    public void addBank(Bank bank) {
        bankRepo.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
       return bankRepo.findAll();
    }

    @Override
    public Optional<Bank> getBank(Client client, Credit credit) {
        Bank bank = new Bank();
        bank.setClient(client);
        bank.setCredit(credit);
        return bankRepo.findOne(Example.of(bank));

    }
}
