import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwing extends  JFrame{
    private JPanel panel1;
    private JButton okbutton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
//    private JButton button1;
//    private JCheckBox checkBox1;
//    private JComboBox comboBox1;
//    private JLabel text;


    public FirstSwing(){
        super("First window");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


//        int default_width = 300;
//        int default_height = 250;
//
//        setSize(default_width, default_height);
//
//        setLayout(null);
//
//        text = new JLabel("Everybody");
//        text.setBounds(50, 50 , 100,100);
//        panel1.add(text);
        okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null , "hello");
            }
        });
    }

    public static void main(String[] args) {
        FirstSwing firstSwing = new FirstSwing();
        firstSwing.setVisible(true);
    }
}
