import service.MovieService;
import service.UserService;
import utill.PrintingTextAndNumber;
import utill.WelcomeWindow;

public class Main {
    public static void main(String[] args) {

        boolean a=true;

        int times=0;

        while (a==true) {

            times++;

            if (times == 2) {
                System.out.println("Daxil olmaq ucun esas sehifeye gonderilirsiz"+"\n");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int chooseVarriant = WelcomeWindow.WelcomWindow();

            if (chooseVarriant == 2) {

                UserService.createUser();

            }

            if (times == 2) {
                a = false;
            }


            if (chooseVarriant == 1) {

                UserService.enterInAccaunt();

                while (a == false) {

                    int pr = PrintingTextAndNumber.printNumber("1.Balansi artirmaq " + "\n" +
                            "2.Kinolari gorsetmek"+"\n"+"3.Sistemnen cixmaq");

                    if (pr == 1) {
                        UserService.topUpBalance();

                    } else if (pr == 2) {

                        MovieService.lookMovieAndBuy();

                    }

                    else if (pr==3){

                        System.exit(0);

                    }






                    }



            }

        }



        }

        }








