import java.io.*;
public class nsp{
	public static void main(String[]args){
		Thread t=new Thread(){
			public void run(){
				System.out.println("java is ");
			}
		};
			t.start();	
}
}
