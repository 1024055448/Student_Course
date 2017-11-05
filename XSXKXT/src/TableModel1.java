
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
 

import javax.swing.table.AbstractTableModel;


 
public class TableModel1 extends AbstractTableModel {
 
  private List<JINGSAI> data1;
  public TableModel1(List<JINGSAI> my1)
  {
	  this.data1 = my1;
  }
 
  @Override
  public int getRowCount() {
    return data1.size();
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
		    return  "竞赛科目";
	    else
		    return  "科目号";
	    
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
JINGSAI book = data1.get(rowIndex); 
if (columnIndex == 0)
	  return book.getXuehao1();
if (columnIndex == 1)
	  return book.getXM();
if (columnIndex == 2)
	return book.getKecheng();
 else
	return book.getKch();
}


public void setData1(List<JINGSAI> data1) {
	// TODO Auto-generated method stub
	 if (data1 == null)
	      throw new IllegalArgumentException("参数data不能为null。");
	 
	    this.data1 = data1;
	 
	    fireTableDataChanged();
	  }
	  public List<JINGSAI> getData1()
	  {
		  return data1;

       }

	


}