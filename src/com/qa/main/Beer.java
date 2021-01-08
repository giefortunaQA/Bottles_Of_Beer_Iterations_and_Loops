package com.qa.main;

public class Beer {
	
	public static void main(String[] args) {
		
//		Numbers num=new Numbers();
//		int i=99;
//		String beer1=" bottles of beer on the wall, ";
//		String beer2=" bottles of beer on the wall.";
//		String beer3=" bottles of beer.";
//		String beer4="Take one down and pass it around, ";
//		
//		if (i>2) {
//			for (i=99; i>2;i--) {
//				String line1=(String)(i + beer1 + i + beer3);
//				String line3=(String)(i-1 + beer2);
//				System.out.println(line1);
//				System.out.println(beer4 +line3);
//			}}
//		if (i==2){
//			String line1=(String)(i + beer1 + i + beer3);
//			String line3="one more bottle of beer on the wall.";
//			System.out.println(line1);
//			System.out.println(beer4 +line3);
//			i--;
//		}
//		if (i==1) {
//			String line1="One bottle of beer on the wall, one bottle of beer";
//			String line2="no more bottles of beer on the wall.";
//			System.out.println(line1);
//			System.out.println( beer4 + line2 );
//			i--;
//					
//		}
//		if (i==0) {
//
//			System.out.println("No more" + beer1 + " no more " + beer3);
//			System.out.println("Go to the store and buy some more, 99 " +beer2);
//		}
	
	
	//use the numTo String fn i made to spell out the numbers
		Numbers num=new Numbers();
		int i=99;

		String beer1=" bottles of beer on the wall, ";
		String beer2=" bottles of beer on the wall.";
		String beer3=" bottles of beer.";
		String beer4="Take one down and pass it around, ";
		
		if (i>2) {
			for (i=99; i>2;i--) {
				String j=num.numToString2(i);
				String k=num.numToString2(i-1);
				String line1=(String)(j + beer1 + j + beer3);
				String line3=(String)(k + beer2);
				System.out.println(line1);
				System.out.println(beer4 +line3);
			}}
		if (i==2){
			String j=num.numToString2(i);
			String line1=(String)(j + beer1 + j + beer3);
			String line3="one more bottle of beer on the wall.";
			System.out.println(line1);
			System.out.println(beer4 +line3);
			i--;
		}
		if (i==1) {
			String line1="One bottle of beer on the wall, one bottle of beer.";
			String line2="no more bottles of beer on the wall.";
			System.out.println(line1);
			System.out.println( beer4 + line2 );
			i--;
					
		}
		if (i==0) {

			System.out.println("No more" + beer1 + " no more " + beer3);
			System.out.println("Go to the store and buy some more, 99 " +beer2);
		}
	

	}			
}

