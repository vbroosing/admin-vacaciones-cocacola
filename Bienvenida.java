import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Image.*;

public class Bienvenida extends JFrame implements ActionListener{
    
    private JTextField campo;
    private JButton btn;
    private JLabel label1, label2, label3, label4;

    public static String bienvenidoNombre = "";
    
    public Bienvenida(){
        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(Color.red);
        
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        ImageIcon imagen= new ImageIcon("images/logo-coca.png");
        
        label1 = new JLabel(imagen);
        label1.setBounds(25, 15, 300, 150);
        add(label1);
        
        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(Color.white);
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre:");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(Color.white);
        add(label3);
        
        label4 = new JLabel("©2021 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(Color.white);
        add(label4);
        
        campo = new JTextField("");
        campo.setBounds(45, 240, 255, 25);
        campo.setBackground(Color.lightGray);
        campo.setFont(new Font("Andale Mono", 1, 14));
        campo.setForeground(Color.red);
        add(campo);
        
        btn = new JButton("Aceptar");
        btn.setBounds(125, 280, 100, 30);
        btn.setBackground(Color.white);
        btn.setFont(new Font("Andale Mono", 1, 14));
        btn.setForeground(Color.red);
        add(btn);
        btn.addActionListener(this);  
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            bienvenidoNombre = campo.getText().trim();
	    if(bienvenidoNombre.equals("")){
	        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
	    }
	    else{
		TerminosYCondiciones a = new TerminosYCondiciones();
                a.setBounds(0, 0, 600, 360);
                a.setVisible(true);
                a.setResizable(false);
        	a.setLocationRelativeTo(null);
		this.setVisible(false);
		}
        }
    } 
    public static void main(String[] srgs){
        Bienvenida a = new Bienvenida();
        a.setBounds(0, 0, 350, 450);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
    }
}