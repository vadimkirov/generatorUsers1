package servise;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static view.PrintData.dataOutput;

public class Generator {


    public static List<Product> generateData (int maxSize){
        List<Product> productList = new ArrayList<>();

        Random random = new Random();


        for (int i = 0; i < maxSize; i++) {

            String temp = " +7980524" + String.format("%04d", random.nextInt(10000));

            productList.add(new Product(" ", temp, temp," mr"," Нагрузочник Нагрузов",
                    " Нагрузочный пользователь", " ru", " RUB",
                    " $customergroup", " ", temp ));
        }
        return productList;
    }


    public static void multiGen(int n, int maxSize, String dirName){
        for (int i = 0; i < n; i++) {
            String fileName = "users"+ i +".impex";
            dataOutput(dirName,fileName,generateData(maxSize));
        }
    }

}
