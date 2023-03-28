package Seminar_2_Homework;

import java.util.Scanner;

public class Task4 {
    public static void Calculator()
    {
        System.Logger logger = System.getLogger("Task4");
        logger.log(System.Logger.Level.INFO, "Calculator starts");
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите операцию (+, -, *, /) или exit для выхода : ");
            String operation = scanner.nextLine();
            if (operation.equalsIgnoreCase("exit")) 
            {
                logger.log(System.Logger.Level.INFO, "Exiting calculator");
                break;
            }

            double num1, num2;
            System.out.println("Введите первое число : ");
            num1 = scanner.nextDouble();
            System.out.println("Введите второе число : ");
            num2 = scanner.nextDouble();
            double result;
            switch(operation) 
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if(num2 == 0)
                    {
                        logger.log(System.Logger.Level.ERROR, "Division by zero");
                        return;
                    }
                    result = num1 / num2;
                    continue;
                default:
                    logger.log(System.Logger.Level.ERROR, "Invalid operation!");
                    //System.out.println("Операция не распознана!");
                    continue;
            }
            logger.log(System.Logger.Level.INFO, String.format("%f %s %f = %f", num1, operation, num2, result));
            //System.out.println(String.format("%f %s %f = %f", num1, operation, num2, result));
        }
        scanner.close();
    }
}
