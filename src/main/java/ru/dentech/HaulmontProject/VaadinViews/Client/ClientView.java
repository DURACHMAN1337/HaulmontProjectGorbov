package ru.dentech.HaulmontProject.VaadinViews.Client;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.dentech.HaulmontProject.VaadinViews.MainView.MainView;

@Route(value = "Clients",layout = MainView.class)
@PageTitle("Наши клиенты")
public class ClientView extends VerticalLayout {

}
