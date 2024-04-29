import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class App extends JFrame implements ActionListener {
    public Container c;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnMultiply, btnDivide,
            btnEqual, btnClear, btnDot;
    JTextField tf;
    double firstNumber, secondNumber, result;
    String operation;

    Font buttonFont = new Font("ADLaM Display", Font.BOLD, 18);
    Font signature = new Font("Arty Signature", Font.BOLD, 40);
    Font tf_Font = new Font("Digital-7", Font.PLAIN, 40);

    App() {
        c = getContentPane();
        c.setLayout(null);
        Color color = new Color(35, 35, 35);
        c.setBackground(color);
        ImageIcon i = new ImageIcon("D:\\CSE 213(JAVA)\\LAB\\Calculator\\src\\image.png");
        setIconImage(i.getImage());

        Color buttonColor = new Color(55, 55, 55);
        Color buttonColor_2 = new Color(77, 77, 77);
        Color textColor = new Color(99, 92, 74);
        Color border = new Color(216, 219, 212);

        JLabel l = new JLabel("ASIF");
        l.setBounds(210, 360, 100, 50);
        l.setFont(signature);
        l.setForeground(buttonColor_2);
        c.add(l);

        Color color3 = new Color(187, 180, 160);
        tf = new JTextField();
        tf.setBounds(30, 50, 290, 70);
        tf.setBackground(color3);
        tf.setFont(tf_Font);
        tf.setEditable(false);
        tf.setBorder(BorderFactory.createLineBorder(border, 15));
        c.add(tf);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("x");
        btnDivide = new JButton("/");
        btnEqual = new JButton("=");
        btnClear = new JButton("C");
        btnDot = new JButton(".");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEqual.addActionListener(this);
        btnClear.addActionListener(this);
        btnDot.addActionListener(this);

        btn1.setBackground(buttonColor);
        btn1.setForeground(textColor);
        btn1.setFont(buttonFont);
        btn1.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn2.setBackground(buttonColor);
        btn2.setForeground(textColor);
        btn2.setFont(buttonFont);
        btn2.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn3.setBackground(buttonColor);
        btn3.setForeground(textColor);
        btn3.setFont(buttonFont);
        btn3.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn4.setBackground(buttonColor);
        btn4.setForeground(textColor);
        btn4.setFont(buttonFont);
        btn4.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn5.setBackground(buttonColor);
        btn5.setForeground(textColor);
        btn5.setFont(buttonFont);
        btn5.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn6.setBackground(buttonColor);
        btn6.setForeground(textColor);
        btn6.setFont(buttonFont);
        btn6.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn7.setBackground(buttonColor);
        btn7.setForeground(textColor);
        btn7.setFont(buttonFont);
        btn7.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn8.setBackground(buttonColor);
        btn8.setForeground(textColor);
        btn8.setFont(buttonFont);
        btn8.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn9.setBackground(buttonColor);
        btn9.setForeground(textColor);
        btn9.setFont(buttonFont);
        btn9.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn0.setBackground(buttonColor);
        btn0.setForeground(textColor);
        btn0.setFont(buttonFont);
        btn0.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnPlus.setBackground(buttonColor_2);
        btnPlus.setForeground(Color.WHITE);
        btnPlus.setFont(buttonFont);
        btnPlus.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnMinus.setBackground(buttonColor_2);
        btnMinus.setForeground(Color.WHITE);
        btnMinus.setFont(buttonFont);
        btnMinus.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnMultiply.setBackground(buttonColor_2);
        btnMultiply.setForeground(Color.WHITE);
        btnMultiply.setFont(buttonFont);
        btnMultiply.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnDivide.setBackground(buttonColor_2);
        btnDivide.setForeground(Color.WHITE);
        btnDivide.setFont(buttonFont);
        btnDivide.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnEqual.setBackground(buttonColor_2);
        btnEqual.setForeground(Color.WHITE);
        btnEqual.setFont(buttonFont);
        btnEqual.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnClear.setBackground(buttonColor_2);
        btnClear.setForeground(Color.WHITE);
        btnClear.setFont(buttonFont);
        btnClear.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnDot.setBackground(buttonColor_2);
        btnDot.setForeground(Color.WHITE);
        btnDot.setFont(buttonFont);
        btnDot.setBorder(new EmptyBorder(0, 0, 0, 0));

        btn1.setBounds(30, 300, 50, 50);
        btn2.setBounds(90, 300, 50, 50);
        btn3.setBounds(150, 300, 50, 50);
        btn4.setBounds(30, 240, 50, 50);
        btn5.setBounds(90, 240, 50, 50);
        btn6.setBounds(150, 240, 50, 50);
        btn7.setBounds(30, 180, 50, 50);
        btn8.setBounds(90, 180, 50, 50);
        btn9.setBounds(150, 180, 50, 50);
        btn0.setBounds(90, 360, 50, 50);
        btnDot.setBounds(150, 360, 50, 50);
        btnPlus.setBounds(210, 180, 50, 50);
        btnMinus.setBounds(210, 240, 50, 50);
        btnMultiply.setBounds(210, 300, 50, 50);
        btnDivide.setBounds(270, 180, 50, 50);
        btnEqual.setBounds(270, 240, 50, 110);
        btnClear.setBounds(30, 360, 50, 50);

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btn0);
        c.add(btnPlus);
        c.add(btnMinus);
        c.add(btnMultiply);
        c.add(btnDivide);
        c.add(btnEqual);
        c.add(btnClear);
        c.add(btnDot);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClear) {
            tf.setText("");
            firstNumber = 0;
            secondNumber = 0;
            result = 0;
            operation = "";
        } else if (e.getSource() == btnDot) {
            tf.setText(tf.getText() + ".");
        } else if (e.getSource() == btnPlus) {
            firstNumber = Double.parseDouble(tf.getText());
            tf.setText("");
            operation = "+";
        } else if (e.getSource() == btnMinus) {
            firstNumber = Double.parseDouble(tf.getText());
            tf.setText("");
            operation = "-";
        } else if (e.getSource() == btnMultiply) {
            firstNumber = Double.parseDouble(tf.getText());
            tf.setText("");
            operation = "x";
        } else if (e.getSource() == btnDivide) {
            firstNumber = Double.parseDouble(tf.getText());
            tf.setText("");
            operation = "/";
        } else if (e.getSource() == btnEqual) {
            secondNumber = Double.parseDouble(tf.getText());
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "x":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
            tf.setText(Double.toString(result));
            firstNumber = 0;
            secondNumber = 0;
            result = 0;
            operation = "";
        } else {
            tf.setText(tf.getText() + e.getActionCommand());
        }

    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setBounds(500, 150, 360, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}