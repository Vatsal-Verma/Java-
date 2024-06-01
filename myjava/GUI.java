import java.awt.*;
import java.awt.event.*;
  
class Gui implements ActionListener{
	Frame f1;
	Button b1,b2,b3;
	Label l1,l2,l3;
    TextField t1,t2;
	Choice c3;
	Checkbox c1,c2;
	CheckboxGroup cbg;
    Gui(){
		f1=new Frame();
		l1=new Label("NAME:");
		l2=new Label("Email:");
		b1=new Button("Submit");
	    b2=new Button("Reset");
		b3=new Button("Exit");
		t1=new TextField();
	    t2=new TextField();
		c1=new Checkbox("male",cbg,true);
		c2=new Checkbox("female",cbg,false);
		c3=new Choice();
		l3=new Label();
		
		f1.setSize(500,500);
		l1.setBounds(30,100,50,30);
		l2.setBounds(30,200,50,30);
		l3.setBounds(50,300,50,30);
		t1.setBounds(100,100,100,30); 
		t2.setBounds(100,200,100,30); 
		c1.setBounds(30,150,50,30);
		c2.setBounds(100,150,50,30);
		c3.setBounds(30,250,50,30);
		b1.setBounds(50,300,100,30);
		b2.setBounds(170,300,100,30);
		b3.setBounds(290,300,100,30);
		
		f1.add(l1);
		f1.add(l2);
		f1.add(t2);
		f1.add(t1);
		f1.add(c1);
		f1.add(c2);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(l2);
		f1.add(l3);
		f1.add(c3);
		f1.setLayout(null);
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		c3.add(t1.getText());
		if(c1.getState()==true)
		l3.setText(t1.getText());	
		if(c2.getState()==true)
		l3.setText(t2.getText());
	}
	if(e.getSource()==b2){
		t1.setText("");
		t2.setText("");
	}
	if(e.getSource()==b3){
		System.exit(0);
	}
}
}
class GUIDemo{
	public static void main(String ar[]){
		new Gui();
	}
}