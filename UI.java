package financialcomputing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class UI extends JFrame {
	
	private JTabbedPane tabbedPane;
	private tabone firstTab;
	private tabtwo secondTab;

	public UI() {
		super("Business and Financial Computing");
		setMinimumSize(new Dimension(800, 600));
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		firstTab = new tabone();
		secondTab = new tabtwo();
		tabbedPane = new JTabbedPane();
		add(tabbedPane);
		tabPanel();
		
		
		
	} 
	
		
	public void tabPanel(){
		tabbedPane.add("First Tab", firstTab);
		tabbedPane.add("Second Tab", secondTab);
	}
	
}
