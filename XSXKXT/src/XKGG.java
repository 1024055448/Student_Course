import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class XKGG extends JFrame {

	public XKGG(){
		initFrame();
		initControl();
	}
	 private void initControl() {
		// TODO Auto-generated method stub
		 setLayout(new GridLayout(4,1));
	    	JLabel lblAbout = new JLabel("学科竞赛包括：语文，数学，英语，蓝桥杯,IC3.");
	    	JLabel lblAbout1 = new JLabel("报名其他学科视为无效！.");
	    	JLabel lblAbout2 = new JLabel("学科测试成绩公布时间另行通知！");
	    	
	    	
	    	add(lblAbout);
	    	add(lblAbout1);
	    	add(lblAbout2);
	    	JButton btnClose =new JButton("关闭");
	    	setSize(300,300);
	    	add(btnClose,BorderLayout.SOUTH);
	    	btnClose.addActionListener(new ActionListener(){
	    		
	    		//弹出消息框
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent arg0) {
	    			// TODO Auto-generated method stub
	    		
	    			dispose();//
	    		}});
	    	}
	
	public void initFrame()
	    {
	    	
		setTitle("竞赛公告");
		 
    	setLocation(About.getMidDimesion(new Dimension(300,300)));
    	setLayout(new GridLayout(3, 2));
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }


 public static Point getMidDimesion(Dimension d)
	{
	Point p = new Point();
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	p.setLocation((dim.width - d.width)/2,(dim.height - d.height)/2);
	return p;
	}
    
}