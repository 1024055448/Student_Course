import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;  
  

public class GaiFrame extends JFrame {   //修改
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
	    	btnAdd =new JButton("modify");
	    	add(btnAdd);
	    	btnClose = new JButton("CLose");
	    	add(btnClose);
      /*  JDialog dl = new JDialog();  
        JLabel text = new JLabel("没有这条记录！重新输入！");  
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
    				JOptionPane.showMessageDialog(null, "修改成功", "提示框", JOptionPane.INFORMATION_MESSAGE);//弹出提示

            	else
    				JOptionPane.showMessageDialog(null, "找不到该学生", "提示框", JOptionPane.INFORMATION_MESSAGE);//弹出提示

				Tool.putMap2Words("D:/选课.txt", my.getWordList());
		//		txtNuword.setText(stu.number);
	//			txtNaword.setText(stu.name);
			//	txtKeword.setText(stu.kemu);
		//		txtGrword.setText(stu.grade);
				//System.out.println(word);
			
	
				
				 }}); 
        /*    boolean flag = false;  	
				for (Student my:stuList) { //增强for循环有两个好处：1.写起来简单，2.遍历集合、容器简单 
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
                    JLabel text = new JLabel("没有这条记录！重新输入！");  
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
    	setTitle("修改学生信息");
    	setSize(400,200);
    	setLocation(300, 300);
    	setLayout(new GridLayout(3,4));
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setVisible(true);
    }}
    
 
    
  
  



