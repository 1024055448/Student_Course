import java.util.List;

public class JINGSAI {
	 String xuehao1;
	 String xm;
	 String kecheng;
	 String kch;

	  public String getXuehao1() {
		  return xuehao1;
	  }

	  public void setXuehao1(String word1) {
		  xuehao1 = word1;
	  }

	  public String getXM() {
		  return xm;
	  }

	  public void setXM(String word1) {
		  xm = word1;
	  }
	  public String getKecheng() {
		  return kecheng;
	  }

	  public void setKecheng(String word1) {
		 kecheng = word1;
	  }

	  public String getKch() {
		  return kch;
	  }

	  public void setKch(String word1) {
		 kch = word1;
	  }
	  
	  public JINGSAI(String word1, String word2,String word3, String word4) {
		  super();
		  xuehao1 = word1;
		  xm = word2;
		kecheng=word3;
		kch=word4;
	  }
	  public JINGSAI(){
		  this("","","","");
	  }

	  public String toString(){
		return "["+xuehao1+","+xm+","+kecheng+","+kch+"]";  
	  }

}