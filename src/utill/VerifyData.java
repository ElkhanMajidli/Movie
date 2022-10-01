package utill;

import java.io.IOException;

public class VerifyData {

    public static boolean verifyName(String name, boolean verify) {


        for (char number = '0'; number <= '9'; number++) {

            if (name.contains(String.valueOf(number)) || name.isEmpty() || name.contains(" ") || name.length()<2 ) {

                System.out.println("Error");
                verify = false;
                break;

            }
        }
        return verify;
    }

    public static boolean verifySurname(String surname,boolean verify){

        for (char number = '0'; number <= '9'; number++) {

            if (surname.contains(String.valueOf(number)) || surname.isEmpty() || surname.contains(" ") || surname.length()<4) {

                System.out.println("Error");
                verify = false;
                break;

            }

        }
        return verify;
    }

    public static boolean verifyEmail(String email,boolean verify){

         verify=true;

         email.toLowerCase();

         String lastOnly = email.substring(email.length() - 10);


        boolean trueOrFalse = lastOnly.equals("@gmail.com");

        if (trueOrFalse == false) {
            verify =false;
            System.out.println("Error");
            System.exit(0);
        }


        char[] arr = new char[email.length() - 10];

        for (char lattersSmall = 0; lattersSmall < email.length() - 10; lattersSmall++) {

            arr[lattersSmall] = email.charAt(lattersSmall);

        }
        int d = 0;
        String sd=email.substring(0,email.length()-9);

        if (sd.equals("@gmail.com") || sd.equals("gmail.com") ){
            verify =false;
        }

        for (int a = 0; a < email.length() - 10; a++) {

            for (char b = '0'; b < '9'; b++) {
                if (arr[a] == b) {
                    d++;
                }
            }

        }

        if ((email.length() - 10) == d || d > 5) {
            System.out.println("Ancaq reqem var ve ya reqem sayi 5 den coxdur");
            verify =false;
        } else if ((email.length() - 10) - d < 4) {
            System.out.println("Herf sayi azdir");
            verify=false;
        } else {
            System.out.println("Duzdu");

        }

        return verify;
    }


         }




