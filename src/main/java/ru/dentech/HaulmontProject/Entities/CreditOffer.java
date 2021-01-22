package ru.dentech.HaulmontProject.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "credit_offers")
@EqualsAndHashCode(callSuper = true)
public class CreditOffer extends AbstractEntity {

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "credit_id")
    private Credit credit;

    @NotNull
    @Column(name = "credit_amount")
    private Long creditAmount;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "payment_schedule")
    private PaymentSchedule paymentSchedule;

    @NotNull
    @Column(name = "bank_id")
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
