package Basicsjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Listconcpets {
	
	public void listconcept()
	{
		//ArrayList<Object> ar= new ArrayList<Object>();
		LinkedList<Object> ar= new LinkedList<Object>();
		//ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar.add("sathish");
		ar.add("kumar");
		ar.add("sathish");
		ar.add("R");
		ar.add("B.Tech");
		ar.remove(3);
		ar.add(1);
		ar.set(3, "IT");
		System.out.println(ar);
		for(Object value:ar)
		{
			System.out.println(value);
		}
		
		Iterator it =ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public void setconcept()
	{
		//ArrayList<Object> ar= new ArrayList<Object>();
		//HashSet<Object> ar= new HashSet<Object>();
		//LinkedHashSet<Object> ar= new LinkedHashSet<Object>();
		TreeSet<Object> ar= new TreeSet<Object>();
		//ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar.add("sathish");
		ar.add("kumar");
		ar.add("sathish");
		ar.add("R");
		ar.add("B.Tech");
		ar.remove("R");
		//ar.add(1);
		//ar.set(3, "IT");
		System.out.println(ar);
		for(Object value:ar)
		{
			System.out.println(value);
		}
		
		Iterator it =ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//ar.clear();
		//System.out.println(ar);
		System.out.println(ar.first());
	}
	
	public void mapconcept()
	{
		//ArrayList<Object> ar= new ArrayList<Object>();
		//HashMap<Integer,Object> ar= new HashMap<Integer,Object>();
		//LinkedHashMap<Integer,Object> ar= new LinkedHashMap<Integer,Object>();
		TreeMap<Integer,Object> ar= new TreeMap<Integer,Object>();
		//LinkedHashSet<Object> ar= new LinkedHashSet<Object>();
		//TreeSet<Object> ar= new TreeSet<Object>();
		//ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar.put(1,"sathish");
		ar.put(1,"besant");
		ar.put(3,"R");
		ar.put(4,"B.Tech");
		ar.put(5,"B.Tech");
		ar.put(2,"kumar");
		ar.remove(4);
		//ar.add(1);
		//ar.set(3, "IT");
		ar.replace(5, "B.Tech", "Information technology");
		System.out.println(ar);
		System.out.println(ar.get(3));
		System.out.println(ar.keySet());
		System.out.println(ar.values());
		System.out.println(ar.entrySet());
		
		for (int i:ar.keySet())
		{
			System.out.println(ar.get(i));
		}
		for(Map.Entry m:ar.entrySet() )
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		ar.clear();
		//System.out.println(ar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listconcpets l = new Listconcpets();
		l.mapconcept();
	}

}

