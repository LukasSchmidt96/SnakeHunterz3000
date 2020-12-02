

package Game;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
/*		int x = 6;
		System.out.println("\n	Vier Gewinnt");
		System.out.println("\n| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
		System.out.println("-----------------------------");
		for( int i = 1; i <= x; i++) {			
			System.out.println("|   |   |   |   |   |   |   |");
			System.out.println("-----------------------------");
			
		}
*/		
		
	
		System.out.println("\n        Vier Gewinnt\n");
		

		 
		
		
		String feld [][]= {   	 // [1][]  [2][]    [3][]   [4][]   [5][]   [6][]  [7][] 
							{ "|" ," 1 |", " 2 |", " 3 |", " 4 |", " 5 |", " 6 |", " 7 |"},  
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[][1]	
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[][2]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[][3]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[][4]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[][5]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"}   //[][6]
				
        };		
		for(int i = 0; i < feld.length; i++) {
			for(int j = 0; j < feld[i].length; j++) {
			System.out.print(feld[i][j]);
		}System.out.println();
		}
			
		
		//Gameloop
		Scanner in = new Scanner(System.in);
		
		//Counter f�r 42 Felder 
		int count = 0;
		while(count <= 42) {

		
			// Spieler 1 ist an der Reihe !
			if (count % 2 == 0) {
				
				System.out.println("\nSpieler 1 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
				int a = in.nextInt();				
				for(int i = 0; i < feld.length; i++) {
					for(int j = 0; j < feld[i].length; j++) {						
						//es wird geschaut, in welche Spalte a passt.
						if (i == a || i+1 == a) {
	
							feld[6][a] = " x |";
							
							
						}
													
							
						System.out.print(feld[i][j]);	
							
																
					}System.out.println();
				}				
				count += 1;
			}
			
			
			
			
			// Spieler 2 ist an der Reihe !	
			else { 
				System.out.println("\nSpieler 2 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
				int b = in.nextInt();
				
				
				for(int i = 0; i < feld.length; i++) {
					for(int j = 0; j < feld[i].length; j++) {
						
						//es wird geschaut, in welche Spalte b passt.
						if (i == b || i+1 == b) {
							
							feld[6][b] = " o |";
						}
					
						System.out.print(feld[i][j]);
					}	System.out.println();
				}count += 1;
			}
		}
			
	}		
		
}		
			
			
						
		
		
		
		
		//test commit

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public class 
	
		
		String [][] Koordinaten = new String[6];
	

		
		for(int i = 0; i < Koordinaten.length; i++) {
			for(int j = 0; j < Koordinaten[i].length; j++) {
				
			}
		
		}*/

	

	


