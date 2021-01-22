package ru.dentech.HaulmontProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dentech.HaulmontProject.Entities.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank,Long> {

}
