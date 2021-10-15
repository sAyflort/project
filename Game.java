package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
    private JTextField textField1, textField2;
    private int attempt = 3, randomNumber;

    public Game() {
        setTitle("My first game");
        setBounds(600, 300, 600, 130);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField1.setEditable(false);
        textField2.setEditable(false);
        textField1.setText("Угадайте число");
        textField2.setText("Попыток: 3");

        randomNumber = (int) (Math.random()*10);
        System.out.println(randomNumber);

        JPanel textPanel = new JPanel(new GridLayout(1, 2));
        add(textPanel, BorderLayout.NORTH);
        textPanel.add(textField1);
        textPanel.add(textField2);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 10));
        add(buttonPanel, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++) {
           JButton button = new JButton(String.valueOf(i));
           buttonPanel.add(button);
           int buttonIndex = i;
           button.addActionListener(new AbstractAction() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   if(attempt!=0) {
                       if (!tryToAnswer(buttonIndex)) {
                           attempt--;
                           textField2.setText("Попыток: "+attempt);
                       }
                   }
               }
           });
        }

        JButton button = new JButton("Перезапуск игры");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Угадайте число");
                textField2.setText("Попыток: 3");
                attempt = 3;
                randomNumber = (int) (Math.random()*10);
            }
        });

        setVisible(true);


    }

    public boolean tryToAnswer(int ans) {
        if (ans == randomNumber) {
            textField1.setText("Вы угадали число");
            textField2.setText("Попыток: " + (attempt-1));
            attempt = 0;
            return true;
        } else if (ans > randomNumber) {
            textField1.setText("Число меньше выбранного");
        } else {
            textField1.setText("Число больше выбранного");
        }
        return false;
    }
}
