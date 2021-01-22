package ru.dentech.HaulmontProject.Services;

import ru.dentech.HaulmontProject.Entities.PaymentSchedule;

import java.util.List;

public interface PaymentScheduleService {
    void delete(PaymentSchedule paymentSchedule);
    void deleteById(Long id);
    void addPaymentSchedule(PaymentSchedule paymentSchedule);
    List<PaymentSchedule> getAll();
}
