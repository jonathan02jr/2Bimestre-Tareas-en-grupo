package Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{
    private JTextField valor_retiro;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton MENUButton;
    private JButton a0Button;
    private JButton ENTERButton;
    private JPanel RETIRO1;

    public Retiro() {
        super("Retiro");
        setContentPane(RETIRO1);
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor_a_retirar = Float.parseFloat(valor_retiro.getText());
                Saldo.Cuenta saldo_actual1= new Saldo.Cuenta();
                saldo_actual1.retirar(valor_a_retirar);
                valor_retiro.setText(" ");
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
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_retiro.setText(valor_retiro.getText()+"0");
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


