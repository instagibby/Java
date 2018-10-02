import java.util.Scanner;

public class TicketCounterDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		//	Declare Variables
		final int maxTicketPurchase = 6;
		final int zeroTickets = 0;
		int ticketCount = 75;
		int ticketBuyers = 0;
		int userInputTickets = 0;
		
		//	Responses
		final String notEnoughTickets = "Sorry there aren't enough tickets for that, remaining tickets are: ";
		final String tooManyTickets = "Sorry but you can only buy 6 tickets at a time.";
		final String greaterThanZero = "You need to buy at least one ticket! ";
		final String successfulPurchase = "Thanks for your purchase! ";
		final String ticketsRemaining = " tickets are left.";
		String printMsgToUser = "";
		String finalSale = "We are all sold out now, thanks to our " + ticketBuyers + " buyers!";
		
		//	Runs while tickets can be sold
		while (ticketCount > zeroTickets) {
			
			//	Prompts for ticket purchase
			System.out.println("How many tickets would you like to buy?");
			if (in.hasNextInt()) {
				userInputTickets = in.nextInt();
				
				if (userInputTickets > maxTicketPurchase) {	//	Can't buy over six tickets
					printMsgToUser = tooManyTickets;
				} 
				else if (userInputTickets > ticketCount) {	//	Can't buy more tickets than are left
					printMsgToUser = notEnoughTickets;
				}
				else if (userInputTickets == zeroTickets) { //	Can't buy zero tickets
					printMsgToUser = greaterThanZero;
				}
				else {	
					//	Good work, you bought somewhere between 1-6 tickets and <= remaining tickets!
					ticketCount = ticketCount - userInputTickets;
					printMsgToUser = successfulPurchase + ticketCount + ticketsRemaining;
					ticketBuyers++;
					finalSale = "We are all sold out now, thanks to our " + ticketBuyers + " buyers!";
				}
				//	If a non integer is entered so we don't get an infinite loop
			} else {
				finalSale = "You broke the system, only enter numbers and try again!";
				break;
			}
			System.out.println(printMsgToUser + "\n");	//	Prints the purchase message and remaining tickets
		}
		
		//	Finishes the program and closing sentiment
		System.out.println(finalSale);
		
		in.close();
	}

}
