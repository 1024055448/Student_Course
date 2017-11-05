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

JFrame frame=new JFrame("学生选课系统登录");
JPanel jp=new JPanel();
JPanel jp2=new JPanel();
JPanel jp3=new JPanel();
JPanel jp4=new JPanel();
JLabel jl=new JLabel("学号");
JLabel jl2=new JLabel("密码");
JTextField jt=new  JTextField(16);
JPasswordField p= new JPasswordField(16);
JButton jb=new JButton("登录");
JButton jb2=new JButton("重置");
/*
JFrame frame2=new JFrame("注册账号");
JPanel jp5=new JPanel();
JTextField Field21=new JTextField(12);
JTextField Field22=new JTextField(12);
JLabel jla=new JLabel("注册学号");
JLabel jla2=new JLabel("密码");
//JTextField Field23=new JTextField(20);
JButton button21=new JButton("注册");
JButton button22=new JButton("关闭");
JPanel jp6=new JPanel();
JPanel jp7=new JPanel();
JPanel jp8=new JPanel();
*/
//protected ZHUCE zc;

public  Login()
{
	
	jp.setLayout(new GridLayout(3,2));//创建表格布局
	jl.setFont(new Font("华文行楷",Font.BOLD,16));
	jl.setBounds(30,80,80,40);//学号           

jt.setBounds(120,80,100,40);//学号输入框
//setBounds(x,y,width,height); x:组件在容器X轴上的起点 y:组件在容器Y轴上的起点 width:组件的长度 height:组件的
jl2.setFont(new Font("华文行楷",Font.BOLD,16));
jl2.setBounds(100,100,100,40);//密码
p.setBounds(120, 100, 100, 40);//密码输入框
jb.setBounds(30,180,120,40);//登录按钮
jb2.setBounds(70,200,120,40);//重置按钮
jp2.add(jl);
jp2.add(jt);
jp3.add(jl2);
jp3.add(p);
jp4.add(jb);
jp4.add(jb2);

jp.add(jp2);
jp.add(jp3);
jp.add(jp4);
frame.add(jp);//界面完成
frame.setBounds(400,200,400,400);
frame.setVisible(true);
frame.setResizable(false);


//JButton button23=new JButton("房主注册");
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

JOptionPane.showMessageDialog(null, "添加成功", "提示框", JOptionPane.INFORMATION_MESSAGE);

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
	JOptionPane.showMessageDialog(null, "账号密码错误", "提示框", JOptionPane.INFORMATION_MESSAGE);
}

}