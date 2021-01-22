package ru.dentech.HaulmontProject.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CREDIT_OFFERS")
@EqualsAndHashCode(callSuper = true)
public class CreditOffer extends AbstractEntity {

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CREDIT_ID")
    private Credit credit;

    @NotNull
    @Column(name = "CREDIT_AMOUNT")
    private Long creditAmount;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PAYMENT_SCHEDULE")
    private PaymentSchedule paymentSchedule;

    @NotNull
    @Column(name = "BANK_ID")
    private Long bankID;

    public CreditOffer() {
    }

    public CreditOffer(Client client, Credit credit, Long creditAmount, PaymentSchedule paymentSchedule, Long bankID) {
        this.client = client;
        this.credit = credit;
        this.creditAmount = creditAmount;
        this.paymentSchedule = paymentSchedule;
        this.bankID = bankID;
    }

    @Override
    public String toString() {
        return "CreditOffer{" +
                "client=" + client +
                ", credit=" + credit +
                ", creditAmount=" + creditAmount +
                ", paymentSchedule=" + paymentSchedule +
                ", bankID=" + bankID +
                '}';
    }
}
