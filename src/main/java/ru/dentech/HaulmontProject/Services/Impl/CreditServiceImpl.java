package ru.dentech.HaulmontProject.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import ru.dentech.HaulmontProject.Entities.Credit;
import ru.dentech.HaulmontProject.Repo.CreditRepo;
import ru.dentech.HaulmontProject.Services.CreditService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CreditServiceImpl implements CreditService {

    @Autowired
   private CreditRepo creditRepo;

    @Override
    public void delete(Credit credit) {
        creditRepo.delete(credit);
    }

    @Override
    public void deleteById(Long id) {
        creditRepo.deleteById(id);
    }

    @Override
    public void addCredit(Credit credit) {
        creditRepo.saveAndFlush(credit);
    }

    @Override
    public List<Credit> getAll() {
        return creditRepo.findAll();
    }

    @Override
    public List<Credit> sortAll() {
        List<Credit> list = creditRepo.findAll();
        Collections.sort(list);
        return list;
    }

    @Override
    public Optional<Credit> getCredit(Long creditLimit, Double creditPercent) {
        Credit credit = new Credit();
        credit.setCreditLimit(creditLimit);
        credit.setCreditPercent(creditPercent);
        return creditRepo.findOne(Example.of(credit));

    }
}
