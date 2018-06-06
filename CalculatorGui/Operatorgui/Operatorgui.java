import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Operatorgui extends JFrame implements ActionListener
{
	private JLabel label1,label2,label3,label4,label5,label6;
	private JTextField Text1,Text2,Text3,Text4,Text5;
	private JButton ButtonSave;
	//private JFrame PanelForm1;
    private JComboBox combo;
	
	
	public Operatorgui()
	{
		
		
		this.setSize(400,400);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PanelForm1 = new JFrame();
		setLayout(null);
		
		setVisible(true);
		
		label1 = new JLabel("Name:");
		label1.setBounds(20,30,100,30);
		add(label1);
		
	    label2 = new JLabel("Person ID:");
		label2.setBounds(20,70,100,30);
		add(label2);
		
		label3 = new JLabel("Age:");
		label3.setBounds(20,110,100,30);
		add(label3);
		
		label4 = new JLabel("Mobile Operator:");
		label1.setBounds(20,150,100,30);
		add(label4);
		
		label5 = new JLabel("Mobile Number:");
		label5.setBounds(20,190,100,30);
		add(label5);
		
		label6 = new JLabel("Gender:");
		label6.setBounds(20,230,100,30);
		add(label6);
		
		Text1 = new JTextField();
		Text1.setBounds(100,30,150,30);
		add(Text1);
		
		Text2 = new JTextField();
		Text2.setBounds(100,70,150,30);
		add(Text2);
		
		Text3 = new JTextField();
		Text3.setBounds(100,110,150,30);
		add(Text3);
		
		Text4 = new JTextField();
		Text4.setBounds(100,190,150,30);
		add(Text4);
		
		Text5 = new JTextField();
		Text5.setBounds(100,230,150,30);
		add(Text5);
		
		ButtonSave = new JButton("Save");
		ButtonSave.setBounds(150,270,100,30);
		ButtonSave.addActionListener(this);
		add(ButtonSave);
				
		String s[] = {"Grameen","Robi","Airtel","Teletalk","Banglalink"};
		combo = new JComboBox(s);
		combo.setBounds(100,150,150,30);
		add(combo);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"Success");
		System.out.println("Saved succesfully");
	}

	
}
