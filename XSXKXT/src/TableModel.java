
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
    //根据实际情况返回列数
    return 4;
  }
 
  @Override
  public String getColumnName(int column) {
		
	      if (column == 0)
	        return  "学生学号";
	     
	    else if (column == 1)
		    return  "学生姓名";
	    else if (column == 2)
		    return  "课程名称";
	    else
		    return  "课程成绩";
	    
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
	      throw new IllegalArgumentException("参数data不能为null。");
	 
	    this.data = data;
	 
	    fireTableDataChanged();
	  }
	  public List<Student> getData()
	  {
		  return data;

       }

	


}