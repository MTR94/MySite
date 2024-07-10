package com.MTR.aboutme;


import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.stereotype.Component;

@Theme(variant = Lumo.DARK)
@PWA(name = "About Me Application", shortName = "AboutMe")
@Component
public class AboutMeAppShell implements AppShellConfigurator {
    // Optional: you can override methods here if needed
}
