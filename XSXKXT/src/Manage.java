/*注释词典类 提供单词的加入和查询功能*/
import java.util.ArrayList;


import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;


public class Manage {	
	private List<Student> stuList;
	
	public Manage(){
		
		stuList = new ArrayList<Student>();
		
	}
	
	public void add(Student word){
		
		stuList.add(word);
	}
	
	
	public Student searchWord(String str){
		for(int i=0;i<stuList.size();i++)
			if(((Student)stuList.get(i)).getNumber().equals(str)||((Student)stuList.get(i)).getName().equalsIgnoreCase(str)||
					((Student)stuList.get(i)).getKemu().equalsIgnoreCase(str)||((Student)stuList.get(i)).getGrade().equalsIgnoreCase(str))
				return (Student)stuList.get(i);
	    return null;  
	}
	
	public boolean del(int i)
	{
		if(i>=0)
			stuList.remove(i);
		else
			return false;
		return true;
	}
	public boolean replace(String nu,String na,String ke,String gr)
	{// String str_number = null,str_name,str_kemu,str_grade; 
		 
	String str=nu;
	String str2=na;
	for (int i=0;i<stuList.size();i++) 
	
	{if(((Student)stuList.get(i)).getNumber().equals(str)||((Student)stuList.get(i)).getName().equalsIgnoreCase(str2))
	
	//if(((Student)stuList.get(i)).getNumber().equals(str)||((Student)stuList.get(i)).getName().equalsIgnoreCase(str)||
				//((Student)stuList.get(i)).getKemu().equalsIgnoreCase(str)||((Student)stuList.get(i)).getGrade().equalsIgnoreCase(str))
	 //增强for循环有两个好处：1.写起来简单，2.遍历集合、容器简单 
      
        {  
            ((Student) stuList.get(i)).setNumber(nu);
            ((Student) stuList.get(i)).setName(na);
            ((Student) stuList.get(i)).setKemu(ke);
            ((Student) stuList.get(i)).setGrade(gr);
       // 	break;
            return true;
        }   
    }
	return false;

  
}
        public void setWordList(List list){
        	stuList = list;
               
        }

        public List<Student> getWordList(){
            return stuList;
        }
		public void del(Student word) {
			// TODO Auto-generated method stub
			
		}
	
		

		}

