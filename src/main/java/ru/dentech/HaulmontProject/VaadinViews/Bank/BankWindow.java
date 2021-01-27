package ru.dentech.HaulmontProject.VaadinViews.Bank;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import ru.dentech.HaulmontProject.Entities.Bank;
import ru.dentech.HaulmontProject.Entities.Client;
import ru.dentech.HaulmontProject.Entities.Credit;
import ru.dentech.HaulmontProject.Services.Impl.BankServiceImpl;
import ru.dentech.HaulmontProject.Services.Impl.ClientServiceImpl;
import ru.dentech.HaulmontProject.Services.Impl.CreditServiceImpl;

import java.awt.*;
import java.util.List;

public class BankWindow extends FormLayout {


    private ClientServiceImpl clientService;
    private CreditServiceImpl creditService;
    private BankServiceImpl bankService;

    private Bank bank;

    private Select<Client> clientSelect;
    private Select<Credit> creditSelect;


    public BankWindow(BankServiceImpl bankService, Bank bank, ClientServiceImpl clientService, CreditServiceImpl creditService) {
        this.bankService = bankService;
        this.bank = bank;
        this.clientService = clientService;
        this.creditService = creditService;

        List<Client> clients = clientService.getAll();
        List<Credit> credits = creditService.getAll();


        clientSelect = new Select<>();
        clientSelect.setItems(clients);
        clientSelect.setLabel("Выберите Клиента");

        creditSelect = new Select<>();
        creditSelect.setItems(credits);
        creditSelect.setLabel("Выберите Кредитную ставку");

        HorizontalLayout windowButtons = new HorizontalLayout();

        Button save = new Button("Сохранить", VaadinIcon.CHECK.create());
        Button cancel = new Button("Отмена");
        windowButtons.add(save, cancel);


        add(clientSelect, creditSelect, windowButtons);
        save.addClickListener(buttonClickEvent -> this.save());
        cancel.addClickListener(buttonClickEvent -> UI.getCurrent().remove(BankWindow.this));


    }

    private void save() {
        try {
            bank.setClient(clientSelect.getValue());
            bank.setCredit(creditSelect.getValue());
            bankService.addBank(bank);

            Notification notification = new Notification("Клиент добавлен!");
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setDuration(2);
            add(notification);
            UI.getCurrent().remove(BankWindow.this);

        } catch (Exception e) {
            add(new Notification("Ошибка!, проверьте данные"));
        }
    }


}
