
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int arrsi = 0;
        int sumarr = 0;
        try {
            arrsi = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("число не целое");
            exitMethod();
        }

        byte[] bytearr = new byte[arrsi];
        System.out.println("Введите число от -128 до 127 типа Byte");
        for (byte valuearr : bytearr){
            try {
                valuearr = in.nextByte();
                sumarr = sumarr + (int) valuearr;
                if ((sumarr < -128) || sumarr > 127){
                    throw new RuntimeException("значение за границами диапазона типа.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введен не верный тип данных");
                exitMethod();
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                exitMethod();
            }
        }

        System.out.println("Сумма: " +sumarr);

    }
    static void exitMethod(){
        System.out.println("Программа завершена из за ошибки");
        System.exit(0);
}}
