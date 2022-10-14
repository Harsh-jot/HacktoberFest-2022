//package com.calculator;
import java.util.Scanner;
public class CalculatorSwitchCase {
public static void main(String[] args) {
// declaring varibales
double firstNumber, secondNumber;
double result_operation_output;
// Creating scanner for object for allow input
Scanner scannerObject = new Scanner(System.in);
do {
System.out.println("==============================================");
System.out.println("1. + for ADDITION");
System.out.println("2. - for SUBTRACTION");
System.out.println("3. * for MULTIPLICATION");
System.out.println("5. 4. / for DIVISION");
System.out.println("6. % for REMAINDER");
System.out.println("7. ^ for POWER");
System.out.println("8. Q for QUIT");
System.out.println("==============================================");
// ask the user to enter first number
System.out.print("Enter your first number:\n");
firstNumber = scannerObject.nextDouble();
// ask the user to enter second number
System.out.print("Enter your second number:\n");
secondNumber = scannerObject.nextDouble();
System.out.print("Enter an operators like (+, -, *, /, %, ^) only:\n ");
// storing the operator in char object
char operator = scannerObject.next().charAt(0);
switch (operator) {
case '+':
result_operation_output = firstNumber + secondNumber;
break;
case '-':
result_operation_output = firstNumber - secondNumber;
break;
case '*':
result_operation_output = firstNumber * secondNumber;
break;
case '/':
result_operation_output = firstNumber / secondNumber;
break;
case '%':
result_operation_output = firstNumber % secondNumber;
break;
case '^':
result_operation_output = Math.pow(firstNumber, secondNumber);
break;
case 'Q':
System.exit(0);
default:
System.out.printf("Please enter specified operator only");
return;
}
System.out.println(firstNumber + " " + operator + " " + secondNumber + " is : " + result_operation_output);
} while (result_operation_output != 'Q');
scannerObject.close();
}
}
