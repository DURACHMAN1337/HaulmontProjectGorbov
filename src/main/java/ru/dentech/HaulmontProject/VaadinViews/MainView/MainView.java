package ru.dentech.HaulmontProject.VaadinViews.MainView;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import ru.dentech.HaulmontProject.VaadinViews.Bank.BankView;
import ru.dentech.HaulmontProject.VaadinViews.Client.ClientView;
import ru.dentech.HaulmontProject.VaadinViews.Credit.CreditView;
import ru.dentech.HaulmontProject.VaadinViews.CreditOffer.CreditOfferView;

@PWA(name = "My Project1", shortName = "My Project2", enableInstallPrompt = false)
public class MainView extends AppLayout {
    private final Tabs menu;
    private H1 viewTitle;

    public MainView() {
        setPrimarySection(Section.DRAWER);
        addToNavbar(true, createHeaderContent());
        menu = createMenu();
        addToDrawer(createDrawerContent(menu));

    }

    private Component createHeaderContent() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setId("header");
        layout.getThemeList().set("dark", true);
        layout.setWidthFull();
        layout.setSpacing(false);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        layout.add(new DrawerToggle());
        viewTitle = new H1("Den Bank");

        layout.add(viewTitle);
        layout.add(new Image("resources/images/bank.png", "Logo"));
        layout.setAlignItems(FlexComponent.Alignment.CENTER);

        return layout;
    }

    private Component createDrawerContent(Tabs menu) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setPadding(true);
        layout.setSpacing(true);
        layout.getThemeList().set("spacing-s", true);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        VerticalLayout logoLayout = new VerticalLayout();
        logoLayout.setId("logo");
        Image image = new Image("https://cdn.fishki.net/upload/post/2020/09/25/3429396/yumor-pro-smenu-logotipa-sberbanka-15-foto-1.jpg","logo");
        image.setHeight("40%");
        image.setWidth("60%");
        logoLayout.add(image);
        logoLayout.add(new H1("Bank Menu"));
        layout.add(logoLayout, menu);
        return layout;
    }

    private Tabs createMenu() {
        final Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.addThemeVariants(TabsVariant.LUMO_CENTERED);
        tabs.setId("tabs");
        tabs.add(createMenuItems());
        return tabs;
    }

    private Component[] createMenuItems() {
        return new Tab[]{createTab("Банк", BankView.class), createTab("Клиенты", ClientView.class),
                createTab("Кредитные предложения", CreditView.class), createTab("Оформить Кредит", CreditOfferView.class)};
    }

    private static Tab createTab(String text, Class<? extends Component> navigationTarget) {
        final Tab tab = new Tab();
        tab.add(new RouterLink(text, navigationTarget));
        ComponentUtil.setData(tab, Class.class, navigationTarget);
        return tab;
    }

}
