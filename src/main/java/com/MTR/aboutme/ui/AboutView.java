package com.MTR.aboutme.ui;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route(value = "about", layout = MainView.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        add(new Paragraph("This is the About Me page."));
    }
}
