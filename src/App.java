import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class App extends JFrame implements ActionListener {
    public Container c;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnMultiply, btnDivide,
            btnEqual, btnClear, btnBack, btnDot;
    JTextField tf;
    double firstNumber, secondNumber, result;
    String operation, answer;

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
        Color equalColor = new Color(255, 102, 56, 255);

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
        btnBack = new JButton("Back");
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
        btnBack.addActionListener(this);
        btnDot.addActionListener(this);

        JButton[] buttons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus,
                btnMultiply, btnDivide, btnEqual, btnClear, btnBack, btnDot };

        for (JButton button : buttons) {
            button.setBackground(buttonColor);
            button.setForeground(textColor);
            button.setFont(buttonFont);
            button.setBorder(new EmptyBorder(0, 0, 0, 0));
        }

        btnPlus.setBackground(buttonColor_2);
        btnMinus.setBackground(buttonColor_2);
        btnMultiply.setBackground(buttonColor_2);
        btnDivide.setBackground(buttonColor_2);
        btnEqual.setBackground(equalColor);
        btnClear.setBackground(buttonColor_2);
        btnBack.setBackground(buttonColor_2);
        btnDot.setBackground(buttonColor_2);

        btnPlus.setForeground(Color.WHITE);
        btnMinus.setForeground(Color.WHITE);
        btnMultiply.setForeground(Color.WHITE);
        btnDivide.setForeground(Color.WHITE);
        btnEqual.setForeground(Color.WHITE);
        btnClear.setForeground(Color.WHITE);
        btnBack.setForeground(Color.WHITE);
        btnDot.setForeground(Color.WHITE);

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
        btnBack.setBounds(210, 360, 110, 50);

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
        c.add(btnBack);
        c.add(btnDot);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btnClear) {
                tf.setText("");
            } else if (e.getSource() == btnBack) {
                String backSpace = null;
                if (tf.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(tf.getText());
                    strB.deleteCharAt(tf.getText().length() - 1);
                    backSpace = strB.toString();
                    tf.setText(backSpace);
                }
            } else if (e.getSource() == btn1) {
                tf.setText(tf.getText() + "1");
            } else if (e.getSource() == btn2) {
                tf.setText(tf.getText() + "2");
            } else if (e.getSource() == btn3) {
                tf.setText(tf.getText() + "3");
            } else if (e.getSource() == btn4) {
                tf.setText(tf.getText() + "4");
            } else if (e.getSource() == btn5) {
                tf.setText(tf.getText() + "5");
            } else if (e.getSource() == btn6) {
                tf.setText(tf.getText() + "6");
            } else if (e.getSource() == btn7) {
                tf.setText(tf.getText() + "7");
            } else if (e.getSource() == btn8) {
                tf.setText(tf.getText() + "8");
            } else if (e.getSource() == btn9) {
                tf.setText(tf.getText() + "9");
            } else if (e.getSource() == btn0) {
                tf.setText(tf.getText() + "0");
            } else if (e.getSource() == btnDot) {
                if (!tf.getText().contains(".")) {
                    tf.setText(tf.getText() + ".");
                }
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
                        answer = String.format("%.2f", result);
                        tf.setText(answer);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        answer = String.format("%.2f", result);
                        tf.setText(answer);
                        break;
                    case "x":
                        result = firstNumber * secondNumber;
                        answer = String.format("%.2f", result);
                        tf.setText(answer);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            JOptionPane.showMessageDialog(null, "Can't divide by zero");
                        } else {
                            result = firstNumber / secondNumber;
                            answer = String.format("%.2f", result);
                            tf.setText(answer);
                        }
                        break;
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
            tf.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Operation not complete");
            tf.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setTitle("Simple Calculator");
        frame.setVisible(true);
        frame.setBounds(500, 150, 360, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
