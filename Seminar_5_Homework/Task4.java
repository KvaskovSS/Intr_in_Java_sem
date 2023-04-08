package Seminar_5_Homework;

public class Task4 {
    private static int[] rows = new int[8];

    public static void task4() 
    {
        placeQueens(0); 
    }

    private static boolean isValid(int row, int col) 
    {
        for (int i = 0; i < row; i++) 
        {
            int diff = Math.abs(rows[i] - col);
            if (diff == 0 || diff == row - i) 
            {
                return false;
            }
        }
        return true;
    }

    private static void placeQueens(int row) 
    {
        if (row == 8) 
        {
            printBoard(); 
        } 
        else 
        {
            for (int col = 0; col < 8; col++) 
            {
                if (isValid(row, col)) 
                {
                    rows[row] = col;
                    placeQueens(row + 1);
                }
            }
        }
    }

    private static void printBoard() 
    {
        for (int row = 0; row < 8; row++) 
        {
            for (int col = 0; col < 8; col++) 
            {
                if (rows[row] == col) 
                {
                    System.out.print("Q ");
                } 
                else 
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
