package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaccion extends JFrame{
    private JRadioButton VERSALDORadioButton;
    private JRadioButton DEPOSITORadioButton;
    private JRadioButton RETIRORadioButton;
    private JPanel JPanel_Transaccion;
    private JButton SALIRButton;

    public Transaccion(){
        super("TRANSACCION A REALIZAR");
        setContentPane(JPanel_Transaccion);

        VERSALDORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo ventana_saldo = new Saldo();
                ventana_saldo.iniciar();
                dispose();

            }
        });

        RETIRORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Retiro retirar = new Retiro();
            retirar.iniciar();
            dispose();
            }
        });

        DEPOSITORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Deposito depositar = new Deposito();
            depositar.iniciar();
            dispose();
            }
        });


        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Login salida = new Login();
            salida.iniciar();
            dispose();
            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
