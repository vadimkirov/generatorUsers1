package view;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import model.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class PrintData {

    public static void dataOutput(String outDirName, String fileName, List<Product> beans){
        File outFile = new File(outDirName,fileName);
        try {
            Writer writer = new FileWriter(outFile);
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(beans);
            writer.close();
            System.out.println(fileName + " successfully");
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }

    }
}
