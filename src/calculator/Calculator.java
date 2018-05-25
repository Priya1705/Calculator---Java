
package calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Calculator extends Frame implements ActionListener {
Label l1,l2,l3;
TextField tf1,tf2;
Button btn1,btn2,btn3,btn4;
JLabel label;
public Calculator()
{
    setLayout(null);
    setSize(500,500);
    setTitle("my Calculator");
        l1=new Label("enter first number");
        l2=new Label("enter second number");
        l3=new Label();
        tf1=new TextField();
        tf2=new TextField();
        btn1=new Button("addition");
        btn2=new Button("substraction");
        btn3=new Button("multiplication");
        btn4=new Button("division");
        try{
        ImageIcon img;
        img = new ImageIcon("C:\\Users\\priya_000\\Desktop\\library.jpg");
        label = new JLabel(img);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(label);
        
        l1.setBounds(50,50,150,30);
        l2.setBounds(50,100,150,30);
        l3.setBounds(100,300,150,30);
        tf1.setBounds(250,50,100,30);
        tf2.setBounds(250,100,100,30);
        btn1.setBounds(50,150,100,30);
        btn2.setBounds(200,150,100,30);
        btn3.setBounds(50,200,100,30);
        btn4.setBounds(200,200,100,30);
        label.setBounds(0,0,200,200);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        setVisible(true);
}

 @Override
    public void actionPerformed(ActionEvent e) {
              {
                                
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
         if(e.getSource()==btn1)
         {l3.setText(String.valueOf(n1+n2));}
                                
         if(e.getSource()==btn2)
         {l3.setText(String.valueOf(n1-n2));}
                                
         if(e.getSource()==btn3)
         {l3.setText(String.valueOf(n1*n2));}
                                
         if(e.getSource()==btn4)
         {l3.setText(String.valueOf(n1/n2));}      
                              
               }}
               
    public static void main(String[] args) {
    new Calculator();
    }}
   
    

