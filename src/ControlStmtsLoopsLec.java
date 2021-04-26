import java.util.Scanner;

public class ControlStmtsLoopsLec {
    public static void main(String[] args) {

        System.out.println("(5 == 5) = " + (5==5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
        System.out.println("('y' == 'y') = " + ('y' == 'y'));

//        boolean isAdmin = true;
//
//        System.out.println("(isAdmin == false) = " + (isAdmin == true));
//
//
//        boolean isLoggedIn = true;
//        boolean isOwner = false;

//        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal?" + (isAdmin && isLoggedIn));
//
//        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". Is this the admin or the user who made this post? Do I show the 'edit' button for this post? " + (isAdmin || isOwner));
//
//
//        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ". Am I not logged in and need to be taken t the log in/registration page? "+ (!isLoggedIn));
//
//        System.out.println("isLoggedIn = " + isLoggedIn);

//        int y = 2;
//        int x = 3;
//
//        if(false & (++x == y)){
//            System.out.println("x = " + x);
//            System.out.println("Equal!");
//        } else {
//            System.out.println("x = " + x);
//            System.out.println("Unequal.");
//        }

        String str1 = "Kenneth";
        String str2 = "Kenneth";
        String str3 = str1;
        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str3 == str1) = " + (str3 == str1));

        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //use this method


        String cohortLC = "marco";
        String cohortUC = "Marco";

        System.out.println("cohortLC.equalsIgnoreCase(cohortUC) = " + cohortLC.equalsIgnoreCase(cohortUC)); //excellent - using the method!




//        boolean isAdmin = true;
//        boolean isLoggedIn = false;
//        boolean isOwner = false;
//
//        if(isAdmin && isLoggedIn){
//            System.out.println("Show  the 'my account' button with this users");
//        }
//
//        if(isAdmin || isLoggedIn){
//            System.out.println("Show the edit button for this post");
//        }

        //switch/case statement!
        int Diceroll = (int)(Math.random() * 6 - 1 + 1) + 1;
        System.out.printf("DiceRoll = " + Diceroll + " ");

        switch(Diceroll){
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a Three!");
                break;
            case 4:
                System.out.println("Rolled a Four!");
                break;
            case 5:
                System.out.println("Rolled a Five!");
                break;
            case 6:
                System.out.println("Rolled a Six!");
                break;

        }

        //While
//
//        int i = 0;
//        while(i <= 10){
//            System.out.println("i is "+ i);
//            i++;
//        }



//        while (newsLetterSignup){
//        System.out.println("Are you ready to sign up for are news letter? Only yes or no will work.");
//        String userInput = scanner.nextLine();
//
//        if(userInput.equalsIgnoreCase("yes")){
//            System.out.println("We are happy you want to sign up for the news letter!");
//        } else {
//            System.out.println("Boo we are not happy that you don't want to sign up!");
//        }
//
//        }

//
//        boolean newsletterSignup = true;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Are you ready to sign up for are news letter? Only yes or no will work.");
//            String userInput = scanner.nextLine();
//
//            if(userInput.equalsIgnoreCase("yes")){
//                System.out.println("We are happy you want to sign up for the news letter!");
//                newsletterSignup = false;
//            } else {
//                System.out.println("Boo we are not happy that you don't want to sign up!");
//                newsletterSignup = true;
//            }
//
//        } while (newsletterSignup);





        //For Loop!

//        for(int i = 0; i < 10; i += 1){
//            System.out.println("i is currently: "+ i);
//        }
//
//        String [] fruits = {"apples", "bananas", "jackfruit"};
//
//        for(int i = 0; i < fruits.length; i++){
//            System.out.println("Here's a fruit: " + fruits[i]);
//        }


        for(int i = 7)



        //.soutv shortcut for printing



    }
}
