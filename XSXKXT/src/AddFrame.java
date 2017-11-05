

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
    	JLabel lblNuword= new JLabel("ѧ��ѧ��");
    	lblNuword.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblNuword);
    	txtNuword= new JTextField();
    	add(txtNuword);
    	JLabel lblNaword =new JLabel("ѧ������");
    	lblNaword.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblNaword);
    	txtNaword = new JTextField();
    	add(txtNaword);
    	JLabel lblKeword =new JLabel("ѧ��ѡ�޿γ�");
    	lblKeword.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblKeword);
    	txtKeword= new JTextField();
    	add(txtKeword);
    	JLabel lblGrword =new JLabel("ѡ�޿γɼ�");
    	lblGrword.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblGrword);
    	txtGrword = new JTextField();
    	add(txtGrword);
    	btnAdd =new JButton("���");
    	add(btnAdd);
    	btnClose = new JButton("�ر�");
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
				if(txtKeword.getText().equals("����")||txtKeword.getText().equals("��ѧ")||txtKeword.getText().equals("Ӣ��")||txtKeword.getText().equals("java")
							||txtKeword.getText().equals("���ݿ�")||txtKeword.getText().equals("��ҵʵѵ")||txtKeword.getText().equals("��׿����")
							)
					//&&txtGrword.getText().valueOf(i)
				{my.add(word);
				
				Tool.putMap2Words("D:/ѡ��.txt", my.getWordList());
		JOptionPane.showMessageDialog(null, "��ӳɹ�", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);	
		        txtNuword.setText("");
				txtNaword.setText("");
				txtKeword.setText("");
				txtGrword.setText("");
				}
				else
				JOptionPane.showMessageDialog(null, "�����Ա�����ĿΪ    ����   ��ѧ   Ӣ��   java ���ݿ�  ��ҵʵѵ   ��׿����   ������һ��", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);
				 txtNuword.setText("");
					txtNaword.setText("");
					txtKeword.setText("");
					txtGrword.setText("");
				
			//	}
			}
				else
					JOptionPane.showMessageDialog(null, "��������ȷ�ķ���", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);
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
    	setTitle("���ѧ����Ϣ");
    	setSize(400,200);
    	setLocation(300, 300);
    	setLayout(new GridLayout(3,4));
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setVisible(true);
    }
    
    
}
