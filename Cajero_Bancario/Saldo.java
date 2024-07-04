package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame {
    private JButton MENUButton;
    private JTextField textField1;
    private JPanel JPanel_Saldo;

    public Saldo (){
        super("SALDO");
        setContentPane(JPanel_Saldo);

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transaccion ventana_transaccion = new Transaccion();
                ventana_transaccion.iniciar();
                dispose();

            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
