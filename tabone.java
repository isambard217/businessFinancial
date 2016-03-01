package financialcomputing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class tabone extends JPanel {
	private JLabel amountLabel;
	private JTextField amount;

	private JLabel interestLabel;
	private JTextField interest;

	private JLabel payBackLabel;
	private JTextField payBack;

	private JLabel answerLabel;
	private JTextField answer;
	
	
	private JComboBox comboBox;
	private JButton submit;

	private Boolean whichFormula = false;

	public tabone() {
		amountLabel = new JLabel("Amount");
		amount = new JTextField(10);

		interestLabel = new JLabel("Interest");
		interest = new JTextField(10);

		payBackLabel = new JLabel("Payback");
		payBack = new JTextField(10);

		String[] formulas = { "Present Value", "Future Value" };
		comboBox = new JComboBox(formulas);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox JComboBox = (JComboBox) e.getSource();
				// System.out.println((boolean)e.getSource());
				String option = (String)JComboBox.getSelectedItem();

				if (option.equals("Present Value")) {
					whichFormula = false;
				} else { // if option.equals equals Future Value set the value
							// to true
					whichFormula = true;
				}
			}
		});

		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				answer.setEditable(false);
				
				double AmountInvested = Integer.parseInt(amount.getText());
				double interestRate = Integer.parseInt(interest.getText());
				double payBackperiod = Integer.parseInt(payBack.getText());
				
				// whichFormula "Present Value" is false "Future Value" is true
				if (whichFormula == true) {

					
					// This returns the String value, this has to be parsed into
					// an Integer
					System.out.println("Future value");

					System.out.println(amount.getText());
					System.out.println(interest.getText());
					System.out.println(payBack.getText());

					// The Formula for the Future
					double futureValue;
					

					//prerequisite = AmountInvested * (1 + interestRate);

					futureValue = AmountInvested *(Math.pow((1+(interestRate/100)),payBackperiod));

					answer.setText(String.valueOf(Math.round(futureValue*100.0)/100.0));
					
				} else if (whichFormula == false) {// if whichFormula is
													// presentValue
					
					double presentValue;
					double presentValuefirst;
					double presentValuesquared;
					
					double futureValue;
					
					// Here we get the value of the future value
					//prerequisite = AmountInvested * (1 + interestRate);
					//futureValue = Math.pow(prerequisite, payBackperiod);
					
					// End of the future value calculation

					// First we presentValue using the futureValue we got from
					// the part above
					//presentValuefirst = futureValue / (1 + interestRate);
				
					// Second we square the presentValue based on the
					// paybackperiod - noted in formula
					//presentValuesquared = Math.pow(presentValuefirst, payBackperiod);
					
					//String str = String.valueOf(presentValuesquared);
				
					presentValue = (AmountInvested *(Math.pow((1+(interestRate/100)),payBackperiod)))/(Math.pow((1+(interestRate/100)),payBackperiod));
					
					answer.setText(String.valueOf(Math.round(presentValue*100.0)/100.0));
				}
				
			}
		});

		setPreferredSize(new Dimension(300, 300));

		setLayout(new FlowLayout());
		add(amountLabel);
		add(amount);

		add(interestLabel);
		add(interest);

		add(payBackLabel);
		add(payBack);

		add(comboBox);
		add(submit);
		
		add(answerLabel);
		add(answer);
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
	}
}
