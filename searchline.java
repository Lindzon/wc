package gg;
	import javax.swing.*;
	import java.io.*;
	import java.util.Scanner;

public class searchline {
		
			public static void searchline( ) throws Exception {
		        // ͳ��һ���ļ����ַ�����������������
		       Scanner input = new Scanner(System.in);

		        System.out.println("������·��");
		        String path = input.next();

		        File file = new File(path);
		        FileReader reader = new FileReader(file);
		        int countline = 0;
		      
		        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
		        //InputStreamReader���ַ������ֽ���ת����

		        BufferedReader br = new BufferedReader(isr);//ʹ�û�����������ʹ�û�������read(),readLine()������
		  //readLineÿ�ζ�ȡһ�У�read()��ȡ�����ļ����������ļ�������ֱ�ӵķ�ʽ��

		        while(br.read()!=-1)//read()=-1�������ݶ�ȡ���
		        {
		            String s = br.readLine();
		            countline++;//��Ϊ�ǰ��ж�ȡ������ÿ������һ���ɼ�����е���Ŀ
		          
		        }
		        isr.close();//�ر��ļ�

		        System.out.println("line count "+countline);
		       
		    }

		}




