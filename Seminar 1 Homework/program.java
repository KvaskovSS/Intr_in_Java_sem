import java.util.Scanner;

/**
 * program
 */

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 4] : ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1 :
                task1();
                break;
            case 2 :
                task2();
                break;
            case 3 :
                task3();
                break;
            case 4 :
                task4();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }

    static void task1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        TrianglePlusFactorial(n);
        scanner.close();
    }

    static void task2()
    {
        System.out.println("Задание 2");
        for (int i = 2; i <= 1000; i++) 
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    static void task3()
    {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана!");
                return;
        }

        System.out.println("Результат: " + result);
    }

    static void task4()
    {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение вида q + w = e, где q, w, e >= 0: ");
        String equation = scanner.nextLine();

        String answer = new String();

        boolean foundSolution = false;
        int countQuestionMarks = equation.length() - equation.replace("?", "").length();
        for (int i = 0; i <= 9; i++) 
        {
            for (int j = 0; j <= 9; j++) 
            {
                if (i == j && countQuestionMarks == 1) continue; 
                String temp = equation.replace("?", Integer.toString(i)).replaceFirst("\\?", Integer.toString(j));
                if (isValidEquation(temp)) 
                {
                    answer = temp;
                    foundSolution = true;
                }
            }
        }
        if(foundSolution == false)
        {
            System.out.println("Решений нет");
        }
        else
        {
            System.out.println(answer);
        }

    }
    
    static void TrianglePlusFactorial(int n)
    {
        int sum = 0;
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
            fact *= i;
        }
        System.out.println("n = " + n);
        System.out.println("Треугольное число " + n + " = " + sum);
        System.out.println(n + "! = " + fact);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidEquation(String equation) 
    {
        String[] splitEquation = equation.split("=");
        int q = 0, w = 0, e = 0;
        try 
        {
            q = Integer.parseInt(splitEquation[0].split("\\+")[0].trim());
            w = Integer.parseInt(splitEquation[0].split("\\+")[1].trim());
            e = Integer.parseInt(splitEquation[1].trim());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e1) 
        {
            return false;
        }
        return q + w == e;
    }

}
