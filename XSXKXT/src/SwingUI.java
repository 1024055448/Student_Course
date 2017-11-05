import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class SwingUI extends JFrame{
 
	  Manage my; 
	  Manage1 my1;
	 JMenuItem addItem;
	 JMenuItem queryItem ;
	 JMenuItem aboutItem;
	 JMenuItem exitItem;
	// JMenuItem delItem ;
	 JMenuItem gaiItem;
	 JPanel jp1=new JPanel();
	 JMenuItem addItem1;
	 JMenuItem queryItem1 ;
	// JMenuItem delItem1 ;
	JMenuItem ggItem1 ;
	protected ArrayList<Student> stuList;
	public SwingUI(  Manage my,Manage1 my1){
		this.my = my;
		
		
		Tool.readWord("d:/ѡ��.txt", my);	
		//Tool.putMap2Words("d:/ѡ��.txt", my.getWordList());
		this.my1 = my1;
		Tool1.readWord1("d:/����.txt", my1);
		//Tool1.putMap2Words1("d:/����.txt", my1.getWordList1());
		initMenu();
		initFrame();
	}
	
	public void initFrame(){
		ImageIcon nkt = new ImageIcon("src/image/8.jpg");
			JLabel label1=new JLabel(nkt);
			jp1.add(label1);
			   
		setTitle("���ʴ�ѧ��ϢѧԺѧ��ѡ��ϵͳ");
		this.setSize(500, 400);
		JLabel lblAbout = new JLabel(nkt);
    	setLayout(new BorderLayout());
    	add(lblAbout,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocation(SwingUI.getMidDimesion( new Dimension(500,500)));
		this.setVisible(true);
		this.setResizable(false);
		
			
	}
	public static Point getMidDimesion(Dimension d)
	{
	Point p = new Point();
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	p.setLocation((dim.width - d.width)/2,(dim.height - d.height)/2);
	return p;
	}
	
	//��ʼ���˵�
	private void initMenu(){
		
		JMenuBar bar = new JMenuBar();
		
		 JMenu xstMenu = new  JMenu("ѧ����Ϣ");  
		 xstMenu.setFont(new Font("�����п�",Font.BOLD,15));
		 JMenu schMenu  =  new  JMenu("ѧ�ƾ���");
		 schMenu.setFont(new Font("�����п�",Font.BOLD,15));
		 JMenu sysMenu  =  new  JMenu("ϵͳ��Ϣ");
		sysMenu.setFont(new Font("�����п�",Font.BOLD,15));
		 /*final DefaultTableModel tableModel = new DefaultTableModel(col, 0);  
		    JTable table = new JTable(tableModel);  
         table.setEnabled(false);  
			JScrollPane pane = new JScrollPane(table); //����table���ɱ༭  
         JTableHeader tableH;  
         table.setBackground(new Color(144,238,144));  
         table.setForeground(new Color(100,100,100)) ;  
         table.setGridColor(new Color(105 ,105, 105));  
         tableH = table.getTableHeader();  
         //���ñ�ͷ�ı���ɫ  
         tableH.setBackground(new Color(200, 200, 200));  
         //���ñ�ͷ��������ɫ
		 */
		 
		 
		 
		 addItem = new JMenuItem("���ѡ��");
		 addItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AddFrame add = new AddFrame(my);
			}
		});
		 queryItem = new JMenuItem("��ѯѡ��");
		 queryItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				QueryFrame query = new QueryFrame(my);
			}
		});
		/* delItem = new JMenuItem("ɾ��ѡ��");
		 delItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DelFrame del = new DelFrame(my);
			}
		});*/
		 gaiItem = new JMenuItem("�޸�ѡ��");
		 gaiItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GaiFrame replace = new GaiFrame(my);
			}
		});
		 addItem1 = new JMenuItem("ѧ�ƾ�������");
		 addItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Add1 add = new Add1(my1);
			}
		});
		 queryItem1 = new JMenuItem("��ѯ����");
		 queryItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Query query = new Query(my1);
			}
		});
	/*	delItem1 = new JMenuItem("ɾ���ü�¼");
		delItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Del del1 = new Del(my1);
			}
		});*/
		 ggItem1 = new JMenuItem("��������");
		 ggItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				XKGG add = new XKGG();
			}
		});
		 aboutItem = new  JMenuItem("����ϵͳ");
		 aboutItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					About about = new About();

				}
			});
		 exitItem = new JMenuItem("�˳�ϵͳ");
		 exitItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
				
					JOptionPane.showMessageDialog(null, "ллʹ�����ʴ�ѧѡ��ϵͳ");
					System.exit(0);
				
				}
			});
		 
		 xstMenu.add(addItem);
		 xstMenu.add(queryItem);
		// xstMenu.add(delItem);
		 xstMenu.add(gaiItem);
		 schMenu.add(addItem1);
		 schMenu.add(queryItem1);
		 //schMenu.add(delItem1);
		 schMenu.add(ggItem1);
		 sysMenu.add(aboutItem);
		 sysMenu.add(exitItem);
		 
		 bar.add(xstMenu);
		bar.add(schMenu);
		 bar.add(sysMenu);
		 
		 setJMenuBar(bar);
		 
		 
		 
	}

}
