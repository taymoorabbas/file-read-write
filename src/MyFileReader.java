/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 26-Nov-19
Time: 12:13 AM
Lau ji Ghauri aya fir
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {

    private File file;
    private BufferedReader bufferedReader;
    private Scanner scanner;
    private RandomAccessFile randomAccessFile;

    public MyFileReader(String filePath){

        this.file = new File(filePath);
    }

    public StringBuilder readUsingBufferedReader(){

        StringBuilder data = new StringBuilder();

        try {

            this.bufferedReader = new BufferedReader(new FileReader(this.file));

            try {

                data = new StringBuilder(this.bufferedReader.readLine());

                while (this.bufferedReader.readLine() != null){

                    data.append("\n").append(this.bufferedReader.readLine());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }

    public StringBuilder readUsingScanner(){

        StringBuilder data = new StringBuilder();

        try {
            this.scanner = new Scanner(this.file);

            while (scanner.hasNextLine()){

                data.append("\n").append(scanner.nextLine());
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }

    public StringBuilder readUsingFiles(){

        StringBuilder data = new StringBuilder();

        try {
            List<String> allLines = Files.readAllLines(Paths.get(this.file.getPath()));

            for(String item : allLines){

                data.append("\n").append(item);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public StringBuilder readUsingRandomAccessFile(){

        StringBuilder data = new StringBuilder();

        try {
            this.randomAccessFile = new RandomAccessFile(this.file, "r");

            data.append(this.randomAccessFile.readLine());

            while (this.randomAccessFile.readLine() != null){

                data.append("\n").append(this.randomAccessFile.readLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                this.randomAccessFile.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }

}
