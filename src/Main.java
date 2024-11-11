import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("clicker game");
        JLabel showCLicks = new JLabel("0");
        JButton clickButton1 = new JButton("+");
        JButton clickButton2 = new JButton("-");
        JButton resetButton = new JButton("reset");

        frame.setLayout(new GridLayout(4,1));
        frame.setSize(400,400);
        frame.add(showCLicks);
        frame.add(clickButton1);
        frame.add(clickButton2);
        frame.add(resetButton);

        frame.setVisible(true);

        clickButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int counter = Integer.parseInt(showCLicks.getText());
                counter++;
                showCLicks.setText(String.valueOf(counter));
            }
        });
        clickButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int counter = Integer.parseInt(showCLicks.getText());
                counter--;
                showCLicks.setText(String.valueOf(counter));
            }
        });
        resetButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                showCLicks.setText("0");
            }
        });
    }
}