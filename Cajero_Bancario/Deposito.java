package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame{
    private JPanel DEPOSITO1;
    private JTextField deposito_valor;
    private JPanel DEPOSITO2;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ENTERButton;
    private JButton MENUButton;

    public Deposito() {
        super("Depósito");
        setContentPane(DEPOSITO1);
        setContentPane(DEPOSITO2);
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor_deposito = Float.parseFloat(deposito_valor.getText());

            }
        });
    }
}


