package com.Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SortByPrice implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return (int)(m2.getUnitPrice()-m1.getUnitPrice());
	}
	
}

class SortByItemCode implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return m1.getItemCode().compareTo(m2.getItemCode());
	}
	
}

public class MerchandiseInventoryTest {
	public static void main(String[] args) {
		ArrayList<Merchandise> merchandise=new ArrayList<Merchandise>();
		
		String filename="input.dat";
		File file=new File(filename);
		
		try {
			Scanner scanner=new Scanner(file);
			StringBuilder sb= new StringBuilder();
			while(scanner.hasNextLine()) {
				sb.append(scanner.nextLine());
			}
			//System.out.println(sb);
			
			StringTokenizer stringTokenizer= new StringTokenizer(sb.toString()," ",false);
			while(stringTokenizer.hasMoreTokens()) {
				
					String itemCode=stringTokenizer.nextToken();
					String qty=stringTokenizer.nextToken();
					String price=stringTokenizer.nextToken();
					
					int quantity=Integer.parseInt(qty);
					double unitPrice=Double.parseDouble(price);
					
					merchandise.add(new Merchandise(itemCode,quantity,unitPrice));
				
				
				
			}
			scanner.close();
			
		} catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		
		
		
		System.out.println("Sorted by Item Code:");
		
		Collections.sort(merchandise, new SortByItemCode());
		for(int i=0;i<merchandise.size();i++) {
			System.out.println(merchandise.get(i));
		}
		
		System.out.println();
		
		System.out.println("Sorted by Price:");
		
		Collections.sort(merchandise, new SortByPrice());
		
		for(int i=0;i<merchandise.size();i++) {
			System.out.println(merchandise.get(i));
		}
	}

}
