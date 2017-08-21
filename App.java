package reagan.javacodes;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton Msg;
    private JPanel panel1;


    public App() {
        Msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Msg.setText("lol");
            }
        });
    }

        public static void main(String[] args) {
            JFrame frame = new JFrame("App");
            frame.setContentPane(new App().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

    private void createUIComponents() {
        Msg = new JButton();
        panel1 = new JPanel();
        }
   }


