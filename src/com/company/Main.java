package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char [] alphabetArray =
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int [] numberArray =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};


        Scanner kb = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String Fname = kb.next();

        System.out.println("Please input your last name: ");
        String Lname = kb.next();

        System.out.println("You initials are " + Fname.charAt(0) + Lname.charAt(0));

      //  for (int j=0; j < inputString.length(); j++){
      //      for (int i=0; i < alphabetArray.length; i++){
      //          if (inputString.charAt(i) == alphabetArray[i]){
      //              System.out.print(numberArray[i] + " ");
      //          }
            }
        }





