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


public class Query extends JFrame{
	 private Manage1 my1;
	 JTextField txtQuery1;
	 JButton btnQuery1,btnClose1,btndel;;
	 JTable table1;
	 TableModel1 dataModel1;
	 public Query( Manage1 my1){
		 this.my1 = my1;
		 initControl();
		 initFrame();
		 
	 }
	 public void initTable(){
		 dataModel1= new TableModel1(my1.getWordList1());
		 table1  = new JTable(dataModel1);
		 table1.setFont(new Font("�����п�",Font.BOLD,15));
		table1.setPreferredScrollableViewportSize(new Dimension(550,30));
		JScrollPane scrollPane=new JScrollPane(table1);
		 add(scrollPane,BorderLayout.CENTER);
	 }
	
	 private void initControl()
	 {
		 setLayout(new BorderLayout());
		 JPanel panel1 = new JPanel();
		
		 panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		 panel1.add(new JLabel("��ѯ:"));
		 txtQuery1 = new JTextField(10);
		 panel1.add(txtQuery1);
		 btnQuery1 = new JButton("��ѯ");
		 panel1.add(btnQuery1);
		 btnQuery1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JINGSAI word1 =my1.searchWord1(txtQuery1.getText());
				if(word1 ==null)
					JOptionPane.showMessageDialog(Query.this,"�޴˼�¼!");
				else
				{
				   List<JINGSAI> list1 = new ArrayList<JINGSAI>();
					list1.add(word1);
					((TableModel1) table1.getModel()).setData1(list1);
				}
			}
		});
		 add(panel1,BorderLayout.NORTH);
		 initTable();
		 
		 JPanel panel2 = new JPanel();
		
		 panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 btnClose1 = new JButton("�ر�");
		
		 btnClose1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		 btndel= new JButton("ɾ��");
		 btndel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int row = table1.getSelectedRow();//��ȡѡ�е��к�
					if(row == -1){
						JOptionPane.showMessageDialog(Query.this,"��ѡ��Ҫɾ������!");
					}else{
						List<JINGSAI> data1 =((TableModel1) table1.getModel()).getData1();
						
						data1.remove(row);
						dataModel1.setData1(data1);
						int col =table1.getSelectedColumn();
						String str =table1.getValueAt(row, col).toString();
						Tool1.putMap2Words1("D:/2.txt", my1.getWordList1());
						
					}
				}
			});
		 panel2.add(btndel);
		 panel2.add(btnClose1);
		 add(panel2,BorderLayout.SOUTH);
	 }
	 //��ʼ������
	 public void initFrame(){
			setTitle("����ѧ��");
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
