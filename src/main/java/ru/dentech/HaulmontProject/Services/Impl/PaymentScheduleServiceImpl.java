package ru.dentech.HaulmontProject.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dentech.HaulmontProject.Entities.PaymentSchedule;
import ru.dentech.HaulmontProject.Repo.PaymentScheduleRepo;
import ru.dentech.HaulmontProject.Services.PaymentScheduleService;

import java.util.List;

public class PaymentScheduleServiceImpl implements PaymentScheduleService {

    @Autowired
    private PaymentScheduleRepo paymentScheduleRepo;

    @Override
    public void delete(PaymentSchedule paymentSchedule) {
        paymentScheduleRepo.delete(paymentSchedule);
    }

    @Override
    public void deleteById(Long id) {
        paymentScheduleRepo.deleteById(id);
    }

    @Override
    public void addPaymentSchedule(PaymentSchedule paymentSchedule) {
        paymentScheduleRepo.saveAndFlush(paymentSchedule);
    }

    @Override
    public List<PaymentSchedule> getAll() {
        return paymentScheduleRepo.findAll();
    }
}
