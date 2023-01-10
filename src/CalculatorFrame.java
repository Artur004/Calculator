import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class CalculatorFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorFrame().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton ACButton;
    private JButton MinusButton;
    private JButton MultiplyButton;
    private JButton DivideButton;
    private JButton EqualsButton;
    private JButton DeleteButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton SingButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton PlusButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton FloatedPointButton;

    public CalculatorFrame() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
                Calculation.setOperator(null);
            }
        });
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() > 0) {
                    String displayText = textDisplay.getText();
                    textDisplay.setText(displayText.substring(0, displayText.length() - 1));
                } else Toolkit.getDefaultToolkit().beep();
            }
        });
        SingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textDisplay.getText().startsWith("-")) {
                    textDisplay.setText("-" + textDisplay.getText());
                } else {
                    String txt = textDisplay.getText().substring(1);
                    textDisplay.setText(txt);
                }
            }
        });         // +\-

        PlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() > 0) {
                    Calculation.setFirstValue(textDisplay.getText());
                }
                Calculation.setOperator(Operator.PLUS);
                textDisplay.setText("");
            }
        });
        MinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() > 0) {
                    Calculation.setFirstValue(textDisplay.getText());
                }
                Calculation.setOperator(Operator.MINUS);
                textDisplay.setText("");
            }
        });
        MultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() > 0) {
                    Calculation.setFirstValue(textDisplay.getText());
                    Calculation.setOperator(Operator.MULTIPLICATION);
                    textDisplay.setText("");
                }
            }
        });
        DivideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() > 0) {
                    Calculation.setFirstValue(textDisplay.getText());
                }
                Calculation.setOperator(Operator.DIVISION);
                textDisplay.setText("");
            }
        });
        EqualsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculation.setSecondValue(textDisplay.getText());
                textDisplay.setText(Calculation.getResult());
            }
        });
        FloatedPointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textDisplay.getText().contains(".")) {
                    textDisplay.setText(textDisplay.getText() + FloatedPointButton.getText());
                }
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a00Button.getText());

            }
        });

        //Checking input
        textDisplay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != '.') {
                    e.consume();
                }
                if (e.getKeyChar() == '.' && textDisplay.getText().contains(".")) {
                    e.consume();
                }
                super.keyTyped(e);
            }
        });

    }

}
