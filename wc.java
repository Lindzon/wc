package gg;


	import java.io.*;
	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class wc{
	


	public static void main(String[] args) {

	while (true){

	
	System.out.println("\n######------ WC����-----####");
	System.out.println(" ** -c �����ַ���");
	System.out.println(" ** -w ���ص�����");
	System.out.println(" ** -l ��������");
	System.out.println(" ** -a  ͳ�ƴ�����/����/ע���� ");
	System.out.println("-----------------------------------------------------------");

	// ��ȡ����ָ��

	System.out.print(" ���������");
	Scanner input=new Scanner(System.in);
	// String c=input.next();
	String m=input.nextLine();
	String arr[]=m.split("\\s");

	// ���ݻ�ȡָ����ִ�к���
	try{
	switch(arr[0]){
	case"-c":searchchar.searchchar(); break; //�����ַ���
	case"-w":searchword.searchword(); break; //���ص�����
	case"-l":searchline.searchline(); break; //�����ַ���
	case"-a": Code.code(arr[0]) ;break; //ͳ�ƴ����� / ���� / ע����
	default:System.out.println("\n******** �����ڸù���ָ��!");break;
	}
	} catch (FileNotFoundException e) {
	System.out.println("\n******** ������������·���ļ��Ҳ��������� **********");
	} catch (IOException e){
	System.out.println("\n******** ���������ļ����뷢���쳣������ **********");
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	}


