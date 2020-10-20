import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBounds(31, 11, 286, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(10, 48, 307, 94);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("+/-");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setBounds(10, 492, 60, 53);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(126, 278, 65, 55);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setBounds(126, 332, 65, 53);
		btn8.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setBounds(126, 384, 65, 56);
		btn5.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.setBounds(126, 438, 65, 55);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn2);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBack.setBounds(189, 280, 65, 55);
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 24));
		frame.getContentPane().add(btnBack);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setBounds(189, 332, 65, 53);
		btn9.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setBounds(189, 384, 65, 56);
		btn6.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setBounds(189, 439, 65, 53);
		btn3.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setBounds(189, 492, 65, 53);
		btnDot.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		frame.getContentPane().add(btnDot);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnAdd.setBounds(252, 279, 65, 53);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setBounds(252, 330, 65, 53);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.setEnabled(false);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMult.setBounds(252, 382, 65, 56);
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btnDiv.setBounds(252, 437, 65, 56);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnDiv);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				second=Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "X^Y")
				{
					double r=1;
					for(int i=1;i<=second;i++)
					{
						r=first*r;
					}
					
					answer=String.format("%.2f",r);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setBounds(252, 492, 65, 53);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnPercent.setBounds(67, 278, 60, 54);
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setBounds(67, 331, 60, 55);
		btn7.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setBounds(67, 383, 60, 57);
		btn4.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setBounds(67, 439, 60, 53);
		btn1.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btn1);
		
		JButton btnZero = new JButton("0");
		btnZero.setEnabled(false);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField.getText()+btnZero.getText();
				textField.setText(number);
				
			}
		});
		btnZero.setBounds(67, 490, 124, 55);
		btnZero.setFont(new Font("Arial", Font.BOLD, 24));
		frame.getContentPane().add(btnZero);
		
		JButton btnNewButton_7_2 = new JButton("n!");
		btnNewButton_7_2.setEnabled(false);
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnNewButton_7_2.setBounds(10, 438, 60, 55);
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frame.getContentPane().add(btnNewButton_7_2);
		
		JButton btnNewButton_7_3 = new JButton("x^2");
		btnNewButton_7_3.setEnabled(false);
		btnNewButton_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Double.parseDouble(textField.getText());
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_3.setBounds(10, 385, 60, 55);
		btnNewButton_7_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton_7_3);
		
		JButton btnNewButton_7_4 = new JButton("x^3");
		btnNewButton_7_4.setEnabled(false);
		btnNewButton_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_4.setBounds(10, 331, 60, 55);
		btnNewButton_7_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton_7_4);
		
		JButton btnNewButton_7_5 = new JButton("x^y");
		btnNewButton_7_5.setEnabled(false);
		btnNewButton_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
				
			}
		});
		btnNewButton_7_5.setBounds(10, 278, 60, 54);
		btnNewButton_7_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton_7_5);
		
		JButton btnNewButton_7_6 = new JButton("\u221A");
		btnNewButton_7_6.setEnabled(false);
		btnNewButton_7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_6.setBounds(10, 171, 60, 55);
		btnNewButton_7_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btnNewButton_7_6);
		
		JButton btnNewButton_7_7 = new JButton("R");
		btnNewButton_7_7.setBounds(10, 171, 60, 55);
		btnNewButton_7_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(btnNewButton_7_7);
		
		JButton btnNewButton_7_8 = new JButton("e^x");
		btnNewButton_7_8.setEnabled(false);
		btnNewButton_7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_8.setBounds(67, 171, 60, 55);
		btnNewButton_7_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btnNewButton_7_8);
		
		JButton btnNewButton_7_9 = new JButton("sin");
		btnNewButton_7_9.setEnabled(false);
		btnNewButton_7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_9.setBounds(126, 171, 65, 55);
		btnNewButton_7_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frame.getContentPane().add(btnNewButton_7_9);
		
		JButton btnNewButton_7_10 = new JButton("cos");
		btnNewButton_7_10.setEnabled(false);
		btnNewButton_7_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_10.setBounds(189, 171, 65, 55);
		btnNewButton_7_10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frame.getContentPane().add(btnNewButton_7_10);
		
		JButton btnNewButton_7_11 = new JButton("tan");
		btnNewButton_7_11.setEnabled(false);
		btnNewButton_7_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_11.setBounds(252, 171, 65, 55);
		btnNewButton_7_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frame.getContentPane().add(btnNewButton_7_11);
		
		JButton btnNewButton_7_8_1 = new JButton("log");
		btnNewButton_7_8_1.setEnabled(false);
		btnNewButton_7_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_8_1.setBounds(67, 224, 60, 56);
		btnNewButton_7_8_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(btnNewButton_7_8_1);
		
		JButton btnNewButton_7_9_1 = new JButton("sinh");
		btnNewButton_7_9_1.setEnabled(false);
		btnNewButton_7_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_9_1.setBounds(126, 225, 65, 55);
		btnNewButton_7_9_1.setFont(new Font("Arial", Font.PLAIN, 16));
		frame.getContentPane().add(btnNewButton_7_9_1);
		
		JButton btnNewButton_7_10_1 = new JButton("cosh");
		btnNewButton_7_10_1.setEnabled(false);
		btnNewButton_7_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_7_10_1.setBounds(189, 224, 65, 56);
		btnNewButton_7_10_1.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton_7_10_1);
		
		JButton btnNewButton_7_11_1 = new JButton("tanh");
		btnNewButton_7_11_1.setEnabled(false);
		btnNewButton_7_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_7_11_1.setBounds(252, 224, 65, 58);
		btnNewButton_7_11_1.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton_7_11_1);
		
		JRadioButton btnOn = new JRadioButton("on");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnZero.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMult.setEnabled(true);
				btnDiv.setEnabled(true);
				btnPercent.setEnabled(true);
				btnNewButton_7.setEnabled(true);
                btnNewButton_7_2.setEnabled(true);
				btnNewButton_7_3.setEnabled(true);
				btnNewButton_7_4.setEnabled(true);
				btnNewButton_7_5.setEnabled(true);
				btnNewButton_7_6.setEnabled(true);
				btnNewButton_7_8.setEnabled(true);
				btnNewButton_7_9.setEnabled(true);
				btnNewButton_7_10.setEnabled(true);
				btnNewButton_7_11.setEnabled(true);
				btnNewButton_7_8_1.setEnabled(true);
				btnNewButton_7_9_1.setEnabled(true);
				btnNewButton_7_10_1.setEnabled(true);
				btnNewButton_7_11_1.setEnabled(true);
				btnClear.setEnabled(true);
				btnBack.setEnabled(true);
				btnEqual.setEnabled(true);
				//btnNewButton_new.setEnabled(false);
				textField.setEnabled(true);
				
				
			}
		});
		buttonGroup.add(btnOn);
		btnOn.setFont(new Font("Arial", Font.PLAIN, 16));
		btnOn.setBounds(10, 149, 51, 27);
		frame.getContentPane().add(btnOn);
		
		JRadioButton btnOff = new JRadioButton("off");
		btnOff.setSelected(true);
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnZero.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMult.setEnabled(false);
				btnDiv.setEnabled(false);
				btnPercent.setEnabled(false);
				btnNewButton_7.setEnabled(false);
                btnNewButton_7_2.setEnabled(false);
				btnNewButton_7_3.setEnabled(false);
				btnNewButton_7_4.setEnabled(false);
				btnNewButton_7_5.setEnabled(false);
				btnNewButton_7_6.setEnabled(false);
				btnNewButton_7_8.setEnabled(false);
				btnNewButton_7_9.setEnabled(false);
				btnNewButton_7_10.setEnabled(false);
				btnNewButton_7_11.setEnabled(false);
				btnNewButton_7_8_1.setEnabled(false);
				btnNewButton_7_9_1.setEnabled(false);
				btnNewButton_7_10_1.setEnabled(false);
				btnNewButton_7_11_1.setEnabled(false);
				btnClear.setEnabled(false);
				btnBack.setEnabled(false);
				btnEqual.setEnabled(false);
				//btnNewButton_new.setEnabled(false);
				textField.setEnabled(false);
				
			}
		});
		buttonGroup.add(btnOff);
		btnOff.setFont(new Font("Arial", Font.PLAIN, 16));
		btnOff.setBounds(61, 149, 60, 20);
		frame.getContentPane().add(btnOff);
		
		JButton btnNewButton_new = new JButton("1/x");
		btnNewButton_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_new.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_new.setBounds(10, 224, 60, 55);
		frame.getContentPane().add(btnNewButton_new);
	}
}
