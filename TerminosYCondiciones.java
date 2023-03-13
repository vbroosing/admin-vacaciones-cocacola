import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;



public class TerminosYCondiciones extends JFrame implements ActionListener, ChangeListener{
    
    private JLabel label1, label2;
    private JCheckBox CBox;
    private JButton bCont, bNoAcc;
    private JScrollPane scrollPane1;
    private JTextArea textA;
    String nombre = "";
    
    public TerminosYCondiciones(){
        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
	
        
	Bienvenida apkBienvenida = new Bienvenida();
	nombre = apkBienvenida.bienvenidoNombre;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
       
        textA = new JTextArea();
        textA.setEditable(false);
        textA.setFont(new Font("Andale Mono", 0, 9));
        textA.setText("\n\n          TERMINOS Y CONDICIONES "+
                "\n\n          A.    PROHIBIDA SU VENTA Y DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO."+
                "\n          B.    PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GROFICAS."+
                "\n          C.    LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE"+
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED"+
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"+
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
                "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR CONTACTE"+
                "\n          CON EL PROVEEDOR.");
        
        scrollPane1 = new JScrollPane(textA);
        scrollPane1.setBounds(10, 40, 575, 200);
        add(scrollPane1);
        
        CBox = new JCheckBox("Yo "+nombre+" Acepto");
        CBox.setBounds(10, 250, 300, 30);
        CBox.addChangeListener(this);
        add(CBox);
        
        bCont = new JButton("Continuar");
        bCont.setBounds(10, 290, 100, 30);
        bCont.addActionListener(this);
        bCont.setEnabled(false);
        add(bCont);
        
        bNoAcc = new JButton("No Acepto");
        bNoAcc.setBounds(120, 290, 100, 30);
        bNoAcc.addActionListener(this);
        bNoAcc.setEnabled(true);
        add(bNoAcc);
        
	ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if(CBox.isSelected() == true){
	    bCont.setEnabled(true);
	    bNoAcc.setEnabled(false);
	}
	else{
	    bCont.setEnabled(false);
	    bNoAcc.setEnabled(true);
	}
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bNoAcc) {
	    Bienvenida a = new Bienvenida();
            a.setBounds(0, 0, 350, 450);
            a.setVisible(true);
            a.setResizable(false);
            a.setLocationRelativeTo(null);
	    this.setVisible(false);
            
	}else if(e.getSource() == bCont){
	    Principal vp = new Principal();
            vp.setBounds(0, 0, 640, 535);
            vp.setVisible(true);
            vp.setResizable(false);
            vp.setLocationRelativeTo(null);
	    this.setVisible(false);
	}
    }

    
    
    public static void main(String[] srgs){
        TerminosYCondiciones a = new TerminosYCondiciones();
        a.setBounds(0, 0, 600, 360);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
    }
    
}
