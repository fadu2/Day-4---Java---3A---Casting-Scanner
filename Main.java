import java.util.Scanner;
class Main {
  public static void main(String[] args) {
// int mins = 125;

// // Convert mins into hours (h) and minutes (m) by completing the blanks in terms of mins.

// int h = mins / 60;  // complete the blank
// int m = mins % 60; // complete the blank
// // System.out.println(mins + " minutes is " + h + " hour(s) " + m + " minute(s).");

// // Casting and Scanner

// // Casting - used to convert from one data type to another.

// // (int) is used to convert to integer

// // double pi = 3.14;
// // int p = (int)pi;
// // System.out.println(p);  // 3

// // double a = 7.9999;
// // System.out.println((int)a); // 7

// // double price = 29.99;
// // // convert price to an integer 
// // System.out.println((int)price);  // 29

// // // (double) is used to convert values to doubles 
// // int height = 5;
// // System.out.println(height);  // 5
// // System.out.println((double)height);  // 5.0

// // int weight = 200;
// // System.out.println(weight); // 200
// // System.out.println((double)weight); // 200.0

// int u = 15;
// int v = 4;
// System.out.println(u/v);  
// System.out.println((double)u/v);  // 3.75
// System.out.println(1.0 * u/v);  // not casting  
// System.out.println((double)(u/v)); // 3.0
// System.out.println(u/(double)v);  // 3.75

// int pizzaPrice = 17;
// int people = 5;

// // Calculate how much each person contributes if the price of pizza is $17, and number of people is 5.

// double contribution = (double)pizzaPrice / people;
// System.out.println(contribution);

// System.out.println(Integer.MAX_VALUE);
// System.out.println(Integer.MIN_VALUE);

// Scanner class
// Scanner is used for dynamic input
// Scanner class needs to be imported 
Scanner kb = new Scanner(System.in);

// // nextLine() for string input
// System.out.println("Enter your name: ");
// String name = kb.nextLine();
// System.out.println("Your name is " + name);

// // nextInt() for integer input
// System.out.println("Enter your age: ");
// int age = kb.nextInt();
// System.out.println("Your age is " + age);

// // nextDouble() for double input 
// System.out.println("Enter price of pizza: ");
// double price = kb.nextDouble();
// System.out.println("Pizza costs " + price);

// nextBoolean() for boolean input 

System.out.print("Enter first number: ");
int num1 = kb.nextInt();
System.out.print("Enter second number: ");
int num2 = kb.nextInt();
System.out.println("********** Results *********");
System.out.println("The Sum is " + (num1 + num2));
System.out.println("The difference is " + (num1 - num2));
System.out.println("The product is " + (num1 * num2));
System.out.println("The quotient is " + ((double)num1 / num2));
System.out.println("*****************************");


  }
}