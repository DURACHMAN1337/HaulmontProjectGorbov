package ru.dentech.HaulmontProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dentech.HaulmontProject.Entities.Credit;

@Repository
public interface CreditRepo extends JpaRepository<Credit,Long> {
}
