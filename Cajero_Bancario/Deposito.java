package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame{
   private JPanel DEPOSITO1;
    private JTextField deposito_valor;
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
    private JPanel JPanel_Deposito;
    ;

    public Deposito() {
        super("Depósito");
        setContentPane(JPanel_Deposito);
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor_deposito = Float.parseFloat(deposito_valor.getText());
                    Saldo.Cuenta  deposito_realizar = new Saldo.Cuenta();
                    deposito_realizar.depositar(valor_deposito);
                deposito_valor.setText("");

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito_valor.setText(deposito_valor.getText()+"0");
            }
        });
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
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


