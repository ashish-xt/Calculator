import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator extends JFrame {
    private JTextField textField1;
    private JButton b7;
    private JButton b1;
    private JButton b4;
    private JButton b5;
    private JButton b8;
    private JButton b2;
    private JButton b9;
    private JButton b6;
    private JButton b3;
    private JButton bdiv;
    private JButton bmult;
    private JButton bsub;
    private JButton bclear;
    private JButton bdot;
    private JButton b0;
    private JButton beq;
    private JButton badd;
    private JPanel mainpanel;

    double first;
    double second;
    double result;
    String operation;
    String answer;


    Calculator()
    {
        setContentPane(mainpanel);
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b1.getText();
                textField1.setText(number);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b2.getText();
                textField1.setText(number);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b3.getText();
                textField1.setText(number);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b4.getText();
                textField1.setText(number);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b5.getText();
                textField1.setText(number);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b6.getText();
                textField1.setText(number);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b7.getText();
                textField1.setText(number);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b8.getText();
                textField1.setText(number);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+b9.getText();
                textField1.setText(number);
            }
        });
        bdot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+bdot.getText();
                textField1.setText(number);
            }
        });
        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
            }
        });
        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="+";
            }
        });
        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="-";
            }
        });
        bmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="*";
            }
        });
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="/";
            }
        });
        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second = Double.parseDouble(textField1.getText());
                if (Objects.equals(operation, "+"))
                {
                    result=first+second;
                    answer = String.valueOf(result);
                    textField1.setText(answer);
                }
                if (Objects.equals(operation, "-"))
                {
                    result=first-second;
                    answer=String.valueOf(result);
                    textField1.setText(answer);
                }
                if (Objects.equals(operation, "*"))
                {
                    result=first*second;
                    answer=String.valueOf(result);
                    textField1.setText(answer);
                }
                if (Objects.equals(operation, "/"))
                {
                    result=first/second;
                    answer=String.valueOf(result);
                    textField1.setText(answer);
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }
}
