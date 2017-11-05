import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Add1 extends JFrame{
    Manage1 my1;
    JTextField txtNuword1;
    JTextField txtNaword1;
    JTextField txtKeword1;
    JTextField txtGrword1;
    
    JButton btnAdd1;
    JButton btnClose1;
    public Add1( Manage1 my1)
    {
    	this.my1 = my1;
    	initControl();
    	initFrame();
    }
    public void initControl()
    {
    	JLabel lblNuword1= new JLabel("学生学号");
    	lblNuword1.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblNuword1);
    	txtNuword1= new JTextField();
    	add(txtNuword1);
    	JLabel lblNaword1 =new JLabel("学生姓名");
    	lblNaword1.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblNaword1);
    	txtNaword1 = new JTextField();
    	add(txtNaword1);
    	JLabel lblKeword1 =new JLabel("报名竞赛课程");
    	lblKeword1.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblKeword1);
    	txtKeword1= new JTextField();
    	add(txtKeword1);
    	JLabel lblGrword1 =new JLabel("竞赛课编号");
    	lblGrword1.setFont(new Font("华文彩云",Font.BOLD,15));
    	add(lblGrword1);
    	txtGrword1 = new JTextField();
    	add(txtGrword1);
    	btnAdd1 =new JButton("添加记录");
    	add(btnAdd1);
    	btnClose1 = new JButton("关闭");
    	add(btnClose1);
    	btnAdd1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JINGSAI word1 =new JINGSAI(txtNuword1.getText(),txtNaword1.getText(),txtKeword1.getText(),txtGrword1.getText());
				word1.setXuehao1(txtNuword1.getText());
				word1.setXM(txtNaword1.getText());
				word1.setKecheng(txtKeword1.getText());
				word1.setKch(txtGrword1.getText());
				if(txtKeword1.getText().equals("语文竞赛")&&txtGrword1.getText().equals("01")||txtKeword1.getText().equals("数学竞赛")&&txtGrword1.getText().equals("02")
						||txtKeword1.getText().equals("英语竞赛")&&txtGrword1.getText().equals("03")||txtKeword1.getText().equals("蓝桥杯")&&txtGrword1.getText().equals("04")
				||txtKeword1.getText().equals("IC3")&&txtGrword1.getText().equals("05"))
				{my1.add1(word1);
				Tool1.putMap2Words1("D:/竞赛.txt", my1.getWordList1());
				JOptionPane.showMessageDialog(null, "添加成功", "提示框", JOptionPane.INFORMATION_MESSAGE);	
				        txtNuword1.setText("");
						txtNaword1.setText("");
						txtKeword1.setText("");
						txtGrword1.setText("");
						}
						else
						JOptionPane.showMessageDialog(null, "管理员请输入正确的竞赛科目以及竞赛号:语文竞赛 01,数学竞赛 02,英语竞赛 03,蓝桥杯 04,IC3 05"
								+ "", "提示框", JOptionPane.INFORMATION_MESSAGE);
						 txtNuword1.setText("");
							txtNaword1.setText("");
							txtKeword1.setText("");
							txtGrword1.setText("");
						
					//	}
					}});
    	btnClose1.addActionListener(new ActionListener() {
			
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
    }}
    
    

