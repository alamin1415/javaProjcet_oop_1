package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
	
public class SingIn   extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,il1,il2,is1;
	private JLabel l1,name ,pass,reg;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Ims1,Ims2;
	private JPanel p;
	private JTextField t;
	private JComboBox securityQsn;
	private ImageIcon ii1;
	
	
	public SingIn(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("creating page");
		setResizable(false);
		setTitle("SING IN PAGE");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/sing.jpg"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		Font f=new Font("Arial",Font.BOLD,15);
		Font fb=new Font("Arial",Font.BOLD,13);
		
		p=new JPanel();
		p.setLayout(null);
		p.setBounds(400,10,650,550);
		p.setBackground (new Color(51,153,155,40));
		p.setFont(f);
		l1.add(p);	
			
		JButton logi =new JButton ("login");
		logi.setBounds(790,528,100,25);
		logi.setForeground(Color.white);
        logi.setBackground(Color.blue);
		logi.setFont(f);
		l1.add(logi);
		
		
		
		is1=new ImageIcon(getClass().getResource("/images/submit.png"));
		Ims1=is1.getImage();
		Ims2=Ims1.getScaledInstance(186,48,Image.SCALE_SMOOTH);
		is1=new ImageIcon(Ims2);
		
		JButton submit =new JButton(is1);
		submit.setBounds(609,448,186,48);
		submit.setFont(f);
		l1.add(submit);
		
		
		Font f1=new Font("Arial",Font.BOLD,20);
		JLabel enter =new JLabel("Enter your information");
		enter.setForeground(Color.white);
		enter.setBounds(430,100,400,20);
		enter.setFont(f1);
		l1.add(enter);
		
		
		JLabel name  =new JLabel("USER NAEM:");
		name.setForeground(Color.white);
		name.setBounds(450,140,200,20);
		name.setFont(f);
		l1.add(name);
		
		JTextField nam =new JTextField();
		nam.setBounds(650,140,250,30);
		nam.setFont(f);
		l1.add(nam);
		
		
		
		JLabel email  =new JLabel("EMAIL:");
		email.setForeground(Color.white);
		email.setBounds(450,190,400,20);
		email.setFont(f);
		l1.add(email);
		
		JTextField em =new JTextField();
		em.setBounds(650,190,250,30);
		em.setFont(f);
		l1.add(em);
		
		
		JLabel pas  =new JLabel("PASWORD:");
		pas.setForeground(Color.white);
		pas.setBounds(450,230,400,20);
		pas.setFont(f);
		l1.add(pas);
		
		JTextField pa =new JTextField();
		pa.setBounds(650,230,250,30);
		pa.setFont(f);
		l1.add(pa);
		
		JLabel seq  =new JLabel("SEQURITY QUESTION:");
		seq.setForeground(Color.white);
		seq.setBounds(450,270,400,20);
		seq.setFont(f);
		l1.add(seq);
		
		//JTextField se =new JTextField();
		//se.setBounds(650,270,250,30);
		//se.setFont(f);
		//l1.add(se);
		
		String[] secQsn = { "Choose a Security Question...", "Your dream job?", "Your favorite song?",
                "First pet's name?", "Your favorite hobby?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(650,270,250,30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f);
        securityQsn.setBackground(Color.white);
        l1.add(securityQsn);
		
		
		
		
		
		
		
		JLabel ans  =new JLabel("ENTER YOUR ANSWER:");
		ans.setForeground(Color.white);
		ans.setBounds(450,330,400,20);
		ans.setFont(f);
		l1.add(ans);

		JTextField an =new JTextField();
		an.setBounds(650,330,250,30);
		an.setFont(f);
		l1.add(an);
		
		
		JLabel cha  =new JLabel("CHAPTA:");
		cha.setForeground(Color.white);
		cha.setBounds(450,380,400,20);
		cha.setFont(f);
		l1.add(cha);
		
		JTextField ch =new JTextField();
		ch.setBounds(650,380,250,30);
		ch.setFont(f);
		l1.add(ch);
		
		
		Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
		
		JLabel chap = new JLabel();
        chap.setText(" " + a + " + " + b + " ");
        chap.setBounds(535,378,42,30);
        chap.setFont(f);
        chap.setForeground(Color.white);
        chap.setBackground(Color.black);
        chap.setOpaque(true);
        l1.add(chap);
		
		
		logi.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			Login con=new Login();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		JButton back =new JButton("back");
		back.setBounds(930,12,65,25);
		back.setFont(fb);
		back.setForeground(Color.white);
        back.setBackground(Color.red);
		l1.add(back);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			Login con=new Login();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		
		
		 submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = nam.getText().toLowerCase(); // User Name
                String textField2 = em.getText(); // Email
                String textField3 = pa.getText(); // Password
                String textField4 = ans.getText(); // Security Question Answer
                String textField5 = ch.getText(); // Captcha
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Fillup  Your information.", "Warning!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    result = Integer.parseInt(ch.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || ((securityQsn.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please Fillup  Your information.", "Warning!",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField1);
                            pw.println("Password : " + textField3);
                            pw.println("Email : " + textField2);
                            pw.println("Security Question : " + secQsn);
                            pw.println("Answer : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, " Your Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Login frame = new Login();
                        frame.setVisible(true);
                    }
                }
            }
        });
    

	
	
	}
		
		
	public static void main(String args[]){
		
		SingIn l=new SingIn();
		l.setVisible(true);
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
	