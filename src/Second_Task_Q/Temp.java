package Second_Task_Q;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame {
    private JButton ExitButton;
    private JButton ClearButton;
    private JButton KonwertujButton;
    private JRadioButton czcionkaMalaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetButton;
    private JTextField textFCelcjusz;
    private JTextField textFFarenhait;
    private JPanel Main;
    private JRadioButton czcionkaSrednia;
    private JRadioButton czcionkaDuza;
    private double tempC, tempF;

    public static void main(String[] args) {
        Temp conTemp = new Temp();
        conTemp.setVisible(true);
    }

    public Temp() {
        super("Konwertowanie stopni C -> F");
        this.setContentPane(this.Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if (ob1 == KonwertujButton || ob1 == textFCelcjusz) {
                    tempC = Double.parseDouble(textFCelcjusz.getText());
                    tempF = 32.00 * (9.0 / 5.0) * tempC;
                    textFFarenhait.setText(String.valueOf(tempF));
                }else if (ob1 == resetButton){
                    textFFarenhait.setText("");
                    textFCelcjusz.setText("");
                    if(wielkieLiteryCheckBox.isSelected() == true) wielkieLiteryCheckBox.setSelected(false);
                    else if (czcionkaMalaRadioButton.isSelected() == true) czcionkaMalaRadioButton.setSelected(false);
                    else if(czcionkaSrednia.isSelected() == true) czcionkaSrednia.setSelected(false);
                    else if (czcionkaDuza.isSelected() == true) czcionkaDuza.setSelected(false);

                }else if (ob1 == ExitButton){
                    dispose();
                }else if( ob1 == wielkieLiteryCheckBox) {
                    if (wielkieLiteryCheckBox.isSelected() == true) {
                        textFFarenhait.setFont(new Font("SansSerif", Font.BOLD, 18));
                    }else{
                        textFFarenhait.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    }
                }else if (ob1 == czcionkaMalaRadioButton){
                    textFFarenhait.setFont(new Font("SansSerif", Font.PLAIN, 8));
                }else if (ob1 == czcionkaSrednia){
                    textFFarenhait.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }else if (ob1 == czcionkaDuza){
                    textFFarenhait.setFont(new Font("SansSerif", Font.PLAIN, 20));
                }
            }
        };

        KonwertujButton.addActionListener(listener);
        resetButton.addActionListener(listener);
        ExitButton.addActionListener(listener);
        wielkieLiteryCheckBox.addActionListener(listener);
        czcionkaMalaRadioButton.addActionListener(listener);
        czcionkaSrednia.addActionListener(listener);
        czcionkaDuza.addActionListener(listener);
    }
}
