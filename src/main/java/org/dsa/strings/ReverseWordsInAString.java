package org.dsa.strings;

public class ReverseWordsInAString {
     static  String getReversedString(String s){
         char[] input = s.toCharArray(); // Input character array
         char[] result = new char[input.length]; // Result character array
         int resultIndex = 0; // Index to track position in result array
         int inputIndex = input.length - 1; // Start from the end of the input array

         while (inputIndex >= 0) {
             // Skip trailing spaces
             while (inputIndex >= 0 && input[inputIndex] == ' ') {
                 inputIndex--;
             }
             if (inputIndex < 0) break; // Exit if all spaces are processed

             // Find the end of the current word
             int wordEnd = inputIndex;

             // Find the start of the current word
             while (inputIndex >= 0 && input[inputIndex] != ' ') {
                 inputIndex--;
             }
             int wordStart = inputIndex + 1;

             // Add a space before the next word in the result if it's not the first word
             if (resultIndex > 0) {
                 result[resultIndex++] = ' ';
             }

             // Copy the current word to the result array
             for (int i = wordStart; i <= wordEnd; i++) {
                 result[resultIndex++] = input[i];
             }
         }

         // Convert the result array to a string with the valid length
         return new String(result, 0, resultIndex);
     }
}
