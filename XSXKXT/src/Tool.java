//����ʵ���ļ����ݵĶ���д
import java.util.*;



import java.io.*;
    public class Tool{
     public static  void  readWord(String filename,Manage my){   
	  String str;
    try{
    	
    	 FileReader fr=new FileReader(filename);
		 BufferedReader br=new BufferedReader(fr);
      while ((str =br.readLine())!=null){
    	  String[] strl =str.split(",");/*�ֿ� */
			 Student st=new Student(strl[0],strl[1],strl[2],strl[3]);
			 st.setNumber(strl[0]);
			 st.setName(strl[1]);
			 st.setKemu(strl[2]);
			 st.setGrade(strl[3]);
			 
			 my.add(st);
      }
   br.close();
  }catch(IOException e){
    e.printStackTrace();
  }

 }
 public static void putMap2Words(String filename,List<Student> list) {//��Dict�еĵ����б�д���ļ�
	 String str;

   try{  
      FileWriter fw=new FileWriter(filename);
		 BufferedWriter bw=new BufferedWriter(fw);

      for(int i=0;i<list.size();i++)
      {  
    	  str=(list.get(i)).getNumber()+","+ (list.get(i)).getName()+","+(list.get(i)).getKemu()+","+(list.get(i)).getGrade();
			 bw.write(str);
			 bw.newLine();
      }
      bw.flush();//flush() �ǰѻ�����������ǿ�����
		 bw.close();
  
   }catch(IOException e){
     e.printStackTrace();
   }
   
 } }
 
 