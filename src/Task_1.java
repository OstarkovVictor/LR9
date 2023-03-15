import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int lenarr = 0;







            int[] intarr = new int[0];
            int countnum = 0; int comnum = 0;
            System.out.println("Среднее значение");
            System.out.print("Введите длину массива ");
            try {
                lenarr = in.nextInt();
                intarr = new int[lenarr];
            } catch (NegativeArraySizeException e) {
                System.out.println("Ошибка: массив с отрицательным размером");
                exitMethod();





            } catch (InputMismatchException e){
                System.out.println("Ошибка: введено не целое число!");
                exitMethod();
            }

            for (int i = 0; i < lenarr; i++) { //// заполняем массив числами
                System.out.println("Введите " + i + " элемент массива.");
                try {
                    intarr[i] = in.nextInt();
                    if (intarr[i] > 0){
                        comnum = comnum + intarr[i];
                        countnum = countnum + 1;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не целое число!");
                    exitMethod();                break;
                }
            }

            try {
                if(countnum == 0){
                    throw new Exception("Положительные элементы отсутствуют");
                }
                System.out.println("Среднее положительное массива: " + ((double) comnum/countnum));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitMethod();
            }
        }

        static void exitMethod(){
            System.out.println("Программа завершена из за ошибуи");
            System.exit(0);
        }

    }

