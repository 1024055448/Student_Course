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
	    	JLabel lblAbout = new JLabel("ѧ�ƾ������������ģ���ѧ��Ӣ����ű�,IC3.");
	    	JLabel lblAbout1 = new JLabel("��������ѧ����Ϊ��Ч��.");
	    	JLabel lblAbout2 = new JLabel("ѧ�Ʋ��Գɼ�����ʱ������֪ͨ��");
	    	
	    	
	    	add(lblAbout);
	    	add(lblAbout1);
	    	add(lblAbout2);
	    	JButton btnClose =new JButton("�ر�");
	    	setSize(300,300);
	    	add(btnClose,BorderLayout.SOUTH);
	    	btnClose.addActionListener(new ActionListener(){
	    		
	    		//������Ϣ��
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent arg0) {
	    			// TODO Auto-generated method stub
	    		
	    			dispose();//
	    		}});
	    	}
	
	public void initFrame()
	    {
	    	
		setTitle("��������");
		 
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