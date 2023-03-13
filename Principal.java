import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
    
    private JMenuBar menubar;
    private JMenu Opciones, Calcular, AcercaDe, subColorDeFondo;
    private JMenuItem item1, item2, item3, item4,item5,item6,item7;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label0;
    private JTextField campo1, campo2, campo3;
    protected JScrollPane scroll;
    private JTextArea areaResultado;
    private JComboBox combo1, combo2;
    String nombre = "";
    
    public Principal(){
        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);        
        getContentPane().setBackground(new Color(255,0,0));
        
        //BARRA DE CIERRE
        setTitle("Pantalla principal");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
	Bienvenida apkBienvenida = new Bienvenida();
	nombre = apkBienvenida.bienvenidoNombre;

        //BARRA DE MENU
        menubar = new JMenuBar();

        menubar.setBackground(new Color(255,0,0));
        setJMenuBar(menubar);
        
        //SECCIONES DE MENU: OPCIONES-CALCULAR-ACERCADE
        Opciones = new JMenu("Opciones");
        Opciones.setBackground(new Color(255,0,0));
        Opciones.setFont(new Font("Andale Mono", 1, 14));
        Opciones.setForeground(new Color(255,255,255));
        menubar.add(Opciones);
        
        Calcular = new JMenu("Calcular");
        Calcular.setBackground(new Color(255,0,0));
        Calcular.setFont(new Font("Andale Mono", 1, 14));
        Calcular.setForeground(new Color(255,255,255));
        menubar.add(Calcular);
        
        AcercaDe = new JMenu("Acerca de");
        AcercaDe.setBackground(new Color(255,0,0));
        AcercaDe.setFont(new Font("Andale Mono", 1, 14));
        AcercaDe.setForeground(new Color(255,255,255));
        menubar.add(AcercaDe);
        
        //ITEMS DE LAS SECCIONES
        subColorDeFondo = new JMenu("Color de fondo");
        Opciones.add(subColorDeFondo);
        
        item1 = new JMenuItem("Rojo");
        item1.setFont(new Font("Andale Mono", 1, 14));
        item1.setForeground(new Color(255,255,255));
        subColorDeFondo.add(item1);
        item1.addActionListener(this);
        
        item2 = new JMenuItem("Negro");
        item2.setFont(new Font("Andale Mono", 1, 14));
        item2.setForeground(new Color(255,255,255));
        subColorDeFondo.add(item2);
        item2.addActionListener(this);
        
        item3 = new JMenuItem("Morado");
        item3.setFont(new Font("Andale Mono", 1, 14));
        item3.setForeground(new Color(255,255,255));
        subColorDeFondo.add(item3);
        item3.addActionListener(this);
        
        
        item4 = new JMenuItem("Nuevo");
        item4.setFont(new Font("Andale Mono", 1, 14));
        item4.setForeground(new Color(255,255,255));
        Opciones.add(item4);
        item4.addActionListener(this);
        
        item5 = new JMenuItem("Salir");
        item5.setFont(new Font("Andale Mono", 1, 14));
        item5.setForeground(new Color(255,255,255));
        Opciones.add(item5);
        item5.addActionListener(this);

        
        item6 = new JMenuItem("Vacaciones");
        item6.setFont(new Font("Andale Mono", 1, 14));
        item6.setForeground(new Color(255,255,255));
        Calcular.add(item6);
        item6.addActionListener(this);
        
        
        item7 = new JMenuItem("El creador");
        item7.setFont(new Font("Andale Mono", 1, 14));
        item7.setForeground(new Color(255,255,255));
        AcercaDe.add(item7);
        item7.addActionListener(this);
        
        
    //ETIQUETAS
        //IMAGEN
        ImageIcon imagen= new ImageIcon("images/logo-coca.png");
        label0 = new JLabel(imagen);
        label0.setBounds(5, 5, 250, 100);
        add(label0);
        
        //DE DATOS
        label1 = new JLabel("Bienvenido "+nombre);
        label1.setBounds(280, 30, 300, 50);
        label1.setFont(new Font("Andale Mono", 1, 32));
        label1.setForeground(new Color(255,255,255));
        add(label1);
        
        label2 = new JLabel("Datos del trabajador para el calculo de vacaciones");
        label2.setBounds(45, 140, 900, 25);
        label2.setFont(new Font("Andale Mono", 0, 24));
        label2.setForeground(new Color(255,255,255));
        add(label2);
    
    //INGRESO DE TEXTO    
        //TEXT FIELDS & FIELDS
        label3 = new JLabel("Nombre Completo:");
        label3.setBounds(25, 188, 180, 25);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        campo1 = new JTextField();
        campo1.setBounds(25, 213, 150, 25);
        campo1.setBackground(new Color(244,244,244));
        campo1.setFont(new java.awt.Font("Andale Mono", 1, 14));
        campo1.setForeground(new Color(255,0,0));
        add(campo1);
        
        
        label4 = new JLabel("Apellido Paterno:");
        label4.setBounds(25, 248, 180, 25);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);        
        
        campo2 = new JTextField();
        campo2.setBounds(25, 273, 150, 25);
        campo2.setBackground(new Color(244,244,244));
        campo2.setFont(new java.awt.Font("Andale Mono", 1, 14));
        campo2.setForeground(new Color(255,0,0));        
        add(campo2);
        
        
        label5 = new JLabel("Apellido Materno:");
        label5.setBounds(25, 308, 180, 25);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(255,255,255));
        add(label5);     
        
        campo3 = new JTextField();
        campo3.setBounds(25, 334, 150, 25);
        campo3.setBackground(new Color(244,244,244));
        campo3.setFont(new java.awt.Font("Andale Mono", 1, 14));
 
        campo3.setForeground(new Color(255,0,0));
        add(campo3);
        
    //COMBO BOXES
        //COMBO BOX UNO
        label6 = new JLabel("Selecciona el Departamento:");
        label6.setBounds(220, 188, 180, 25);
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(new Color(255,255,255));
        add(label6);
             
        combo1 = new JComboBox();
        combo1.setBounds(220, 213, 220, 25);
        combo1.setBackground(new Color(244,244,244));
        combo1.setFont(new Font("Andale Mono", 1, 14));

        combo1.setForeground(new Color(255,0,0));
        add(combo1);
     
        //ITEMS DEL COMBO
        combo1.addItem("");
        combo1.addItem("Atencion al Cliente");
        combo1.addItem("Departamento de Logistica");
        combo1.addItem("Departamento de Gerencia");
      
        
        //COMBO BOX DOS
        label7 = new JLabel("Selecciona la Antiguedad:");
        label7.setBounds(220, 248, 180, 25);
        label7.setFont(new Font("Andale Mono", 1, 12));
        label7.setForeground(new Color(255,255,255));
        add(label7);  
        
        combo2 = new JComboBox();
        combo2.setBounds(220, 273, 220, 25);
        combo2.setBackground(new Color(244,244,244));
        combo2.setFont(new Font("Andale Mono", 1, 14));

        combo2.setForeground(new Color(255,0,0));
        add(combo2);
        
        //ITEMS DEL COMBO
        combo2.addItem("");
        combo2.addItem("1 ano de servicio.");
        combo2.addItem("2 a 6 anos de servicio.");
        combo2.addItem("7 o mas anos de servicio.");

        
    //TEXT AREA
        label8 = new JLabel("Resultado del Calculo:");
        label8.setBounds(220, 307, 180, 25);
        label8.setFont(new Font("Andale Mono", 1, 12));
        label8.setForeground(new Color(255,255,255));
        add(label8);
        
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setBackground(new Color(244,244,244));
        areaResultado.setFont(new Font("Andale Mono", 1, 11));
        areaResultado.setForeground(new Color(0,0,0));
        areaResultado.setText("\n RESULTADO DE LAS BUSQUEDAS!!!");
        scroll = new JScrollPane(areaResultado);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);
        
        //FOOTER
        label9 = new JLabel("©2017 Coca-Cola Company | Todos los derechos reservados");
        label9.setBounds(135, 445, 500, 30);
        label9.setFont(new java.awt.Font("Andale Mono", 1, 12));
        label9.setForeground(new Color(255,255,255));
        add(label9);
        
    }

    
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == item1) {
	getContentPane().setBackground(new Color(255,0,0));
        }

        if (e.getSource() == item2){
	getContentPane().setBackground(new Color(0,0,0));
	}

        if (e.getSource() == item3) {
	getContentPane().setBackground(new Color(51,0,51));
	}

        if (e.getSource() == item4) {

	campo1.setText("");
	campo2.setText("");
	campo3.setText("");
	combo1.setSelectedIndex(0);
	combo2.setSelectedIndex(0);
	areaResultado.setText("\n RESULTADO DE LAS BUSQUEDAS!!!");

	}

        if (e.getSource() == item5) {

        Bienvenida a = new Bienvenida();
        a.setBounds(0, 0, 350, 450);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
	this.setVisible(false);
	}

        if (e.getSource() == item6) {

		String nombre= campo1.getText();
		String papellido= campo2.getText();
		String mapellido= campo3.getText();
		String dpto= combo1.getSelectedItem().toString();
		String antiguedad= combo2.getSelectedItem().toString();

		if(nombre.equals("") || papellido.equals("") || mapellido.equals("") || dpto.equals("") || antiguedad.equals("")){

			JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos.");

		}
		else{
			if(dpto.equals("Atencion al Cliente")){
				if(antiguedad.equals("1 ano de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" de "+dpto+", \ntiene derecho a 6 dias de vacaciones.");
				}
				if(antiguedad.equals("2 a 6 anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" de "+dpto+", \ntiene derecho a 14 dias de vacaciones.");
				}
				if(antiguedad.equals("7 o mas anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" de "+dpto+", \ntiene derecho a 20 dias de vacaciones.");
				}
			} 

			if(dpto.equals("Departamento de Logistica")){
				if(antiguedad.equals("1 ano de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 7 dias de vacaciones.");
				}
				if(antiguedad.equals("2 a 6 anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 15 dias de vacaciones.");
				}
				if(antiguedad.equals("7 o mas anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 22 dias de vacaciones.");
				}					
			}
			if(dpto.equals("Departamento de Gerencia")){
				if(antiguedad.equals("1 ano de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 10 dias de vacaciones.");
				}
				if(antiguedad.equals("2 a 6 anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 20 dias de vacaciones.");
				}
				if(antiguedad.equals("7 o mas anos de servicio.")){
					areaResultado.setText("\n El trabajador "+nombre+" "+papellido+" "+mapellido+" del "+dpto+", \ntiene derecho a 30 dias de vacaciones.");
				}				
			}
		}

	}

        if (e.getSource() == item7) {
	JOptionPane.showMessageDialog(null, "Desarrollado por Michel San Martin\n"+
					    "	Para propositos academicos.");
	}

    }

    
    public static void main(String[] args){
        Principal vp = new Principal();
        vp.setBounds(0, 0, 640, 535);
        vp.setVisible(true);
        vp.setResizable(false);
        vp.setLocationRelativeTo(null);
    }

}
