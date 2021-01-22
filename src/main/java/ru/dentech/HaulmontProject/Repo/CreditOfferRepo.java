package ru.dentech.HaulmontProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dentech.HaulmontProject.Entities.CreditOffer;

@Repository
public interface CreditOfferRepo extends JpaRepository<CreditOffer,Long> {
}
