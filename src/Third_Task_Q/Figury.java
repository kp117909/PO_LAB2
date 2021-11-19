package Third_Task_Q;

import Second_Task_Q.Temp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Figury extends JFrame{
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostokatRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton trojkatRadioButton;
    private JRadioButton szescianRadioButton;
    private JRadioButton kulaRadioButton;
    private JRadioButton prostopadloscianRadioButton;
    private JRadioButton walecRadioButton;
    private JTextField textFieldBokA;
    private JTextField textFieldBokB;
    private JTextField textFieldWysokosc;
    private JTextField textFielPromien;
    private JTextField textFieldPole;
    private JTextField textFieldObwod;
    private JButton obliczButton;
    private JButton wyczyscButton;
    private JPanel Main;
    private JTextField textFieldObjetosc;

    public static void main(String[] args) {
        Figury conTemp = new Figury();
        conTemp.setVisible(true);
    }

    public Figury(){
        super("Figury Geometryczne Calc");
        this.setContentPane(this.Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);
        DisableAll();
        textFieldBokA.disable();
        textFieldBokB.disable();
        textFieldObjetosc.disable();
        textFieldWysokosc.disable();
        textFielPromien.disable();
        textFieldObwod.disable();
        textFieldPole.disable();

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }

    }

    public DisableAll(){
        textFieldBokA.disable();
        textFieldBokB.disable();
        textFieldObjetosc.disable();
        textFieldWysokosc.disable();
        textFielPromien.disable();
        textFieldObwod.disable();
        textFieldPole.disable();
    }

}
