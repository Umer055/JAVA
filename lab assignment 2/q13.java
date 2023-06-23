import java.util.Scanner;

public class q13 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the year (e.g., 2022): ");
    int year = input.nextInt();

    System.out.print(
      "Enter the first day of the year (0 for Sunday, 1 for Monday, etc.): "
    );
    int firstDay = input.nextInt();

    for (int month = 1; month <= 12; month++) {
      int daysInMonth;
      if (month == 2) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          daysInMonth = 29;
        } else {
          daysInMonth = 28;
        }}
      else if (month == 4 || month == 6 || month == 9 || month == 11) {
        daysInMonth = 30;
      } 
      else {
        daysInMonth = 31;
      }

      String getMonthName;
      switch (month) {
        case 1:
          getMonthName = "January";
        case 2:
          getMonthName = "February";
        case 3:
          getMonthName = "March";
        case 4:
          getMonthName = "April";
        case 5:
          getMonthName = "May";
        case 6:
          getMonthName = "June";
        case 7:
          getMonthName = "July";
        case 8:
          getMonthName = "August";
        case 9:
          getMonthName = "September";
        case 10:
          getMonthName = "October";
        case 11:
          getMonthName = "November";
        case 12:
          getMonthName = "December";
        default:
          getMonthName = "";
      }
      System.out.println(getMonthName);
      System.out.printf("%n%20s%n", getMonthName);
      System.out.println("-----------------------------");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

      int startDay = (firstDay + (daysInMonth % 7)) % 7;

      for (int i = 0; i < startDay; i++) {
        System.out.print("    ");
      }
      for (int day = 1; day <= daysInMonth; day++) {
        System.out.printf(" %2d ", day);
        if ((day + startDay) % 7 == 0) {
          System.out.println();
        }
      }

      firstDay = (firstDay + daysInMonth) % 7;
    }
    input.close();
  }
}
