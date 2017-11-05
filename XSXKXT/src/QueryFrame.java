import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class QueryFrame extends JFrame{
	 private Manage my;
	 JTextField txtQuery;
	 JButton btnQuery,btnClose,btndel;;
	 JTable table;
	 TableModel dataModel;
	 public QueryFrame( Manage my){
		 this.my = my;
		 initControl();
		 initFrame();
		 
	 }
	 public void initTable(){
		 dataModel= new TableModel(my.getWordList());
		 table  = new JTable(dataModel);
		 table.setFont(new Font("华文行楷",Font.BOLD,15));
		table.setPreferredScrollableViewportSize(new Dimension(550,30));
		JScrollPane scrollPane=new JScrollPane(table);
		 add(scrollPane,BorderLayout.CENTER);
	 }
	
	 private void initControl()
	 {
		 setLayout(new BorderLayout());
		 JPanel panel1 = new JPanel();
		
		 panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		 panel1.add(new JLabel("查询"));
		 txtQuery = new JTextField(10);
		 panel1.add(txtQuery);
		 btnQuery = new JButton("查询");
		 panel1.add(btnQuery);
		 btnQuery.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Student word =my.searchWord(txtQuery.getText());
				if(word ==null)
					JOptionPane.showMessageDialog(QueryFrame.this,"无此学生!");
				else
				{
				   List<Student> list = new ArrayList<Student>();
					list.add(word);
					((TableModel) table.getModel()).setData(list);
				}
			}
		});
		 add(panel1,BorderLayout.NORTH);
		 initTable();
		 
		 JPanel panel2 = new JPanel();
		
		 panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 btnClose = new JButton("关闭");
		
		 btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		 btndel= new JButton("删除 ");
		 btndel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int row = table.getSelectedRow();//获取选中的行号
					if(row == -1){
						JOptionPane.showMessageDialog(QueryFrame.this,"请选择要删除的行!");
					}else{
						List<Student> data =((TableModel) table.getModel()).getData();
						
						data.remove(row);
						dataModel.setData(data);
						int col =table.getSelectedColumn();
						String str =table.getValueAt(row, col).toString();
						Tool.putMap2Words("D:/1.txt", my.getWordList());
					}
				}
			});
		 panel2.add(btndel);
		 panel2.add(btnClose);
		 add(panel2,BorderLayout.SOUTH);
	 }
	 //初始化窗体
	 public void initFrame(){
			setTitle("查找学生");
			this.setSize(400, 400);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setLocation(SwingUI.getMidDimesion( new Dimension(400,400)));
			this.setVisible(true);
		}
		public static Point getMidDimesion(Dimension d)
		{
		Point p = new Point();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		p.setLocation((dim.width - d.width)/2,(dim.height - d.height)/2);
		return p;
		}
	 

}
