package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileIO_lec {

    public static void printPoem(Path filePath) throws IOException { //Write out a try/catch block for the IOException .. would be the more robust path vs. throwing it here. Throwing it here, we're kickin' the can down the road!

        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {

        Path filePathtoPoem = Paths.get("./src/fileIO/wcw.txt"); //relative path CWD [root] > up through the file chain

        Path sameDirectoryPath = Paths.get("../wcw.txt");

        //Let's print out these filePaths!
        System.out.println("filePathtoPoem = " + filePathtoPoem); //value of Path object? = what we had set / passed as a parameter!

        System.out.println("Files.exists(filePathtoPoem) = " + Files.exists(filePathtoPoem));

        System.out.println("Files.exists(sameDirectoryPath) = " + Files.exists(sameDirectoryPath));

//        printPoem(filePathtoPoem);

        //Alright! So, we've built a Path - we used the Path with Files.exist - now though, how do we get into the creation of new files/directories?
        String directory = "./src/fileIO/data"; //~~ relative path to where we want our directory to go
        String filename = "groceryList.txt"; //~~filename for our desired file

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

//        System.out.println("dataFile = " + dataFile);

        if(Files.notExists(dataDirectory)){//IF T: got down path and directory not there!

            Files.createDirectories(dataDirectory); //go ahead and create a directory on this path :)

        }

        if(Files.notExists(dataFile)){//IF T: got down path and file not found in directory~

            Files.createFile(dataFile);
        }

        //Okay, so: There's the file / directory created! Well how do I take this next step and WRITE into the file? How do I get into the file and READ from the file?
        //first idea: write to the file and add a List<String> of groceries!
        Path groceriesTxtPath = Paths.get(directory, filename);

        System.out.println("groceriesTxtPath = " + groceriesTxtPath); //path to the groceriesList.txt

        List<String> groceries = Arrays.asList("coffee", "milk", "sugar"); //Making the list!
        System.out.println("groceries = " + groceries); //Voila! There it is! The list to write!

        Files.write(groceriesTxtPath, groceries); //Oh, did we write successfully? Go check groceriesList.txt!

        //second idea: Let's print our list of groceries as it stands!
        System.out.println();

        List<String> groceryList = Files.readAllLines(groceriesTxtPath);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        //third idea: append ONE ITEM to the end of the file [don't overwrite! that's the default! we need to use StandardOpenOption.APPEND is what we need here!]

        Files.write(groceriesTxtPath, Arrays.asList("eggs", "more eggs", "another dozen of eggs"), StandardOpenOption.APPEND);

        groceryList = Files.readAllLines(groceriesTxtPath);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        //fourth idea: Let's grab what's in the file (Files.readAllLines), iterate through after making it into a list, and then replace MILK with CREAM!

        List<String> lines = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }
        Files.write(groceriesTxtPath, newList);




    }
}