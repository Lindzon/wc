package gg;

	import javax.swing.*;
	import java.io.*;
	import java.util.Scanner;
	
public class searchword {


			public static void searchword( ) throws Exception {
		        // ͳ��һ���ļ��ĵ�����
		       Scanner input = new Scanner(System.in);

		        System.out.println("������·��");
		        String path = input.next();

		        File file = new File(path);
		        FileReader reader = new FileReader(file);
		        int countword = 0;
		      
		        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
		        //InputStreamReader���ַ������ֽ���ת��

		        BufferedReader br = new BufferedReader(isr);//ʹ�û�����������ʹ�û�������read(),readLine()������
		 

		        while(br.read()!=-1)//read()=-1�������ݶ�ȡ���
		        {
		            String s = br.readLine();
		            countword += s.split(" ").length;//split() �������ڰ�һ���ַ����ָ���ַ�������,�ַ�������ĳ��ȣ����ǵ��ʸ���
		          
		        }
		        isr.close();//�ر��ļ�

		        System.out.println("word count "+countword);
		       
		    }

		}




