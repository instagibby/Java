import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class TimedResponseDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		int minute = 60;
		int minsFixedSecs = 0;
		int secsFixed = 0;
		int timeDifference = 0;
		
		// Start Time
		LocalDateTime time1 = LocalDateTime.now();
		int secs1 = time1.getSecond();
		int mins1 = time1.getMinute();
		
        JOptionPane.showConfirmDialog(null, "Is Crunchy Peanut Butter better than creamy?");
		
        // Stop time
        LocalDateTime time2 = LocalDateTime.now();
		int secs2 = time2.getSecond();
		int mins2 = time2.getMinute();
		
		
		
		// If minutes are different
		if (mins1 != mins2) {
			
			// Find difference
			int minsDiff = mins2 - mins1;
			
			// If difference needs to add on an extra minute, etc.
			if (minsDiff > 1) {
				minsFixedSecs = minute * (minsDiff - 1);
			}
			// Gets seconds based on seconds before the minute mark and after
			secsFixed = (minute - secs1) + secs2;
			// Updates timeDifference to the new values
			timeDifference = secsFixed + minsFixedSecs;
		} else {
			timeDifference = secs2 - secs1;
		}

		JOptionPane.showConfirmDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + 
				"\nIt took "  + timeDifference + " seconds for you to answer.\nWas it a difficult decision?");
        
	}

}
