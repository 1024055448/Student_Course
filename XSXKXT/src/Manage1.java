import java.util.ArrayList;
import java.util.List;

public class Manage1 {

	private List<JINGSAI> my1;
	
	public Manage1(){
		
		my1 = new ArrayList<JINGSAI>();
		
	}
	
	public void add1(JINGSAI word1){

	
		my1.add(word1);
		
	}
	public JINGSAI searchWord1(String str){
		for(int i=0;i<my1.size();i++)
			if(((JINGSAI)my1.get(i)).getXuehao1().equals(str)||((JINGSAI)my1.get(i)).getXM().equals(str)||
					((JINGSAI)my1.get(i)).getKecheng().equals(str)||((JINGSAI)my1.get(i)).getKch().equals(str))
			
				return (JINGSAI)my1.get(i);
	    return null;  
	}
	public boolean del1(int i)
	{
		if(i>=0)
			my1.remove(i);
		else
			return false;
		return true;
	}
	

public void setWordList1(List list1){
	my1 = list1;
       
}   
public List<JINGSAI> getWordList1(){
    return my1;
}
public void del1(JINGSAI word1) {
	// TODO Auto-generated method stub
	
}

}

