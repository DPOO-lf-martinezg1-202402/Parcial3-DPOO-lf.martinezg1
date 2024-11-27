
package presentacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class FPrincipal extends JFrame implements ActionListener {

	
	//interfaz
	JPanel pColores;
	JLabel labelR;
	JLabel labelG;
	JLabel labelB;
	JTextField textoR;
	JTextField textoG;
	JTextField textoB;
	
	JButton bCuadrado;
	JButton bCirculo;
	JPanel pFigura;
	
	PLienzo pLienzo; //para dibujar las cuestiones
	
	public FPrincipal() {
		
		this.setTitle("Laura Fernanda Martinez Galindo");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		
		this.pColores = new JPanel();
		this.pColores.setLayout(new GridLayout(7, 2, 1, 1));
		this.labelR = new JLabel("R");
		this.textoR = new JTextField();
		this.labelG = new JLabel("G");
		this.textoG = new JTextField();
		this.labelB = new JLabel("B");
		this.textoB = new JTextField();
		
		this.bCuadrado = new JButton("Cuadrado");
		this.bCuadrado.addActionListener(this);
		this.bCirculo = new JButton("Circulo");
		this.bCirculo.addActionListener(this);
		
		this.pColores.add(labelR);
		this.pColores.add(textoR);
		this.pColores.add(labelG);
		this.pColores.add(textoG);
		this.pColores.add(labelB);
		this.pColores.add(textoB);
		this.pColores.add(bCuadrado);
		this.pColores.add(bCirculo);
		
		this.add(pColores, BorderLayout.WEST);
		
		//this.pFigura = new JPanel();
		
		
		this.pLienzo = new PLienzo(0, 0, 0, null); //inicializar nada más
		this.add(this.pLienzo, BorderLayout.CENTER);
		//en el centro un grafics
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*JButton botonOprimido = (JButton) e.getSource();
		if (botonOprimido.getText().equals("Cuadrado")) {
			this.pLienzo.(Integer.parseInt(this.textoR.getText()), Integer.parseInt(this.textoR.getText()), Integer.parseInt(this.textoR.getText()), botonOprimido.getText());
		}
		else if (botonOprimido.getText().equals("Circulo")) {
			this.pLienzo.pintarCirculo(this.textoR, this.textoG, this.textoB);
		}
		*/
		
		JButton botonOprimido = (JButton) e.getSource();
		//crear nueva instancia de pLienzo con los datos que se tienen
		if (this.textoR.getText() != "" && this.textoG.getText() != "" && this.textoB.getText() != "") {
			this.pLienzo = new PLienzo(Integer.parseInt(this.textoR.getText()), Integer.parseInt(this.textoG.getText()), Integer.parseInt(this.textoB.getText()), botonOprimido.getText());
			//this.pLienzo.update();
			this.add(this.pLienzo, BorderLayout.CENTER);
		}
		
		else {
			JOptionPane.showMessageDialog(this, "Debe ingresar los valores de R,G,B para dibujar la figura", "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new FPrincipal();
	}

}
