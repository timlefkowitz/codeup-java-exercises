package movies;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int userInput;
    Movie[] movies = MoviesArray.findAll();


    boolean looper = true;
    while(looper){
        System.out.println("Time to see a list of movies!");
        System.out.println("Please input one of the following: ");
        System.out.println("0 to not display anything.");
        System.out.println("1 to view all movies");
        System.out.println("2 to view movies in the drama category");
        System.out.println("3 to view movies in the musical category");
        System.out.println("4 to view movies in the sci-fi category");
        System.out.println("5 to view movies in the animated category");
        userInput = sc.nextInt();
        if (userInput == 0){
            looper = false;
        } else if (userInput == 1){
            for (Movie movie : movies){
                System.out.println(movie.getName() + ": " + movie.getCategory());
            }
        } else if (userInput == 2){
            for (Movie movie : movies) {
                if (movie.getCategory().equals("drama")){
                    System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            }
        } else if (userInput == 3) {
            for (Movie movie : movies) {
                if (movie.getCategory().equals("musical")) {
                    System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            }
        } else if (userInput == 4) {
            for (Movie movie : movies) {
                if (movie.getCategory().equals("sci-fi")) {
                    System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            }
        } else if (userInput == 5) {
            for (Movie movie : movies) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            }
        } else {
            System.out.println("Try again.");
        }

        System.out.println("Would you like to see a different movie list? Answer with a yes or no please.");
        boolean looper2 = true;
        while(looper2){
            String yesOrNo = sc.next();
            if(yesOrNo.equalsIgnoreCase("yes")){
                System.out.println("MORE MOVIES");
                looper2 = false;
            } else if (yesOrNo.equalsIgnoreCase("no")){
                System.out.println("NO MORE MOVIES");
                looper2 = false;
                looper = false;
            } else {
                System.out.println("Try again.");
                looper2 = true;
            }
        }

    }




    }
}
