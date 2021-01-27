package ru.dentech.HaulmontProject.VaadinViews.Bank;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.beanvalidation.MethodValidationInterceptor;
import ru.dentech.HaulmontProject.Entities.Bank;
import ru.dentech.HaulmontProject.Services.Impl.*;
import ru.dentech.HaulmontProject.VaadinViews.MainView.MainView;

import java.awt.*;

@Route(value = "Bank", layout = MainView.class)
@PageTitle("Банк")
@RouteAlias(value = "", layout = MainView.class)
public class BankView extends VerticalLayout {



//    @Autowired
//    PaymentScheduleServiceImpl paymentScheduleService;
//    @Autowired
//    BankServiceImpl bankService;
//    @Autowired
//    ClientServiceImpl clientService;
//    @Autowired
//    CreditServiceImpl creditService;
//    @Autowired
//    CreditOfferServiceImpl creditOfferService;


    public BankView() {

        Button addButton = new Button("Добавить");
        Button detailsButton = new Button("Информация по платежам");
        Button deleteButton = new Button("Удалить");
        Grid<Bank> bankGrid = new Grid<>(Bank.class);
        long bankId = 0;

        HorizontalLayout buttonLayout = new HorizontalLayout();

        addButton.setIcon(VaadinIcon.PLUS.create());
        detailsButton.setIcon(VaadinIcon.COG_O.create());
        deleteButton.setIcon(VaadinIcon.MINUS.create());

        buttonLayout.setSpacing(true);
        buttonLayout.setPadding(true);
        buttonLayout.setSizeFull();
        buttonLayout.setAlignItems(Alignment.CENTER);

        buttonLayout.add(addButton, detailsButton, deleteButton);


        bankGrid.setColumns("client","credit");
        bankGrid.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS,GridVariant.LUMO_ROW_STRIPES);

//        bankGrid.setItems(bankService.getAll());



        add(buttonLayout, bankGrid);
         addButton.addClickListener(buttonClickEvent -> {
            Bank bank = new Bank();
            BankWindow bankWindow = new BankWindow(new BankServiceImpl(),bank,new ClientServiceImpl(),new CreditServiceImpl());
             UI.getCurrent().add(bankWindow);
         });

    }
}
