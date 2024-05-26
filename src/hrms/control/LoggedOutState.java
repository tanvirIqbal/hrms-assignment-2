package hrms.control;

import java.util.Scanner;

public class LoggedOutState implements HRMSState {
    @Override
    public void showMenu(HRMSMain context) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        
        context.login(context.getUserList(), username, password);
    }
}
