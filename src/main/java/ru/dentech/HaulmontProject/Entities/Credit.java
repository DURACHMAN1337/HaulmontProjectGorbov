package ru.dentech.HaulmontProject.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "credit")
@EqualsAndHashCode(callSuper = true)
public class Credit extends AbstractEntity implements Comparable<Credit> {

    @NotNull
    @Column(name = "credit_limit")
    private Long creditLimit;

    @NotNull
    @Column(name = "credit_percent")
    private Double creditPercent;

    public Credit() {
    }

    public Credit(Long creditLimit, Double creditPercent) {
        this.creditLimit = creditLimit;
        this.creditPercent = creditPercent;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditLimit=" + creditLimit +
                ", creditPercent=" + creditPercent +
                '}';
    }

    @Override
    public int compareTo(Credit o) {
        return this.getCreditLimit().compareTo(o.creditLimit);
    }
}
