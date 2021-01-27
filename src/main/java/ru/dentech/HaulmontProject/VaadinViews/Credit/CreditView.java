package ru.dentech.HaulmontProject.VaadinViews.Credit;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.dentech.HaulmontProject.VaadinViews.MainView.MainView;

@Route(value = "Credit",layout = MainView.class)
@PageTitle("Кредитные предложения")
public class CreditView extends VerticalLayout {
}
