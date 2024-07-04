package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame {
    private JButton MENUButton;
    private JPanel JPanel_Saldo;
    private JLabel Saldo_Actual;

    public Saldo (){
        super("SALDO");
        setContentPane(JPanel_Saldo);

        Saldo_Actual.setText("Saldo actual: " + String.valueOf(Cuenta.getSaldo()));

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
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static class Cuenta {
        private static double saldo = 100;

        public static double getSaldo() {
            return saldo;
        }

        public static void depositar(double cantidad) {
            saldo += cantidad;
        }

        public static void retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE","FONDOS INSUFICIENTES", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
