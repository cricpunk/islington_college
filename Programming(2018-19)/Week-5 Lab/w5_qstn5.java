import java.util.Scanner;

// Q5. Write a program to find the sum of even digits of a given input number.
// ex: n=23468, 2+4+6+8=20

class SumDigit {

        public static void main(String[] args) {

                // Creating object of scanner class
                // This object will used to tak einput from user
                Scanner scanner = new Scanner(System.in);

                // Displaying some information for user
                System.out.print("Please enter digits => ");

                // Taking value from user and assigning same value to variable name digits
                int digits = scanner.nextInt();

                // Clossing scanner once its work is done
                scanner.close();

                // Creating temporary variable temp and assigning user provided value to it
                int temp = digits;

                // Creating variable sum with initial value 0
                // This variable will hold total sum of the digits provided by user
                int sum = 0;

                // Applying condition for while loop
                // This loop will continue untill value of temp is not equal to zero
                while (temp != 0) {

                        // Calculating reminder
                        // If user provide 2345 then reminder will be 5 for first time
                        int reminder = temp % 10;

                        // Increase value of sum by adding reminder
                        sum = sum + reminder;

                        // If user provide 2345 then we have already considered last element i.e, 5
                        // Now we need to increase sum by second last number i.e, 4
                        // We will use division to get such result
                        // Following line will make value of temp variable from 2345 to 234
                        // Now in next loop reminder will be 4 and same process will continue until
                        // temp value is not equal to 0
                        // Once value of temp variable is equal to 0 while loop will terminate
                        temp = temp / 10;
                }

                // Print digits that user provided and its sum
                System.out.println("Sum of " + digits + " => " + sum);
        }

}