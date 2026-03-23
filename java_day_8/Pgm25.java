import java.awt.*;
import java.awt.event.*;

public class Pgm25 extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    Pgm25() {
        Label l1 = new Label("Enter first number:");
        Label l2 = new Label("Enter second number:");
        Label l3 = new Label("Answer:");

        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setLayout(new GridLayout(5, 2));

        add(l1); add(t1);
        add(l2); add(t2);
        add(add); add(sub);
        add(mul); add(div);
        add(l3); add(result);

        setTitle("Calculator");
        setSize(300, 250);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int ans = 0;

            if (e.getSource() == add)
                ans = a + b;
            else if (e.getSource() == sub)
                ans = a - b;
            else if (e.getSource() == mul)
                ans = a * b;
            else if (e.getSource() == div){
	        if (b == 0) {
    			result.setText("Cannot divide");
    			return;
		}
                ans = a / b;
	    }

            result.setText(String.valueOf(ans));

        } catch (Exception ex) {
            result.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Pgm25();
    }
}
