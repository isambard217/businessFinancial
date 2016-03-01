package financialcomputing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class tabtwo extends JPanel{
	
	private JComboBox comboBox;
	
	public tabtwo(){
		
	String[] listOfFormula = { "Current Ratio", "Working Capital Ratio", "The Debt to Equity Ratio", "Gross Profit Margin Ratio" };
	
	comboBox = new JComboBox(listOfFormula);
	
	comboBox.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JComboBox JComboBox = (JComboBox) e.getSource();
			String option = (String) JComboBox.getSelectedItem();
			
			switch(option)
			{
				case "Current Ratio" :
				System.out.println("Current Ratio formular");
				break;
				
				case "Working Capital Ratio":
				System.out.println("Working Capital Ratio");
				break;
				
				case "The Debt to Equity Ratio":
				System.out.println("The Debt to Equity Ratio");
				break;
				
				case "Gross Profit Margin Ratio":
				System.out.println("Gross Profit Margin Ratio");
				break;
			}
		}
	});
	
	}
}
