import java.awt.*;
import java.awt.event.*;
import java.util.*;
class P30 extends Frame implements ActionListener
{	
	Label l1,l2,l3;
	Button div_btn;
	TextField t1,t2;
	TreeMap<String, String> userdata = new TreeMap<>();
	P30()
	{
		setTitle("Shaikh Nadim KSBSCIT058");
		pack();
		setLayout(new GridLayout(3,2));
		setVisible(true);
		l1=new Label("Username: ");
		l2=new Label("Password: ");
		l3=new Label();
		div_btn=new Button("Login");
		div_btn.addActionListener(this);
		
	
		t1=new TextField(10);
		t2=new TextField(10);
     		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(div_btn);
		add(l3);

		userdata.put("Nadim","1234");
		userdata.put("John","12345");
		userdata.put("Bob","12");
		userdata.put("Allen","124");
		
	}
	
	public static void main(String[] args)
	{	
		new P30();
	}
        public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==div_btn)
		{
			String u=t1.getText();
			String p=t2.getText();
			int i=0;
			
			for(Map.Entry m:userdata.entrySet())  
      			{  
          			if(m.getKey().equals(u) &&  m.getValue().equals(p))
				{
					l3.setText("Login Successfull");
					i=1;
					break;
				}
				    
      			}  
			if(i!=1)
			{
				l3.setText("Login Failed");
			}
			
		}
	}
}