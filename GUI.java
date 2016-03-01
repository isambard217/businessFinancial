package financialcomputing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class GUI extends JFrame {

	JLabel secondLabel = new JLabel("Second");
	JTextField jt = new JTextField(30);
	JPanel firstPanel, secondPanel = new JPanel(new FlowLayout());
	
	JTabbedPane tabbedPane = new JTabbedPane();
	
	public static void main(String[]args){
		
		GUI gui = new GUI();
		
	}
	
	public GUI(){
		setTitle("Financial and Business Computing");
		secondPanel.add(secondLabel);
		
		tabbedPane.add("FirstPanel", firstPanel);
		tabbedPane.add("Second Panel", secondPanel);
		this.add(tabbedPane);
		firstPanel.add(jt);
		
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new FlowLayout());
		JPanel secondPanel = new JPanel();
		
	}
}
