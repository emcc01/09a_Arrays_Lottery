/**
 *  Literatur-Beispiel | 6 aus 49 wie nutzt man debugger
 * 
 */

package com.cc.java;
import java.util.Random;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		// Deklarationen
		Random rand = new Random();
		int min  = 1, max = 49, slots = 6;
		int[] lotteryArray = new int[slots];
		int randomNumber;
		boolean isRepeated;
				
		
		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) // 6x   //roten Punkt vor Zeilennr anklicken = Breakpoint setzen, launch und debug dort wird angezeigt welche Variablen bisher, was in array usw, schaltfläche oben erscheint
		{ // mit oben oder F10 step over, gehen einzelne Schritte weiter
			do {
					isRepeated = false;
					// 1 to 49
					randomNumber = rand.nextInt((max - min) + 1) + min;  //mit F11 jeden Schritt einzeln anzeigen lassen wenn gewollt
					// check for repeated number against
					// the filled non-zero elements			
					for (int k = 0; k <= indexDrawn; k++) 
					{
						//check against each filled non-zero elements
						//hope that none repeats the random number							
						if (lotteryArray[k] == randomNumber) 
						{
							isRepeated = true;
							break;
						}
					}
				
				}while (isRepeated);
			
			lotteryArray[indexDrawn] = randomNumber;  // Zahl ins Array
					
		}
		
		Arrays.sort(lotteryArray);
		
		System.out.println("The result of the lottery:");
		
		for (int i = 0; i<slots; i++) 
		{
			System.out.print(lotteryArray[i] + " ");
		}

		
		
	}

}
