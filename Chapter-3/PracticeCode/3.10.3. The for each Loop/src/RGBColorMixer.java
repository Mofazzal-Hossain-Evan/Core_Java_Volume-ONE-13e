public class RGBColorMixer {
    
    public static void main(String[] args) {
        int[] red = {255};
        int[] green = {128};
        int[] blue = {64};
        
        for (int r : red) {
            for (int g: green) {
                for (int b : blue) {
                    System.out.printf("RGB(%d, %d, %d) -> #%02X%02X%02X%n", r, g, b, r, g, b);
                }
            }
        }
    }
    
    
    
}

/*
This line converts RGB (Red, Green, Blue) values into their hexadecimal color code representation
 and prints it in a formatted way. Here's the explanation step-by-step:

Key Concepts
printf Method:
The printf method is used to print formatted strings.
The format string specifies how the output should look, using format specifiers like %d, %X, etc.
Format Specifiers in Use
%d

This is a placeholder for a decimal integer (base 10).
In this case, it is used for the RGB values r, g, and b.
Example: If r = 255, g = 128, and b = 64, %d will print those numbers as they are.

%X

This is a placeholder for a hexadecimal integer (base 16), using uppercase letters (A-F) for values above 9.
It converts a decimal number (e.g., 255) into hexadecimal (e.g., FF).
Example: If r = 255, %X will convert it to FF.

%02X

The 02 part means:
0: Pad with leading zeroes if the value is shorter than 2 characters.
2: Ensure the output is exactly 2 characters wide.
Example: If g = 8, %02X will convert it to 08 (padded with a leading zero).

%n
This adds a platform-independent newline (like hitting "Enter").
It’s better than \n because it adapts to different operating systems.
Parameters Passed:
The parameters r, g, b appear twice:

First instance (%d): Prints the RGB values as regular decimal numbers.
Second instance (%02X): Converts the RGB values into hexadecimal format for the color code.
What It Does:
Prints the RGB values in decimal format (e.g., RGB(255, 128, 64)).
Converts the same values to a hexadecimal color code (e.g., #FF8040).
*/