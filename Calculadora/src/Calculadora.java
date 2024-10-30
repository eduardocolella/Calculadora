import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtResultado;
    private JButton btnSomar;
    private JButton btnLimpar;
    private JTextField txtSegundoValor;
    private JPanel panelMain;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());
                Integer soma = primeiro + segundo;

                txtResultado.setText(String.valueOf(soma));

            }

        });
        

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
