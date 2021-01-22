package ru.dentech.HaulmontProject.Entities;



import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.context.request.FacesRequestAttributes;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table("BANKS")
public class Bank extends AbstractEntity {

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Credit credit;

    public Bank() {
    }

    public Bank(Client client, Credit credit) {
        this.client = client;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "client=" + client +
                ", credit=" + credit +
                '}';
    }
}
