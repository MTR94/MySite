package com.MTR.aboutme.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
@CssImport("./styles/styles.css")
@Route("")
public class MainView extends AppLayout {

    public MainView() {
        // Create image component with PNG file
        Image profileImage = new Image("images/profile_new.png", "Profile Image");
        profileImage.setHeight("200px");
        profileImage.setWidth("300px");

        // Create name and title
        H1 name = new H1("Marcin Trybała");
        H1 titleDeveloper = new H1("Java Developer");

        // Create a layout for name and title
        VerticalLayout nameTitleLayout = new VerticalLayout(name, titleDeveloper);
        nameTitleLayout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.BASELINE);

        // Create a layout for profile image and name/title
        VerticalLayout profileLayout = new VerticalLayout(profileImage, nameTitleLayout);
        profileLayout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);

        // Set the layout for the main view
        setContent(profileLayout);

        // Create navigation links
        RouterLink aboutLink = new RouterLink("About", AboutView.class);
        Button homeButton = new Button("Home", e -> aboutLink.getUI().ifPresent(ui -> ui.navigate("/")));

        HorizontalLayout header = new HorizontalLayout(homeButton);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);

        addToNavbar(header);
        addToDrawer(new RouterLink("About Me", AboutView.class));
    }
}
