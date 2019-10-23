package gg;

	import javax.swing.*;
	import java.io.*;
	import java.util.Scanner;
	
public class searchword {


			public static void searchword( ) throws Exception {
		        // 统计一个文件的单词数
		       Scanner input = new Scanner(System.in);

		        System.out.println("请输入路径");
		        String path = input.next();

		        File file = new File(path);
		        FileReader reader = new FileReader(file);
		        int countword = 0;
		      
		        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
		        //InputStreamReader将字符流向字节流转换

		        BufferedReader br = new BufferedReader(isr);//使用缓冲区，可以使用缓冲区的read(),readLine()方法；
		 

		        while(br.read()!=-1)//read()=-1代表数据读取完毕
		        {
		            String s = br.readLine();
		            countword += s.split(" ").length;//split() 方法用于把一个字符串分割成字符串数组,字符串数组的长度，就是单词个数
		          
		        }
		        isr.close();//关闭文件

		        System.out.println("word count "+countword);
		       
		    }

		}




