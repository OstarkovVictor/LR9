

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws Exception {
        String[][] TheMatrix = new String[6][9];
        int incolomn = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите пожалуйста номер столбца от 1 - 9 ");
        try {
            incolomn = in.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Ошибка: введено не целое число!");
            outVoid();
        }
        System.out.println("Матрица: " + TheMatrix.length+"x" + TheMatrix[0].length);







        for (int i = 0; i < TheMatrix.length; i++ ) {
            for (int j = 0; j < TheMatrix[i].length; j++){
                Random rn = new Random();
                TheMatrix[i][j] = String.valueOf(rn.nextInt(100));
            }
            System.out.println(Arrays.toString(TheMatrix[i]));
        }

        if ((incolomn == 0) | (incolomn > TheMatrix[0].length )){
            throw new Exception("Нет столбца");
        }
        System.out.println("Ваш столбец " + incolomn + ":");
        for (int i = 0; i < TheMatrix.length; i++){
            System.out.println(TheMatrix[i][incolomn-1]);


        }
    }

    static void outVoid(){
        System.out.println("Программа завершена из за ошибки");
        System.exit(0);
    }}
