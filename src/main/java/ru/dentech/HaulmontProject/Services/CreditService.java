package ru.dentech.HaulmontProject.Services;

import ru.dentech.HaulmontProject.Entities.Credit;

import java.util.List;
import java.util.Optional;

public interface CreditService {
    void delete(Credit credit);
    void deleteById(Long id);
    void addCredit(Credit credit);
    List<Credit> getAll();
    List<Credit> sortAll();
    Optional<Credit> getCredit(Long creditLimit, Double creditPercent);


}
