package controller;

import model.User;
import view.*;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel{

    private static DisplayPanel displayPanel;

    // set the card layout of the different panel
    private  CardLayout cards = new CardLayout();
    private  JPanel fireAlarmPanel;
    private  JPanel mainPanel;
    private  JPanel securityPanel;
    private  JPanel userPanel;
    private  JPanel signInPanel;

    private User user;



    DisplayPanel() {
        setLayout(cards);
        user = User.getInstance();
        signInPanel = new SignInPanel(user);
        fireAlarmPanel = new FireAlarmPanel(user);
        mainPanel = new MainPanel();
        securityPanel = new SecurityPanel(user);
        userPanel = new UserPanel(user);

        addPanels();
    }

    private void addPanels() {
        add(signInPanel, "signInPanel");
        add(mainPanel, "mainPanel");
        add(fireAlarmPanel, "fireAlarmPanel");
        add(securityPanel, "securityPanel");
        add(userPanel, "userPanel");
    }

    public static DisplayPanel getDisplayPanel() {
        if (displayPanel == null) {
            displayPanel = new DisplayPanel();
        }
        return displayPanel;
    }

    public CardLayout getCards() {
        return cards;
    }
}
