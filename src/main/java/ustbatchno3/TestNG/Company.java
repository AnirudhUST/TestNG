package ustbatchno3.TestNG;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Company {
	
	public static List<Integer> companydetails(int num,String city) {
		List<Integer>l1=Arrays.asList(1600,800);
		List<Integer>l2=Arrays.asList(1800,1000);
		List<Integer>l3=Arrays.asList(2500,1200);
		List<Integer>l4=Arrays.asList(1800,1200);
		List<Integer>l5=Arrays.asList(2000,900);
		String d1="tvm";
		String d2="Chennai";
		String d3="cochi";
		String d4="Hyderabad";
		String d5="Mumbie";
		Map<String,List> map= new HashMap<String,List>();
		map.put(d1, l1);
		map.put(d2, l2);
		map.put(d3, l3);
		map.put(d4, l4);
		map.put(d5, l5);
		if(map.containsKey(city)) {
			List <Integer>lm=map.get(city);
//			System.out.println(lm);
			List<Integer> lm1=lm.stream().map(T->T*num).distinct().collect(Collectors.toList());
			return (lm1);
			
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cs=new Customer("101", "AGK","cochi", 2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("details:");
		System.out.println(cs.getC_id()+" "+cs.getName()+" "+cs.getCity());
		List lk=companydetails(cs.getFeet(),cs.getCity());
		System.out.println("price and Price without material"+lk);
		
		
	    
		
	}

}
