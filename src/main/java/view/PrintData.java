package view;

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
            writer.write("$customergroup = customergroup");
            writer.write(System.lineSeparator());
            writer.write("$defaultPassword = asasas");
            writer.write(System.lineSeparator());
            writer.write("# Sample customers");
            writer.write(System.lineSeparator());
            writer.write("INSERT_UPDATE Customer;" +
                    " originalUid[unique = true];" +
                    " uid[unique = true];" +
                    " title(code);" +
                    " name;" +
                    " description;" +
                    " sessionLanguage(isocode);" +
                    " sessionCurrency(isocode);" +
                    " groups(uid);" +
                    " password[default = $defaultPassword];" +
                    " customerID;");
            writer.write(System.lineSeparator());

            for (Product bean : beans) {
                Product product = bean;
                String stringBuilder = product.getPole1() + ";" +
                        product.getOriginalUid() + ";" +
                        product.getUid() + ";" +
                        product.getTitle() + ";" +
                        product.getName() + ";" +
                        product.getDescription() + ";" +
                        product.getSessionLanguage() + ";" +
                        product.getSessionCurrency() + ";" +
                        product.getGroups() + ";" +
                        product.getPassword() + ";" +
                        product.getCustomerID() + ";";
                writer.write(stringBuilder);
                writer.write(System.lineSeparator());
            }
            writer.close();
            System.out.println(fileName + " successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
