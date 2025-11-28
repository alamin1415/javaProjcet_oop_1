package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class austrilia  extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3,i4,i5,i6;
	private JLabel l1;
	private JButton b1,b2,b3,b4;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8,Im9,Im10,Im11,Im12;
	private ImageIcon ii1;
	
	
public	austrilia(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("AUSTRILIA");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		setResizable(false);
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/aus.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		
		
		//button
		
		i2=new ImageIcon(getClass().getResource("/images/syii.jpg"));
		Im3=i2.getImage();
		Im4=Im3.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i2=new ImageIcon(Im4);
		b1=new JButton(i2);
		b1.setBounds( 283,529,185,25);
		l1.add(b1);
		
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			Sydney con=new Sydney();
			con.setVisible(true);
			dispose();
		}
		});
		
		i3=new ImageIcon(getClass().getResource("/images/swii.jpg"));
		Im5=i3.getImage();
		Im6=Im5.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i3=new ImageIcon(Im6);
		b2=new JButton(i3);
		b2.setBounds(33,529,185,25);
		l1.add(b2);
		b2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 swinburne co=new swinburne ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		
		i4=new ImageIcon(getClass().getResource("/images/meii.jpg"));
		Im7=i4.getImage();
		Im8=Im7.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i4=new ImageIcon(Im7);
		b3=new JButton(i4);
		b3.setBounds(534,529,185,25);
		l1.add(b3);
		b3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 melborn co=new melborn ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		i5=new ImageIcon(getClass().getResource("/images/moii.jpg"));
		Im11=i5.getImage();
		Im12=Im11.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i5=new ImageIcon(Im11);
		b4=new JButton(i5);
		b4.setBounds(780,529,185,25);
		l1.add(b4);
		
		b4.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 monash co=new monash ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		
		JButton b5=new JButton("BACK");
		b5.setBounds(910,10,80,25);
		b5.setForeground(Color.white);
        b5.setBackground(Color.red);
		l1.add(b5); 
		
		
		b5.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			home con=new home();
			con.setVisible(true);
			dispose();
		}
		});
		
		
			
	}
	
	
	public static void main(String args[]){
		
		austrilia  l =new austrilia();
		l.setVisible(true);
	}
	
	
}