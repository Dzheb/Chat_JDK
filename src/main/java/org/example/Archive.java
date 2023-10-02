package org.example;

import java.io.*;
public class Archive {
    /***
     *
     * @param fileName - имя файла для записи
     * @param - строка для записи
     */
    public void writeFile(String fileName,String buffer) {
        try(FileWriter writer = new FileWriter(fileName, true))
        {
            writer.write(buffer);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /***
     * чтение файла
     * @param filename
     * @throws Exception
     */
    public  String readFile(String filename) throws Exception
    {
        File file = new File(filename);
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String notes = "";
        String st;
        while ((st = br.readLine()) != null)
            notes = notes + st+ "\n";
        return notes;
    }

}