package Basicsjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Filehandling {
	
	String filename="C:\\Users\\sathishkumar\\eclipse-workspace\\Selenium6PMBatch\\input\\sample.txt";
	String outfilename="C:\\Users\\sathishkumar\\eclipse-workspace\\Selenium6PMBatch\\input\\output.txt";
	
	public void textfileraddata() throws IOException
	{
		File F = new File(filename);
		FileInputStream fs = new FileInputStream(F);
		System.out.println((char)fs.read());
	}
	
	public void textfileraddataallchara() throws IOException
	{
		File F = new File(filename);
		FileInputStream fs = new FileInputStream(F);
		int i;
		while((i=fs.read())!= -1)
		{
			System.out.print((char)i);
		}
	}
	
	public void textfileraddataallcharabyFileread() throws IOException, InterruptedException
	{
		File F = new File(filename);
		FileReader fs = new FileReader(F);
		int i;
		while((i=fs.read())!= -1)
		{
			System.out.print((char)i);
			Thread.sleep(500);
		}
	}
	
	public void textfileraddataallcharabybufferread() throws IOException, InterruptedException
	{
		File F = new File(filename);
		FileReader fs = new FileReader(F);
		BufferedReader BF = new BufferedReader(fs);
		String i;
		while((i=BF.readLine())!= null)
		{
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	
	
	public void textfilewritedata() throws IOException
	{
		String name="sathish kumar.r";
		File F = new File(outfilename);
		if (F.exists())
		{
			
		}else
		{
			F.createNewFile();
		}
		FileOutputStream fs = new FileOutputStream(F);
		byte[] newval=name.getBytes();
		fs.write(newval);
		fs.close();
		System.out.println("Done");
	}
	
	public void textfilewritedataFileWrite() throws IOException
	{
		String name="sathish kumar.r";
		File F = new File(outfilename);
		if (F.exists())
		{
			
		}else
		{
			F.createNewFile();
		}
		FileWriter fs = new FileWriter(F);
		fs.write(name);
		fs.close();
		System.out.println("Done");
	}
	
	public void textfilereadandwrite() throws IOException
	{
		File F = new File(filename);
		FileReader fs = new FileReader(F);
		BufferedReader BF = new BufferedReader(fs);
		File F1 = new File(outfilename);
		if (F1.exists())
		{
			
		}else
		{
			F1.createNewFile();
		}
		FileWriter fw = new FileWriter(F1);
		String i;
		while((i=BF.readLine())!= null)
		{
			fw.write(i);
			fw.write("\n");
		}	
		fw.close();
		System.out.println("Done");
	}
	
	
	public void copyfile()
	{
		File f= new File(filename);
		File fout= new File(outfilename);
		try {
			FileUtils.copyFile(f, fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Filehandling F = new Filehandling();
		F.copyfile();
	}

}
