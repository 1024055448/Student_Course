
import java.awt.Font;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
 

import javax.swing.table.AbstractTableModel;


 
public class TableModel extends AbstractTableModel {
 
  private List<Student> data;
  public TableModel(List<Student> my)
  {
	  this.data = my;
  }
 
  @Override
  public int getRowCount() {
    return data.size();
  }
 
  @Override
  public int getColumnCount() {
    //����ʵ�������������
    return 4;
  }
 
  @Override
  public String getColumnName(int column) {
		
	      if (column == 0)
	        return  "ѧ��ѧ��";
	     
	    else if (column == 1)
		    return  "ѧ������";
	    else if (column == 2)
		    return  "�γ�����";
	    else
		    return  "�γ̳ɼ�";
	    
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
Student book = data.get(rowIndex); 
if (columnIndex == 0)
	  return book.getNumber();
if (columnIndex == 1)
	  return book.getName();
if (columnIndex == 2)
	return book.getKemu();
 else
	return book.getGrade();
}


public void setData(List<Student> data) {
	// TODO Auto-generated method stub
	 if (data == null)
	      throw new IllegalArgumentException("����data����Ϊnull��");
	 
	    this.data = data;
	 
	    fireTableDataChanged();
	  }
	  public List<Student> getData()
	  {
		  return data;

       }

	


}