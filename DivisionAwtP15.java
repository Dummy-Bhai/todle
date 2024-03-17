import java.awt.*;
import java.awt.event.*;
class DivisionAwtP15 extends Frame implements ActionListener
{	
	Label l1,l2,l3,l4,mssg;
	Button div_btn;
	TextField num1,num2;
	Dialog d;  
	DivisionAwtP15()
	{
		setTitle("Division Example");
		pack();
		setLayout(new FlowLayout());
		setVisible(true);
		l3=new Label("Shaikh Nadim KSBSCIT058! ");
		l1=new Label("Number 1: ");
		l2=new Label("Number 2: ");
		l4=new Label("Result: ");
		mssg=new Label();
		div_btn=new Button("Divide");
		div_btn.addActionListener(this);
		
	
		num1=new TextField(10);
		num2=new TextField(10);

		d = new Dialog(new Frame() , "Alert!!", true);  
		d.add(mssg);   
        	d.setSize(300,300);      
		
		add(l3);
		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(div_btn);
		add(l4);
		
	}
	
	public static void main(String[] args)
	{	
		System.out.println("Shaikh Nadim KSBSCIT058");
		new DivisionAwtP15();
	}
        public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==div_btn)
		{
			try
			{
				int n1=Integer.parseInt(num1.getText());
				int n2=Integer.parseInt(num2.getText());
				if(n2==0)
				{
					throw new ArithmeticException();
				}
				else
				{
					l4.setText("Result: "+(n1/n2));
				}
			}
			catch(NumberFormatException ex)
			{
				mssg.setText("Number Format Error Occured");
				d.setVisible(true);
				System.out.println("Number Format Error Occured");
			}
			catch(ArithmeticException ex1)
			{
				mssg.setText("Cannot Divide By Zero");
				d.setVisible(true);
				System.out.println("Cannot Divide By Zero");
			}	
		}
	}
}