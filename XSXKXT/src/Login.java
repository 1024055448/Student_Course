import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login {
	Manage my;
	Manage1 my1;
JTextField txtXH;
JTextField txtPW;

JFrame frame=new JFrame("ѧ��ѡ��ϵͳ��¼");
JPanel jp=new JPanel();
JPanel jp2=new JPanel();
JPanel jp3=new JPanel();
JPanel jp4=new JPanel();
JLabel jl=new JLabel("ѧ��");
JLabel jl2=new JLabel("����");
JTextField jt=new  JTextField(16);
JPasswordField p= new JPasswordField(16);
JButton jb=new JButton("��¼");
JButton jb2=new JButton("����");
/*
JFrame frame2=new JFrame("ע���˺�");
JPanel jp5=new JPanel();
JTextField Field21=new JTextField(12);
JTextField Field22=new JTextField(12);
JLabel jla=new JLabel("ע��ѧ��");
JLabel jla2=new JLabel("����");
//JTextField Field23=new JTextField(20);
JButton button21=new JButton("ע��");
JButton button22=new JButton("�ر�");
JPanel jp6=new JPanel();
JPanel jp7=new JPanel();
JPanel jp8=new JPanel();
*/
//protected ZHUCE zc;

public  Login()
{
	
	jp.setLayout(new GridLayout(3,2));//������񲼾�
	jl.setFont(new Font("�����п�",Font.BOLD,16));
	jl.setBounds(30,80,80,40);//ѧ��           

jt.setBounds(120,80,100,40);//ѧ�������
//setBounds(x,y,width,height); x:���������X���ϵ���� y:���������Y���ϵ���� width:����ĳ��� height:�����
jl2.setFont(new Font("�����п�",Font.BOLD,16));
jl2.setBounds(100,100,100,40);//����
p.setBounds(120, 100, 100, 40);//���������
jb.setBounds(30,180,120,40);//��¼��ť
jb2.setBounds(70,200,120,40);//���ð�ť
jp2.add(jl);
jp2.add(jt);
jp3.add(jl2);
jp3.add(p);
jp4.add(jb);
jp4.add(jb2);

jp.add(jp2);
jp.add(jp3);
jp.add(jp4);
frame.add(jp);//�������
frame.setBounds(400,200,400,400);
frame.setVisible(true);
frame.setResizable(false);


//JButton button23=new JButton("����ע��");
/*jb2.addActionListener(new ActionListener() {
		@Override
public void actionPerformed(ActionEvent e) {
		
		//button21.setBounds(40, 40,40,40);
	
		jp5.add(jla);jp5.add(Field21);
		jp6.add(jla2);jp6.add(Field22);
		jp7.add(button21);jp7.add(button22);

jp8.add(jp5);
jp8.add(jp6);
jp8.add(jp7);
frame2.add(jp8);
frame2.setVisible(true);
		frame2.setBounds(540, 260, 310, 180);
		frame2.setResizable(false);
		}

		
	});
button21.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	    ZHUCE word1=new ZHUCE();
	    word1.setXuehao(txtXH.getText());
	    word1.setPW(txtPW.getText());
        my1.add1(word1);
		//my1.Denglu(,);
			
		Tool.putMap2Words2("D:/2.txt",);

JOptionPane.showMessageDialog(null, "��ӳɹ�", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);

		txtXH.setText("");
		txtPW.setText("");
	//	System.out.println(word);

	}});
button22.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
frame2.dispose();
	 
	}
});*/

	
		jb2.addActionListener(new ActionListener() {
		
	
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			jt.setText("");
		p.setText("");
		}
		
		});
  jb.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		    P();
		    frame.dispose();
	}
	
});}
	
public void P()
{


	if(jt.getText().equals("1")&&p.getText().equals("2")
	||jt.getText().equals("123")&&p.getText().equals("456")
	||jt.getText().equals("201409300314")&&p.getText().equals("fangzhao")
	||jt.getText().equals("201409300323")&&p.getText().equals("liuwenshuo"))
	{

		Manage my=new Manage();
		Manage1 my1=new Manage1();
		SwingUI s1=new SwingUI(my,my1);
		
	}
	else
	JOptionPane.showMessageDialog(null, "�˺��������", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);
}

}