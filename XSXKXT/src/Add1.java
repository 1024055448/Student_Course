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
    	JLabel lblNuword1= new JLabel("ѧ��ѧ��");
    	lblNuword1.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblNuword1);
    	txtNuword1= new JTextField();
    	add(txtNuword1);
    	JLabel lblNaword1 =new JLabel("ѧ������");
    	lblNaword1.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblNaword1);
    	txtNaword1 = new JTextField();
    	add(txtNaword1);
    	JLabel lblKeword1 =new JLabel("���������γ�");
    	lblKeword1.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblKeword1);
    	txtKeword1= new JTextField();
    	add(txtKeword1);
    	JLabel lblGrword1 =new JLabel("�����α��");
    	lblGrword1.setFont(new Font("���Ĳ���",Font.BOLD,15));
    	add(lblGrword1);
    	txtGrword1 = new JTextField();
    	add(txtGrword1);
    	btnAdd1 =new JButton("��Ӽ�¼");
    	add(btnAdd1);
    	btnClose1 = new JButton("�ر�");
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
				if(txtKeword1.getText().equals("���ľ���")&&txtGrword1.getText().equals("01")||txtKeword1.getText().equals("��ѧ����")&&txtGrword1.getText().equals("02")
						||txtKeword1.getText().equals("Ӣ�ﾺ��")&&txtGrword1.getText().equals("03")||txtKeword1.getText().equals("���ű�")&&txtGrword1.getText().equals("04")
				||txtKeword1.getText().equals("IC3")&&txtGrword1.getText().equals("05"))
				{my1.add1(word1);
				Tool1.putMap2Words1("D:/����.txt", my1.getWordList1());
				JOptionPane.showMessageDialog(null, "��ӳɹ�", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);	
				        txtNuword1.setText("");
						txtNaword1.setText("");
						txtKeword1.setText("");
						txtGrword1.setText("");
						}
						else
						JOptionPane.showMessageDialog(null, "����Ա��������ȷ�ľ�����Ŀ�Լ�������:���ľ��� 01,��ѧ���� 02,Ӣ�ﾺ�� 03,���ű� 04,IC3 05"
								+ "", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);
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
    	setTitle("���ѧ����Ϣ");
    	setSize(400,200);
    	setLocation(300, 300);
    	setLayout(new GridLayout(3,4));
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setVisible(true);
    }}
    
    

