import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener
{
	private double x;
	private double y;
	private JFrame calculatorFrame;
	private JLabel lblNumber1,lblNumber2;
	private JButton btnPlus,btnMinus,btnMul,btnDiv;
	private JTextField txtNumber1,txtNumber2;
	
	public Calculator()
	{
		super("Calculator");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		calculatorFrame=new JFrame();
		calculatorFrame.setBounds(100, 100, 250, 155);
		lblNumber1=new JLabel("Number 1:");
		lblNumber2=new JLabel("Number 2:");
		lblNumber1.setBounds(20,40,80,50);
		lblNumber2.setBounds(20,100,80,50);
		add(lblNumber1);
		add(lblNumber2);
		btnPlus=new JButton("+");
		btnMinus=new JButton("-");
		btnMul=new JButton("*");
		btnDiv=new JButton("/");
		btnPlus.setBounds(20,220,50,30);
		btnMinus.setBounds(90,220,50,30);
		btnMul.setBounds(160,220,50,30);
		btnDiv.setBounds(230,220,50,30);
		add(btnDiv);
		add(btnMinus);
		add(btnMul);
		add(btnPlus);
		txtNumber1=new JTextField();
		txtNumber2=new JTextField();
		txtNumber1.setBounds(110,40,150,50);
		txtNumber2.setBounds(110,100,150,50);
		add(txtNumber1);
		add(txtNumber2);
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnPlus)
		{
		double a=Double.parseDouble(txtNumber1.getText());
		double b=Double.parseDouble(txtNumber2.getText());
		JOptionPane.showMessageDialog(this,"Result: " +sum(a,b));
		}
		if(e.getSource()==btnMinus)
		{
		double a=Double.parseDouble(txtNumber1.getText());
		double b=Double.parseDouble(txtNumber2.getText());
		JOptionPane.showMessageDialog(this,"Result: " +sub(a,b));
		}
		if(e.getSource()==btnMul)
		{
		double a=Double.parseDouble(txtNumber1.getText());
		double b=Double.parseDouble(txtNumber2.getText());
		JOptionPane.showMessageDialog(this,"Result: " +mul(a,b));
		}
		if(e.getSource()==btnDiv)
		{
		double a=Double.parseDouble(txtNumber1.getText());
		double b=Double.parseDouble(txtNumber2.getText());	
		JOptionPane.showMessageDialog(this,"Result: " +div(a,b));
		}
	}
	
	public Calculator(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
    public double sum(double x, double y)
	{
		return (x+y);
	}
	
	public double sub(double x, double y)
	{
		return (x-y);
	}
	
	public double mul(double x, double y)
	{
		return (x*y);
	}
	
	public double div(double x, double y)
	{
		return (x/y);
	}
}