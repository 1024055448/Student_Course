import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


//��
public class About extends JFrame {

	public About(){
		initFrame();
		initControl();
	}
	 private void initControl() {
		// TODO Auto-generated method stub
		 setLayout(new BorderLayout());
	    	JLabel lblAbout = new JLabel("���ʴ�ѧ��ϢѧԺѧ��ѡ��ϵͳ  by fz&lws");
	    	
	    	add(lblAbout,BorderLayout.CENTER);
	    	JButton btnClose =new JButton("�ر�");
	    	setSize(300,300);
	    	add(btnClose,BorderLayout.SOUTH);
	    	btnClose.addActionListener(new ActionListener(){
	    		
	    		//������Ϣ��
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent arg0) {
	    			// TODO Auto-generated method stub
	    		//	JOptionPane.showMessageDialog(null, "ллʹ�����ʴ�ѧѡ��ϵͳ");
	    			dispose();//
	    		}});
	    	}
	
	public void initFrame()
	    {
	    	
		setTitle("About");
		 
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

