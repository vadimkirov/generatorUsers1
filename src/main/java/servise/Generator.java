package servise;

import model.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static view.PrintData.dataOutput;

public class Generator {



    public static List<Product> generateData (int maxSize){
        List<Product> productList = new ArrayList<>();

        Random random = new Random();
        int listSize = random.nextInt(maxSize+1);

        for (int i = 0; i < listSize; i++) {

            int randomAdd = random.nextInt(i+1);
            String name = "nameOfProduct"+randomAdd;

            randomAdd = random.nextInt(i+1);
            String condition = "conditionOfProduct" + randomAdd;

            randomAdd = random.nextInt(i+1);
            String state = "stateOfProduct" + randomAdd;

            DecimalFormat df = new DecimalFormat("####.###");
            float price = Float.parseFloat(df.format((Math.random() * 5000)));

            productList.add(new Product(i+1,name,condition,state,price));


        }

        return productList;
    }

    public static void multiGen(int n, int maxSize, String dirName){

        for (int i = 0; i < n; i++) {
            String fileName = "data"+i+".csv";
            dataOutput(dirName,fileName,generateData(maxSize));

        }
    }

}
