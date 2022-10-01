package service;

import been.*;
import config.UserConfig;
import utill.PrintingTextAndNumber;
import utill.VerifyData;

public class UserService {

    public static User receiveDataForRegistration() {

        boolean verify = true;
        String name;

        do {

            name = utill.PrintingTextAndNumber.printText("Adinizi daxil edin");

        } while (VerifyData.verifyName(name,verify) == false);

        boolean verify1 = true;
        String surname;

        do {

            surname = utill.PrintingTextAndNumber.printText("Soy adinizi daxil edin");


        }while (VerifyData.verifySurname(surname,verify1)==false);

        boolean verify2 = true;
        String email;

        do {

             email = utill.PrintingTextAndNumber.printText("e=mail daxil edin");

        }while (VerifyData.verifyEmail(email,verify2)==false);


        String password = utill.PrintingTextAndNumber.printText("Tehlukesizlik kodunu daxil edin " + " MINIMUM 8 SIMVOLDAN IBARET OLMALIDIR");


        User user = new User(name, surname, email, password);
        return user;

    }

    public static void createUser() {

        UserConfig.users = new User[1];

        UserConfig.users[0] = receiveDataForRegistration();

        User user = UserConfig.users[0];

        System.out.println("=========================================");

        System.out.println("\n" + "The operation was completed successfully");

        System.out.println(user.getAllInfo());

        System.out.println("\n" + "=========================================");


    }

    public static void enterInAccaunt() {

        User u = UserConfig.users[0];

        String name = utill.PrintingTextAndNumber.printText("Adinizi daxil edin");

        String email = utill.PrintingTextAndNumber.printText("e=mail daxil edin");

        String password = utill.PrintingTextAndNumber.printText("Tehlukesizlik kodunu daxil edin");


        if (u.getName().equals(name) && u.getEmail().equals(email) && u.getPassword().equals(password)) {
            System.out.println("\n" + "Xos gelmisiz: " + u.getName());
        }else {
            System.out.println("Sefdi");
        }
    }

    public static void topUpBalance() {
        User u = UserConfig.users[0];

        int money = PrintingTextAndNumber.printNumber("Nece AZN yukleyessiz");

        u.setMoney(money);

        System.out.println(u.getMoney() + "AZN uqurla yuklenildi");

    }





}




