import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Tool1 {
	 public static void readWord1(String filename1,Manage1 my1){
	   		String str;
	   		try {
	   			FileReader fr=new FileReader("d:/竞赛.txt");
	   			BufferedReader br=new BufferedReader(fr);
	   			while((str=br.readLine())!=null)
	   			{
	   				String[] str2=str.split(",");
	   				JINGSAI  word1 =new JINGSAI(str2[0],str2[1],str2[2],str2[3]);
	   			word1.setXuehao1(str2[0]);
	   				word1.setXM(str2[1]);
	   				word1.setKecheng(str2[2]);
	   				word1.setKch(str2[3]);
	   			 my1.add1(word1);
	   			}
	   			br.close();
	   		} catch (Exception e) {
	   			e.printStackTrace();
	   		}
	   	}
	   
	  public static void putMap2Words1(String filename1,List<JINGSAI> list1) {//将Dict中的单词列表写入文件
			 String str;

		   try{  
		      FileWriter fw=new FileWriter(filename1);
				 BufferedWriter bw=new BufferedWriter(fw);

		      for(int i=0;i<list1.size();i++)
		      {  
		    	  str=(list1.get(i)).getXuehao1()+","+ (list1.get(i)).getXM()+","+(list1.get(i)).getKecheng()+","+(list1.get(i)).getKch();
					 bw.write(str);
					 bw.newLine();
		      }
		      bw.flush();
				 bw.close();
		  
		   }catch(IOException e){
		     e.printStackTrace();
		   }
		   
		 } }

