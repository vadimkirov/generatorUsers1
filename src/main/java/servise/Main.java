package servise;

import java.util.Scanner;

import static servise.Generator.multiGen;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дирректорию для вывода файлов:");
        String dirName = sc.next();

        System.out.print("Введите количество файлов:");
        int n = Integer.parseInt(sc.next());

        System.out.print("Введите максимальное количество ЭЛЕМЕНТОВ в файле:");
        int itemsSize = Integer.parseInt(sc.next());


        multiGen(n,itemsSize,dirName);
        System.out.println("Вывод данных окончен");
    }
}
