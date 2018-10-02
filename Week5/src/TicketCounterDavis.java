import java.util.Scanner;

public class TicketCounterDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		int ticketCount = 75;
		int ticketBuyers = 0;
		int maxTicketPurchase = 6;
		int minTicketPurchase = 1;
		int userInputTickets = 0;
		String notEnoughTickets = "Sorry there aren't enough tickets for that, remaining tickets are: ";
		String tooManyTickets = "Sorry but you can only buy 6 tickets at a time.";
		String greaterThanZero = "You need to buy at least one ticket! ";
		String printMsgToUser = "";
		String successfulPurchase = "Thanks for your purchase! ";
		String ticketsRemaining = " tickets are left.";
		String finalSale = "We are all sold out now, thanks to our " + ticketBuyers + " buyers!";
		
		
	
		// Prompts for inputs
		while (ticketCount > 0) {
			
			System.out.println("How many tickets would you like to buy?");
			
			if (in.hasNextInt()) {
				userInputTickets = in.nextInt();
				
				if (userInputTickets > maxTicketPurchase) {
					printMsgToUser = tooManyTickets;
				} 
				else if (userInputTickets > ticketCount) {
					printMsgToUser = notEnoughTickets;
				}
				else if (userInputTickets == 0) {
					printMsgToUser = greaterThanZero;
				}
				else {
					ticketCount = ticketCount - userInputTickets;
					printMsgToUser = successfulPurchase + ticketCount + ticketsRemaining;
					ticketBuyers++;
					finalSale = "We are all sold out now, thanks to our " + ticketBuyers + " buyers!";
				}
			} else {
				finalSale = "You broke the system, only enter numbers!";
				break;
			}
			System.out.println(printMsgToUser + "\n");
		}
	
		System.out.println(finalSale);

		
		in.close();
	}

}
