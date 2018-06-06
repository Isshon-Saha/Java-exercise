import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Form1 extends JFrame implements ActionListener, MouseListener
{
	private JLabel LabelTitle;
	private JTextField TextName;
	private JPasswordField TextPassword;
	private JButton ButtonYes;
	private JPanel PanelForm1;
	private JRootPane RootPaneForm1;
	private JRadioButton radio1, radio2, radio3;
	private JComboBox combo;
	private ButtonGroup bg1,bg2;
	private JCheckBox check1, check2, check3;
	
	public Form1()
	{
		super("This is MyForm");
		
		this.setSize(600,600);
		this.setBackground(Color.RED);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelForm1 = new JPanel();
		PanelForm1.setLayout(null);
		
		LabelTitle = new JLabel("Enter Your Name: ");
		LabelTitle.setBounds(100, 100, 200, 25);
		PanelForm1.add(LabelTitle);
		
		TextName = new JTextField();
		TextName.setBounds(220, 100, 100, 25);
		PanelForm1.add(TextName);
		
		TextPassword = new JPasswordField();
		TextPassword.setBounds(420, 100, 100, 25);
		TextPassword.setEchoChar('1');
		PanelForm1.add(TextPassword);
		
		ButtonYes = new JButton("Click Me");
		ButtonYes.setBounds(200, 250, 120, 80);
		ButtonYes.addActionListener(this);
		ButtonYes.addMouseListener(this);
		PanelForm1.add(ButtonYes);
		
		radio1 = new JRadioButton("Kabab");
		radio1.setBounds(100,150,100,30);
		PanelForm1.add(radio1);
		
		radio2 = new JRadioButton("Biriyani");
		radio2.setBounds(100,250,100,30);
		PanelForm1.add(radio2);
		
		radio3 = new JRadioButton("Pizza");
		radio3.setBounds(100,350,100,30);
		PanelForm1.add(radio3);
		
		bg1= new ButtonGroup();
		bg1.add(radio1);
		bg1.add(radio2);
		bg1.add(radio3);
		
		check1 = new JCheckBox("Kabab");
		check1.setBounds(300,150,100,30);
		PanelForm1.add(check1);
		
		check2 = new JCheckBox("Biriyani");
		check2.setBounds(300,250,100,30);
		PanelForm1.add(check2);
		
		check3 = new JCheckBox("Pizza");
		check3.setBounds(300,350,100,30);
		PanelForm1.add(check3);
		
		bg2= new ButtonGroup();
		bg2.add(check1);
		bg2.add(check2);
		bg2.add(check3);
		
		String s[] = {"one", "two", "three"};
		combo = new JComboBox(s);
		combo.setBounds(400, 200, 100, 50);
		PanelForm1.add(combo);
		
		
		
		this.add(PanelForm1);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		LabelTitle.setText(TextName.getText());
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("entered");
		ButtonYes.setBounds(300, 350, 120, 80);
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("exit");
	}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	
}
