import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;  
  

public class GaiFrame extends JFrame {   //�޸�
	 Manage my;
	JTextField txtNuword;
	    JTextField txtNaword;
	    JTextField txtKeword;
	    JTextField txtGrword;  
	    JButton btnAdd;
	    JButton btnClose;
	    public GaiFrame( Manage my)
	    {
	    	this.my = my;
	    	
	    	initFrame();
	    	initControl();
	    }
	    public void initControl(){
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
	    	btnAdd =new JButton("modify");
	    	add(btnAdd);
	    	btnClose = new JButton("CLose");
	    	add(btnClose);
      /*  JDialog dl = new JDialog();  
        JLabel text = new JLabel("û��������¼���������룡");  
        dl.add(text);  
        dl.setSize(100,100);  
        dl.setLocationRelativeTo(null);  
        dl.setVisible(true);  */
       // pan1.add(reset);  
     //   setVisible(true);  
        btnAdd.addActionListener(new ActionListener() {  
              
            @Override  
            public void actionPerformed(ActionEvent e) {  
                // TODO Auto-generated method stub  
           // 	Student stu =new Student();
            //	stu.setNumber(txtNuword.getText());
            //	stu.setName(txtNaword.getText());
           // 	stu.setKemu(txtKeword.getText());
           // 	stu.setGrade(txtGrword.getText());
            
            	if(my.replace(txtNuword.getText(),txtNaword.getText(),txtKeword.getText(),txtGrword.getText()))
    				JOptionPane.showMessageDialog(null, "�޸ĳɹ�", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);//������ʾ

            	else
    				JOptionPane.showMessageDialog(null, "�Ҳ�����ѧ��", "��ʾ��", JOptionPane.INFORMATION_MESSAGE);//������ʾ

				Tool.putMap2Words("D:/ѡ��.txt", my.getWordList());
		//		txtNuword.setText(stu.number);
	//			txtNaword.setText(stu.name);
			//	txtKeword.setText(stu.kemu);
		//		txtGrword.setText(stu.grade);
				//System.out.println(word);
			
	
				
				 }}); 
        /*    boolean flag = false;  	
				for (Student my:stuList) { //��ǿforѭ���������ô���1.д�����򵥣�2.�������ϡ������� 
                    if(my.name.equals(str_number))  
                    {  
                        flag = true; 
                     //  Student student=new Student();
                       my.number=str_number;  
                       my.name=str_name;  
                       my.kemu=str_kemu;  
                       my.grade = str_grade;  
                    }     
                }  
                if(!flag)  
                {  
                    JDialog dl = new JDialog();  
                    JLabel text = new JLabel("û��������¼���������룡");  
                    dl.add(text);  
                    dl.setSize(100,100);  
                    dl.setLocationRelativeTo(null);  
                    dl.setVisible(true);  
                }  
            } */ 
       
          
        btnClose.addActionListener(new ActionListener() {  
              
            @Override  
            public void actionPerformed(ActionEvent e) {  
                // TODO Auto-generated method stub  
              dispose();
            }  
        }); 
    }  
    public void initFrame()
    {
    	setTitle("�޸�ѧ����Ϣ");
    	setSize(400,200);
    	setLocation(300, 300);
    	setLayout(new GridLayout(3,4));
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setVisible(true);
    }}
    
 
    
  
  



