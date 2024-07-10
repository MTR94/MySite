package com.MTR.aboutme.ui;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;

@CssImport("./styles/shared-styles.css")
public class MainView extends AppLayout {

    public MainView() {
        H1 title = new H1("About Me");
        RouterLink aboutLink = new RouterLink("About", AboutView.class);
        Button homeButton = new Button("Home", e -> aboutLink.getUI().ifPresent(ui -> ui.navigate("/")));

        HorizontalLayout header = new HorizontalLayout(title, homeButton);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);

        addToNavbar(header);
        addToDrawer(new RouterLink("About", AboutView.class));
    }
}

