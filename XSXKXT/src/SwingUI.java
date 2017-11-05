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
		
		
		Tool.readWord("d:/选课.txt", my);	
		//Tool.putMap2Words("d:/选课.txt", my.getWordList());
		this.my1 = my1;
		Tool1.readWord1("d:/竞赛.txt", my1);
		//Tool1.putMap2Words1("d:/竞赛.txt", my1.getWordList1());
		initMenu();
		initFrame();
	}
	
	public void initFrame(){
		ImageIcon nkt = new ImageIcon("src/image/8.jpg");
			JLabel label1=new JLabel(nkt);
			jp1.add(label1);
			   
		setTitle("临沂大学信息学院学生选课系统");
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
	
	//初始化菜单
	private void initMenu(){
		
		JMenuBar bar = new JMenuBar();
		
		 JMenu xstMenu = new  JMenu("学生信息");  
		 xstMenu.setFont(new Font("华文行楷",Font.BOLD,15));
		 JMenu schMenu  =  new  JMenu("学科竞赛");
		 schMenu.setFont(new Font("华文行楷",Font.BOLD,15));
		 JMenu sysMenu  =  new  JMenu("系统信息");
		sysMenu.setFont(new Font("华文行楷",Font.BOLD,15));
		 /*final DefaultTableModel tableModel = new DefaultTableModel(col, 0);  
		    JTable table = new JTable(tableModel);  
         table.setEnabled(false);  
			JScrollPane pane = new JScrollPane(table); //设置table不可编辑  
         JTableHeader tableH;  
         table.setBackground(new Color(144,238,144));  
         table.setForeground(new Color(100,100,100)) ;  
         table.setGridColor(new Color(105 ,105, 105));  
         tableH = table.getTableHeader();  
         //设置表头的背景色  
         tableH.setBackground(new Color(200, 200, 200));  
         //设置表头的文字颜色
		 */
		 
		 
		 
		 addItem = new JMenuItem("添加选课");
		 addItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AddFrame add = new AddFrame(my);
			}
		});
		 queryItem = new JMenuItem("查询选课");
		 queryItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				QueryFrame query = new QueryFrame(my);
			}
		});
		/* delItem = new JMenuItem("删除选课");
		 delItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DelFrame del = new DelFrame(my);
			}
		});*/
		 gaiItem = new JMenuItem("修改选课");
		 gaiItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GaiFrame replace = new GaiFrame(my);
			}
		});
		 addItem1 = new JMenuItem("学科竞赛报名");
		 addItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Add1 add = new Add1(my1);
			}
		});
		 queryItem1 = new JMenuItem("查询竞赛");
		 queryItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Query query = new Query(my1);
			}
		});
	/*	delItem1 = new JMenuItem("删除该记录");
		delItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Del del1 = new Del(my1);
			}
		});*/
		 ggItem1 = new JMenuItem("竞赛公告");
		 ggItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				XKGG add = new XKGG();
			}
		});
		 aboutItem = new  JMenuItem("关于系统");
		 aboutItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					About about = new About();

				}
			});
		 exitItem = new JMenuItem("退出系统");
		 exitItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
				
					JOptionPane.showMessageDialog(null, "谢谢使用临沂大学选课系统");
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
