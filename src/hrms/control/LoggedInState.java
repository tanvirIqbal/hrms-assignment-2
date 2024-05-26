package hrms.control;

import java.util.Scanner;

public class LoggedInState implements HRMSState {
    @Override
    public void showMenu(HRMSMain context) {
        Scanner scanner = new Scanner(System.in);
        while (context.getUser().getLoggedIn()) {
            System.out.println("\nMain Menu");
            System.out.println("1. Employee Details");
            System.out.println("2. Attendance");
            System.out.println("3. Leave");
            System.out.println("4. Performance");
            System.out.println("5. Logout");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    context.showEmployeeDetailsMenu();
                    break;
                case 2:
                    context.showAttendanceMenu();
                    break;
                case 3:
                    context.showLeaveMenu();
                    break;
                case 4:
                    context.showPerformanceMenu();
                    break;
                case 5:
                    context.logout();
                    context.setState(new LoggedOutState());
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}
