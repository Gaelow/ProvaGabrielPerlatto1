/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CaluclaICM extends JFrame implements ActionListener{
    private static final JTextField peso = new JTextField("Peso");
    private static final JTextField altura = new JTextField("Altura");
    private static final JButton btnICM = new JButton("ICM");
    
    public static void main(String args[]){
        CaluclaICM frame = new CaluclaICM();
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        frame.setSize(700,100);
        frame.setLocation(1024/3,769/2);
        peso.setColumns(10);
        altura.setColumns(10);
        cont.add(btnICM);
        cont.add(peso);
        cont.add(altura);
        btnICM.addActionListener(frame);
        frame.setVisible(true);
        peso.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                peso.setText("");
            }
        });
        altura.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                altura.setText("");
            }
        });
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnICM){
            double resultado = this.calculaicm(Double.parseDouble(peso.getText()), Double.parseDouble(altura.getText()));
            this.mostraResultado(resultado);
        }
        
    }
    
    public double calculaicm (double x, double y){
        return (x/(y*y));
    }
    
    public void mostraResultado(double x){
        if(x < 16){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Magreza grave");
        }else if(x >= 16 && x < 17){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Magreza moderada");
        }else if(x >= 17 && x < 18.5){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Magreza leve");
        }else if(x >= 18.5 && x < 25){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Saudável");
        }else if(x >= 25 && x < 30){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Sobrepeso");
        }else if(x >= 30 && x < 35){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Obesidade grau I");
        }else if(x >= 35 && x < 40){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Obesidade grau II (severa)");
        }else if(x >= 40){
            JOptionPane.showMessageDialog(null,"O ICM é:"+ x +" Obesidade grau III (morbida)");
        }
    }
    
}
