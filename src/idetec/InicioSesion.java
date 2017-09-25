/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idetec;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author edson
 */
public class InicioSesion extends JFrame{
    
    JLabel usuarioLb = new JLabel("Usuario:");
    JTextField usuarioTF = new JTextField();
    JLabel passwordLb = new JLabel("Contraseña:");
    JTextField passwordTF = new JTextField();
    JButton iniciarSesionB = new JButton("Iniciar Sesión");
    JButton registrarseB = new JButton("Registrarse");
    
    public InicioSesion(){
        this.setTitle("Iniciar Sesion");
        this.setSize(280, 240);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.add(usuarioLb);
        usuarioLb.setBounds(40, 20, 100, 25);
        this.add(usuarioTF);
        usuarioTF.setBounds(100, 20, 150, 25);
        this.add(passwordLb);
        passwordLb.setBounds(20, 70, 100, 25);
        this.add(passwordTF);
        passwordTF.setBounds(100, 70, 150, 25);
        this.add(iniciarSesionB);
        iniciarSesionB.setBounds(80, 115, 120, 25);
        this.add(registrarseB);
        registrarseB.setBounds(10, 175, 105, 25);
        
        
        this.setVisible(true);
    }
}
