
/*
 * autor:
 * 		fernando rafael filipuzzi
 * 
 * e-mail:
 * 		fernando6867@gmail.com
 * 
 * sitio web:
 * 		http://hdcm.sytes.net
 * 		http://hdcm.com.ar
 * */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class App extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JTextField jtfInput = new JTextField(15);
	private JLabel jlOutput = new JLabel(" ");
	
	private JButton jbMostrar = new JButton("Mostrar");
	private JButton jbCerrar = new JButton("Cerrar");
	
	public App(){
		this.getContentPane().setLayout(new BorderLayout());
		this.setTitle("Ejemplo Swing 2");
		
		/*formulario*/
		JPanel jpFormulario = new JPanel();
		this.add(jpFormulario,BorderLayout.CENTER);
		jpFormulario.setLayout(new GridBagLayout());
		jpFormulario.add(new JLabel("Valor: ",SwingConstants.RIGHT),new GridBagConstraints(0,0,1,1,0.0,0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,10,5),1,1));
		jpFormulario.add(jtfInput,new GridBagConstraints(1,0,1,1,0.0,0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(5,5,10,5),1,1));
		
		JPanel jpResultado = new JPanel();
		jpResultado.setLayout(new BorderLayout());
		jpResultado.add(jlOutput, BorderLayout.CENTER);
		jpFormulario.add(new JScrollPane(jpResultado,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS),new GridBagConstraints(0,1,2,2,100.0,100.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(5,5,10,5),1,1));
		
		//http://download.oracle.com/javase/1.4.2/docs/api/java/awt/GridBagConstraints.html#anchor
		//http://download.oracle.com/javase/1.4.2/docs/api/java/awt/GridBagConstraints.html
		
		/*barra de botones*/
		JPanel jpBarraBotones = new JPanel();
		this.add(jpBarraBotones,BorderLayout.SOUTH);
		jpBarraBotones.setLayout(new FlowLayout());		
		jpBarraBotones.add(jbMostrar);
		jbMostrar.addActionListener(this);
		jpBarraBotones.add(jbCerrar);
		jbCerrar.addActionListener(this);				
		
		this.pack();
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e!=null && jbCerrar.equals(e.getSource())){
			System.exit(0);
		}else if(e!=null && jbMostrar.equals(e.getSource())){
			jlOutput.setText(jtfInput.getText());
		}
		
	}

	public static void main(String [] args){
		App app1=new App();
		app1.setVisible(true);
	}
	
}