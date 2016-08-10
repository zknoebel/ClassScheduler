import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputWindow extends JFrame{
	private JLabel title = new JLabel();
	private JTextArea warning = new JTextArea();
	private JTextField[] classNameTxtField = new JTextField[10];
	private JComboBox[][] classTimeComboBox = new JComboBox[10][28];
	
	public InputWindow(){

	      Container cp = this.getContentPane();
	      cp.setLayout(new FlowLayout());
	      
	}
	

}
