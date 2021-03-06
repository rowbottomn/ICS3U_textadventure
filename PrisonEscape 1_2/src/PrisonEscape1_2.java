import java.util.Scanner;

/**
 * Program is a classic text based adventure game.
 * Version 1_0 : Use of booleans and a switch statement
 * Version 2_0 : Input handling
 * Version 3_0 : optimization
 * 
 */

/**
 * @author rowbottomn
 *
 */
public class PrisonEscape1_2 {



	/**
	 * 
	 */
	
	//while not in end state
		//switch location
			//if else if s with booleans to give description
		
		//use scanner to get input from user
		//switch on location
			//if else ifs on input from user ie: input.contains("clip")
				//change booleans
	
	

	
	public static void main(String[] args) {
		// Declare variables
		Scanner s = new Scanner(System.in);//the scanner to get input
		//booleans
		boolean paperClipBent = false, doorUnlocked = false, paperClip = false, cellUnlocked = false, guardKnockedOut = false, guardClothesOn = false, idBadge = false;
		
		int location = 0; //0 cell, 1 hall, 2 stairs, 3 lose, 4 win
		
		String input;//hold the user input
			
		//while (location < 3) which means you are not game over
		while (location < 3){
			//switch (location)
			switch (location){
				//print location text
				case 0: 
					System.out.println("In cell");
					if (cellUnlocked == false){
						System.out.println("the door is locked");
					}
					else{
						System.out.println("the door is unlocked");
					}
					if (paperClip == false){
						if (paperClipBent == false){
							System.out.println("u see a paper clip");
						}
						else {
							System.out.println("u see a bent paper clip");
						}
					}

					else if (cellUnlocked == false && paperClipBent ==false){
						System.out.println("u might be able to use the mirror to open the lock outside the cell if you had the right tool");
					}
					else {
						System.out.println("Why are you still hanging around here? Escape already!");
					}
					break;
				case 1:	
					System.out.println("In hall");
					
					break;
				case 2:	
					System.out.println("In stairway");
					break;
			}
			//if elseif (booleans)

				//list commands
			//get input
			input = s.nextLine();
			
			switch (location){
			//print location text
			case 0: 
				//possible actions in cell: Xget clip, Xbent clip, Xdrop clip, unlock door, look mirror, look guard, hit guard, go hall, go stairs
				if (input.contains("clip")){//get, drop, bend
					if (input.contains("get")){
						if (paperClip==false){
							System.out.println("u got a paper clip");
							paperClip = true;
						}
						else {
							System.out.println("u already got a paper clip");	
						}
					}
					else if (input.contains("bend")){
						if (paperClipBent==false){
							System.out.println("u bent the paper clip into a perfect shape for picking a lock");
							paperClip = true;
						}
						else {
							System.out.println("u already bent the paper clip, try looking for a way to see the look on the door!");
						}
					}
					else if (input.contains("drop")){
						if (paperClip==true){
							System.out.println("u drop the paper clip");
							paperClip = false;
						}
						else {
							System.out.println("u already dropped the paper clip");	
						}
						
					}
				}
				else if (input.contains("unlock")){
					//need the paperclip and paperclipbent to unlock the cell
						if ((paperClipBent ==false ||paperClip == false)&&(cellUnlocked == false)){
							System.out.println("if only you had something to pick the lock with, you could use this to look at the lock");
						}
						else if ((paperClipBent == true)&&(cellUnlocked == false)){
							System.out.println("u use the mirror and the bent paper clip to pick the cell lock");
							cellUnlocked = true;
						}
				
						else if ((cellUnlocked)){
							System.out.println("The cell is already unlocked!");
							cellUnlocked = true;
						}
				}

				
				break;
			case 1:	
				System.out.println("In hall");
				
				break;
			case 2:	
				System.out.println("In stairway");
				break;
		}//while not gameover
			//if elseif (booleans)
				//change locations and booleans
			//else 
				//print "I can do that!"
			}
		//if location == 3
			//print "you got nabbed!"
		//else if location == 4
			//print "you won!"
		//else
			//"What went wrong?"
				
			
		
		
		
	}

}
