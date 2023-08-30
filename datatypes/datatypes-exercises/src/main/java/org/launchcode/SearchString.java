package org.launchcode;

import java.util.Scanner;

public class SearchString {
    public static void main(String [] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string to search: ");
        String searchString = input.next();
        String found = text.toLowerCase().contains(searchString.toLowerCase())? " is present": " is not present";

        System.out.println("The search string " + searchString + found);
        if (found.equals(" is present")){
            int index = text.toLowerCase().indexOf(searchString.toLowerCase());
            System.out.println("The index of the search string " + index);
            System.out.println("The length of the search string " + searchString.length());
            String newText = (index == 0) ? text.substring(0, index) : null;
            newText += text.substring(index + searchString.length());
            System.out.println("New text without the search string: \n" + newText);
        }

    }

}
