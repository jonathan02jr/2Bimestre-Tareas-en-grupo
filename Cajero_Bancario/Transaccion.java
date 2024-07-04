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

            }
        });

        DEPOSITORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
