/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 25-Nov-19
Time: 10:40 PM
Lau ji Ghauri aya fir
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyFileWriter {

    private File file;
    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private BufferedWriter bufferedWriter;
    private FileOutputStream outputStream;

    public MyFileWriter(String filePath){

        this.file = new File(filePath);
    }

    public void writeUsingFileWriter(String data){

        try {

            this.fileWriter = new FileWriter(file, true);
            this.fileWriter.write(data + "\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        finally {

            try {
                this.fileWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeUsingBufferedWriter(String data){

        try {
            this.bufferedWriter = new BufferedWriter(new FileWriter(this.file, true));
            this.bufferedWriter.write(data + "\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                this.bufferedWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeUsingOutputStream(String data){

        data += "\n";

        try {

            this.outputStream = new FileOutputStream(this.file, true);
            this.outputStream.write(data.getBytes(), 0, data.length());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                this.outputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeUsingFiles(String data){

        data += "\n";

        try {
            Files.write(Paths.get(
                    this.file.getPath()),
                    data.getBytes(),
                    StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUsingPrintWriter(String data){

        try {
            this.printWriter = new PrintWriter(new FileOutputStream(this.file, true));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.printWriter.write(data + "\n");
        this.printWriter.flush();
        this.printWriter.close();
    }
}

