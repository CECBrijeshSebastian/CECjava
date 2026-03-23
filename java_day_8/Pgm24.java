import java.awt.*;
import java.awt.event.*;

public class Pgm24 extends Frame implements ActionListener {

    TextField t1, t2, t3, result;
    Button b;

    Pgm24(){
        // Labels
        Label l1 = new Label("Enter first number:");
        Label l2 = new Label("Enter second number:");
        Label l3 = new Label("Enter third number:");
        Label l4 = new Label("Largest number:");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        result = new TextField();
        result.setEditable(false);

        // Button
        b = new Button("Find Largest");
        b.addActionListener(this);

        // Layout
        setLayout(new GridLayout(5, 2));

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(result);
        add(b);

        // Frame settings
        setTitle("Largest of 3 Numbers");
        setSize(300, 300);
        setVisible(true);

        // Close window
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
            int c = Integer.parseInt(t3.getText());

            int largest;

            if (a >= b && a >= c)
                largest = a;
            else if (b >= a && b >= c)
                largest = b;
            else
                largest = c;

            result.setText(String.valueOf(largest));

        } catch (Exception ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Pgm24();
    }
}
