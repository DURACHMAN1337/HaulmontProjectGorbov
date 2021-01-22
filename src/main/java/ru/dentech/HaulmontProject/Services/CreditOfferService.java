package ru.dentech.HaulmontProject.Services;

import ru.dentech.HaulmontProject.Entities.CreditOffer;

import java.util.List;

public interface CreditOfferService {
    void delete(CreditOffer creditOffer);
    void deleteById(Long id);
    void addCreditOffer(CreditOffer creditOffer);
    List<CreditOffer> getAll();
    List<CreditOffer> getALlOffersForClient(Long bankId);
    List<CreditOffer> deleteALlOffersForClient(Long bankId);
}
