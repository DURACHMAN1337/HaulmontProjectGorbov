package ru.dentech.HaulmontProject.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dentech.HaulmontProject.Entities.CreditOffer;
import ru.dentech.HaulmontProject.Repo.CreditOfferRepo;
import ru.dentech.HaulmontProject.Services.CreditOfferService;

import java.util.List;

@Service
public class CreditOfferServiceImpl implements CreditOfferService {

    @Autowired
   private CreditOfferRepo creditOfferRepo;

    @Override
    public void delete(CreditOffer creditOffer) {
        creditOfferRepo.delete(creditOffer);
    }

    @Override
    public void deleteById(Long id) {
        creditOfferRepo.deleteById(id);
    }

    @Override
    public void addCreditOffer(CreditOffer creditOffer) {
        creditOfferRepo.saveAndFlush(creditOffer);
    }

    @Override
    public List<CreditOffer> getAll() {
        return creditOfferRepo.findAll();
    }

    @Override
    public List<CreditOffer> getALlOffersForClient(Long bankId) {
        return null;
    }

    @Override
    public List<CreditOffer> deleteALlOffersForClient(Long bankId) {
        return null;
    }
}
