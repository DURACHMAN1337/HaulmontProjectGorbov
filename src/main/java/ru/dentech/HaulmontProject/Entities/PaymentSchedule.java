package ru.dentech.HaulmontProject.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "PAYMENT_SCHEDULE")
@EqualsAndHashCode(callSuper = true)
public class PaymentSchedule extends AbstractEntity {

    @NotNull
    @Column(name = "DATE_OF_PAYMENT")
    private Date dateOfPayment;

    @NotNull
    @Column(name = "PAYMENT_AMOUNT")
    private Double paymentAmount;

    @NotNull
    @Column(name = "BODY_REPAYMENT_AMOUNT")
    private Double bodyRepayment;

    @NotNull
    @Column(name = "PERCENT_REPAYMENT_AMOUNT")
    private Double percentRepayment;



}
