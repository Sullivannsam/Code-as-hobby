package formInformation;

import Model.User;

import java.util.Scanner;

public class Form {
    static int attempt = 0;

    public void getFormLogin() {

        User userLog = new User();

        do {
            try (Scanner scan = new Scanner(System.in)) {

                System.out.println("Please fill in this form information!");

                System.out.println("What is Your name: ");
                String userName = scan.nextLine();
                userLog.setName(userName);

                System.out.println("Please Enter Your Password: ");
                String userPassword = scan.nextLine();
                userLog.setPassword(userPassword);

                System.out.println("Please Enter Your Email: ");
                String userEmail = scan.nextLine();
                userLog.setEmail(userEmail);

                if (!userName.isEmpty() && !userPassword.isEmpty() && !userEmail.isEmpty()) {
                    System.out.println("Logged in Success! ");
                }
                else {
                    attempt++;
                    System.out.println("Please try again! ");
                }
            } catch (Exception e) {
                System.out.println("Something is wrong " + e.getMessage());
            }

        }while( attempt >=  3);
            System.exit(0);
    }
}


