import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEnerge extends JFrame {

    JTextField V0;
    JTextField A;

    public PEnerge() {

        super("Вираховування потенціальної енергії води");
        super.setBounds(700, 300, 450, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel v0r = new JLabel("Введіть початкову швидкість v0: ");
        V0 = new JTextField(2);
        JLabel ar = new JLabel("Введіть кут у градусах (0 < A < 90): ");
        A = new JTextField(2);

        cont.add(v0r);
        cont.add(V0);
        cont.add(ar);
        cont.add(A);


        JButton butt = new JButton("Порахувати");

        cont.add(butt);

        butt.addActionListener(new Button_());
    }

    class Button_ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(A.getText());
                if (a <= 0 || a >= 90) {
                    JOptionPane.showMessageDialog(null, "Кут A має бути в межах від 0 до 90 градусів.");
                    return;
                }

                double v0 = Double.parseDouble(V0.getText());
                double sina = Math.sin(Math.toRadians(a));
                double h = Math.pow((v0 * sina), 2) / (2 * 9.8);
                JOptionPane.showMessageDialog(null, "Результат: " + h + " м");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введіть коректне число.");
            }
        }
    }
}
