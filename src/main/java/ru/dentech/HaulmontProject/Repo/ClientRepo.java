package ru.dentech.HaulmontProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dentech.HaulmontProject.Entities.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {
}
