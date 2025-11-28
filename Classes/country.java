package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class country extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3;
	private JLabel l1;
	private Image Im1,Im2,Im3,Im4,Im5,Im6;
	private ImageIcon ii1;
	
	
	public country(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setResizable(false);
		setTitle("EXPLORE COUNTRY");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		Font f=new Font("Arial",Font.BOLD,15);
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/country.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		JButton c1 =new JButton("austrilia");
		
		c1.setBounds(33,289,187,25);
		c1.setFont(f);
		l1.add(c1);
		
		JButton c2 =new JButton("UK");
		c2.setBounds(280,289,187,25);
		c2.setFont(f);
		l1.add(c2);
		c2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		uk aus=new uk();
			aus.setVisible(true);
			dispose();
		}
		});
		
		JButton c3 =new JButton("USA");
		c3.setBounds(533,289,187,25);
		c3.setFont(f);
		l1.add(c3);
		c3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		usa aus=new usa();
			aus.setVisible(true);
			dispose();
		}
		});
		
		
		JButton c4 =new JButton("MALAYSHIA");
		c4.setBounds(778,289,187,25);
		c4.setFont(f);
		l1.add(c4);
		c4.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		malay aus=new malay();
			aus.setVisible(true);
			dispose();
		}
		});
		
		JButton c5 =new JButton("GERMANY");
		c5.setBounds(33,533,187,25);
		c5.setFont(f);
		l1.add(c5);
		c2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		germ aus=new germ();
			aus.setVisible(true);
			dispose();
		}
		});
		
		JButton c6 =new JButton("FINLAND");
		c6.setBounds(280,533,187,25);
		c6.setFont(f);
		l1.add(c6);
		c6.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		fin aus=new fin();
			aus.setVisible(true);
			dispose();
		}
		});
		JButton c7 =new JButton("CANADA");
		c7.setBounds(533,533,187,25);
		c7.setFont(f);
		l1.add(c7);
		c7.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		can aus=new can();
			aus.setVisible(true);
			dispose();
		}
		});
		
		JButton c8 =new JButton("DENMARK");
		c8.setBounds(778,533,187,25);
		c8.setFont(f);
		l1.add(c8);
		c8.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		den aus=new den();
			aus.setVisible(true);
			dispose();
		}
		});
		
		
	   JButton back=new JButton("BACK");
		back.setBounds(920,9,80,25);
		back.setForeground(Color.white);
        back.setBackground(Color.red);
		l1.add(back);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			home con=new home();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		c1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		austrilia aus=new austrilia();
			aus.setVisible(true);
			dispose();
		}
		});
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		country l=new country();
		l.setVisible(true);
	}
	
	
}