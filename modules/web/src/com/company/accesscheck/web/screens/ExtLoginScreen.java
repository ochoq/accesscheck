package com.company.accesscheck.web.screens;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.OpenMode;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.web.app.login.LoginScreen;

import javax.inject.Inject;


@UiController("newLogin")
@UiDescriptor("ext-login-screen.xml")
public class ExtLoginScreen extends LoginScreen {

    @Inject
    private Screens screens;

    @Subscribe("openAnonymous")
    public void onOpenAnonymousClick(Button.ClickEvent event) {
        screens.create(ExtMainScreen.class, OpenMode.ROOT).show();
    }
}