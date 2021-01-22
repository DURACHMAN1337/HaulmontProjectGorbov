package ru.dentech.HaulmontProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dentech.HaulmontProject.Entities.PaymentSchedule;

@Repository
public interface PaymentScheduleRepo extends JpaRepository<PaymentSchedule,Long> {

}
