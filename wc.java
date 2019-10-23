package gg;


	import java.io.*;
	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class wc{
	


	public static void main(String[] args) {

	while (true){

	
	System.out.println("\n######------ WC程序-----####");
	System.out.println(" ** -c 返回字符数");
	System.out.println(" ** -w 返回单词数");
	System.out.println(" ** -l 返回行数");
	System.out.println(" ** -a  统计代码行/空行/注释行 ");
	System.out.println("-----------------------------------------------------------");

	// 获取输入指令

	System.out.print(" 请输入命令：");
	Scanner input=new Scanner(System.in);
	// String c=input.next();
	String m=input.nextLine();
	String arr[]=m.split("\\s");

	// 根据获取指令来执行函数
	try{
	switch(arr[0]){
	case"-c":searchchar.searchchar(); break; //返回字符数
	case"-w":searchword.searchword(); break; //返回单词数
	case"-l":searchline.searchline(); break; //返回字符数
	case"-a": Code.code(arr[0]) ;break; //统计代码行 / 空行 / 注释行
	default:System.out.println("\n******** 不存在该功能指令!");break;
	}
	} catch (FileNotFoundException e) {
	System.out.println("\n******** 发生错误：输入路径文件找不到！！！ **********");
	} catch (IOException e){
	System.out.println("\n******** 发生错误：文件读入发生异常！！！ **********");
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	}


