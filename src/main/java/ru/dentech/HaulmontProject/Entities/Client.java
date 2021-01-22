package ru.dentech.HaulmontProject.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "clients")
@EqualsAndHashCode(callSuper = true)
public class Client extends AbstractEntity implements Comparable<Client> {

    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @NotNull
    @Column(name = "patronymic")
    private String patronymic;

    @NotNull
    @Column(name = "phone", unique = true)
    private Long phoneNumber;

    @NotNull
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Column(name = "passport", unique = true)
    private Long passport;

    public Client() {
    }

    public Client(String firstname, String surname, String patronymic, Long phoneNumber, String email, Long passport) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", passport=" + passport +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        return this.getSurname().toLowerCase().compareTo(o.getSurname().toLowerCase());
    }
}
