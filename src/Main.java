/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 25-Nov-19
Time: 10:33 PM
Lau ji Ghauri aya fir
*/

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        MyFileWriter fileWriter = new MyFileWriter("wrestler.txt");

        fileWriter.writeUsingFileWriter("Undertaker");
        fileWriter.writeUsingFileWriter("batista");
        fileWriter.writeUsingFileWriter("Stone cold");

        fileWriter.writeUsingBufferedWriter("kane");
        fileWriter.writeUsingBufferedWriter("mark henry");
        fileWriter.writeUsingBufferedWriter("the rock");

        fileWriter.writeUsingOutputStream("rey mysterio");
        fileWriter.writeUsingOutputStream("brock lesnar");
        fileWriter.writeUsingOutputStream("kurt angle");

        fileWriter.writeUsingFiles("john cena");
        fileWriter.writeUsingFiles("randy orton");
        fileWriter.writeUsingFiles("edge");

        fileWriter.writeUsingPrintWriter("kofi kingston");
        fileWriter.writeUsingPrintWriter("booker t");
        fileWriter.writeUsingPrintWriter("king mabel");


    }
}
