// import java.util.Scanner;
// import java.util.Date;
// public class ex8 {
//         public static void main(String[] args) {
//          // Obtain the total milliseconds since midnight, Jan 1, 1970
//     long totalMilliseconds = System.currentTimeMillis();
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the time zone to GMT");
// long gmt = input.nextLong();
        
// //          // Obtain the total seconds since midnight, Jan 1, 1970
// //     long totalSeconds = totalMilliseconds / 1000;
// //         // Compute the current second in the minute in the hour
// //     long currentSecond = totalSeconds % 60;
// //     // Obtain the total minutes
// //     long totalMinutes = totalSeconds / 60;
// //  // Compute the current minute in the hour
// //     long currentMinute = totalMinutes % 60;
// //  // Obtain the total hours
// //     long totalHours = totalMinutes / 60;
// //  // Compute the current hour
// //     long currentHour = totalHours % 24;
// // // Display results
// //     System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
//       // calculate the time zone offset in milliseconds
//       long offsetInMillis = gmt* 3600000;

//       // create a SimpleDateFormat object with the specified date format
//       SimpleDateFormat dateFormat = new SimpleDateFormat(" hh:mm:ss a");
//       Date adjustedDate = new Date(offsetInMillis);

//         // display the current time in the specified time zone
//         System.out.println("The current time is: " + dateFormat.format(adjustedDate));
// }}
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ex8 {
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the time zone offset to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // get the current time in milliseconds
        long currentTimeMillis = System.currentTimeMillis();

        // calculate the time zone offset in milliseconds
        int offsetInMillis = offset * 3600000;

        // create a new SimpleDateFormat object with the specified date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

        // set the time zone to the specified offset
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.setRawOffset(offsetInMillis);
        dateFormat.setTimeZone(timeZone);

        // display the current time in the specified time zone
        String currentTime = dateFormat.format(new Date(currentTimeMillis));
        System.out.println("The current time is: " + currentTime);
        input.close();
    }
}
