package br.com.csv_writer.csvwriterandroid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Simple Class to help write a csv file
 * Created by Lucas B. Ferreira
 */
public class WriteCSVHelper {

    private FileOutputStream fileOutputStream;
    private OutputStreamWriter outputStreamWriter;

    public static final String SEMICOLON_SEPARATOR = ";";
    public static final String COMMA_SEPARATOR = ",";

    private String folderName;
    private String fileName;
    private String separator;


    public WriteCSVHelper(String folderName, String fileName) {
        this.folderName = folderName;
        this.fileName = fileName;
        this.separator = SEMICOLON_SEPARATOR;
    }

    public WriteCSVHelper(String folderName, String fileName, String separator) {
        this.folderName = folderName;
        this.fileName = fileName;
        this.separator = separator;
    }


    /**
     * Create a csv file
     * @throws IOException
     */
    private void createCsvFile() throws IOException {
        File createPath = new File(android.os.Environment.getExternalStorageDirectory() + "/" + folderName);
        createPath.mkdir();
        String path = createPath.getPath();

        try {
            File csvFile = new File(path + "/" + fileName + ".csv");
            csvFile.createNewFile();
            fileOutputStream = new FileOutputStream(csvFile);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Write a line of text in the csv file with the informed separator
     * @param csvText String Array with text to be written in one line
     * @return true if the line was successfully written, false if not
     */
    public boolean writeLine(String[] csvText){
        if(outputStreamWriter == null){
            try {
                createCsvFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        StringBuilder textWithSeparator = new StringBuilder();

        for(String text: csvText){
            textWithSeparator.append(text + separator);
        }

        try {
            outputStreamWriter.append(textWithSeparator.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Write a line of text in the csv file with the informed separator
     * @param csvText ArrayList<String> with text to be written in one line
     * @return true if the line was successfully written, false if not
     */
    public boolean writeLine(ArrayList<String> csvText){
        if(outputStreamWriter == null){
            try {
                createCsvFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        StringBuilder textWithSeparator = new StringBuilder();

        for(String text: csvText){
            textWithSeparator.append(text + separator);
        }

        try {
            outputStreamWriter.append(textWithSeparator.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Write a line of text in the csv file with the informed separator
     * @param csvText double Array with values to be written in one line
     * @return true if the line was successfully written, false if not
     */
    public boolean writeLine(double[] csvText){
        if(outputStreamWriter == null){
            try {
                createCsvFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        StringBuilder textWithSeparator = new StringBuilder();

        for(double text: csvText){
            textWithSeparator.append(text + separator);
        }

        try {
            outputStreamWriter.append(textWithSeparator.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Write a line of text in the csv file with the informed separator
     * @param csvText int Array with values to be written in one line
     * @return true if the line was successfully written, false if not
     */
    public boolean writeLine(int[] csvText){
        if(outputStreamWriter == null){
            try {
                createCsvFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        StringBuilder textWithSeparator = new StringBuilder();

        for(double text: csvText){
            textWithSeparator.append(text + separator);
        }

        try {
            outputStreamWriter.append(textWithSeparator.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Close the writer.
     */
    public void close(){
        try {
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}