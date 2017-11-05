/*单词的描述 包括单词的中文cWord 英文eWord*/

public class Student {
  String number;
String name;
String kemu;
 String grade;


  public String getNumber() {
	  return number;
  }

  public void setNumber(String word) {
	 number = word;
  }

  public String getName() {
	  return name;
  }

  public void setName(String word) {
	 name = word;
  }
  public String getKemu() {
	  return kemu;
  }

  public void setKemu(String word) {
	  kemu = word;
  }

  public String getGrade() {
	  return grade;
  }

  public void setGrade(String word) {
	  grade = word;
  }
  public Student(String word, String word2,String word3, String word4) {
	  super();
	 number = word;
	  name = word2;
	  kemu = word3;
	  grade = word4;
  }
  public Student(){
	  this("","","","");
  }
    
  public String toString()
  {
	   return "["+number+","+name+","+kemu+","+grade+"]";
  }
  
  

}
