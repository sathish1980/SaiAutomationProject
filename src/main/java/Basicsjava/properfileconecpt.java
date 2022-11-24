package Basicsjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properfileconecpt {

	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Selenium6PMBatch\\input\\environment.properties";
	public void propoertyfileread() throws IOException
	{
		File f = new File(filepath);
		FileInputStream Fs = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(Fs);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("education"));
		p.setProperty("address", "chennai");
		String actualaddress=p.getProperty("address");
		System.out.println(p.getProperty("address"));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		properfileconecpt p = new properfileconecpt();
		p.propoertyfileread();
	}

}
