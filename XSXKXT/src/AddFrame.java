

import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddFrame extends JFrame{
    Manage my;
    JTextField txtNuword;
    JTextField txtNaword;
    JTextField txtKeword;
    JTextField txtGrword;
    
    JButton btnAdd;
    JButton btnClose;
    public AddFrame( Manage my)
    {
    	this.my = my;
    	initControl();
    	initFrame();
    }
    public void initControl()
    {
    	JLabel lblNuword= new JLabel("学生学号");
    	lblNuword.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblNuword);
    	txtNuword= new JTextField();
    	add(txtNuword);
    	JLabel lblNaword =new JLabel("学生姓名");
    	lblNaword.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblNaword);
    	txtNaword = new JTextField();
    	add(txtNaword);
    	JLabel lblKeword =new JLabel("学生选修课程");
    	lblKeword.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblKeword);
    	txtKeword= new JTextField();
    	add(txtKeword);
    	JLabel lblGrword =new JLabel("选修课成绩");
    	lblGrword.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblGrword);
    	txtGrword = new JTextField();
    	add(txtGrword);
    	btnAdd =new JButton("添加");
    	add(btnAdd);
    	btnClose = new JButton("关闭");
    	add(btnClose);
    	btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Student word =new Student(txtNuword.getText(),txtNaword.getText(),txtKeword.getText(),txtGrword.getText());
					//int a=Integer.parseInt(txtGrword.getText());
				
				word.setNumber(txtNuword.getText());
				word.setName(txtNaword.getText());
				word.setKemu(txtKeword.getText());
				word.setGrade(txtGrword.getText());
				
				int a=Integer.parseInt(txtGrword.getText());
				if(a>=0&&a<=100)
				{
				if(txtKeword.getText().equals("语文")||txtKeword.getText().equals("数学")||txtKeword.getText().equals("英语")||txtKeword.getText().equals("java")
							||txtKeword.getText().equals("数据库")||txtKeword.getText().equals("企业实训")||txtKeword.getText().equals("安卓开发")
							)
					//&&txtGrword.getText().valueOf(i)
				{my.add(word);
				
				Tool.putMap2Words("D:/选课.txt", my.getWordList());
		JOptionPane.showMessageDialog(null, "添加成功", "提示框", JOptionPane.INFORMATION_MESSAGE);	
		        txtNuword.setText("");
				txtNaword.setText("");
				txtKeword.setText("");
				txtGrword.setText("");
				}
				else
				JOptionPane.showMessageDialog(null, "请管理员输入科目为    语文   数学   英语   java 数据库  企业实训   安卓开发   的其中一门", "提示框", JOptionPane.INFORMATION_MESSAGE);
				 txtNuword.setText("");
					txtNaword.setText("");
					txtKeword.setText("");
					txtGrword.setText("");
				
			//	}
			}
				else
					JOptionPane.showMessageDialog(null, "请输入正确的分数", "提示框", JOptionPane.INFORMATION_MESSAGE);
				txtGrword.setText("");
			}
    	}
    	
    			);
    	btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			dispose();
			 
			}
		});
    }
    
    public void initFrame()
    {
    	setTitle("添加学生信息");
    	setSize(400,200);
    	setLocation(300, 300);
    	setLayout(new GridLayout(3,4));
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setVisible(true);
    }
    
    
}
