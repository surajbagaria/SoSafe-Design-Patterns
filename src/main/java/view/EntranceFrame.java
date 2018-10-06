package view;

import controller.DisplayPanel;

import javax.swing.*;
import java.awt.*;

public class EntranceFrame extends JFrame {
    public static void main (String[] args) {
        JFrame entranceFrame = new EntranceFrame();
        entranceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entranceFrame.setTitle("SoSafe");
        entranceFrame.pack();
        entranceFrame.setLocationRelativeTo(null);
        entranceFrame.setVisible(true);
    }

    public EntranceFrame() {
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER, DisplayPanel.getDisplayPanel());
        //add(BorderLayout.CENTER, new SecurityPanel());
        //add(BorderLayout.CENTER, new FireAlarmPanel());
        //add(BorderLayout.CENTER, new MainPanel());
        //add(new ScheduleTimePanel());
    }
}
