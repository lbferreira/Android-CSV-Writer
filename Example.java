package br.com.csv_writer.csvwriterandroid;

/**
 * Example of how to create a csv file.
 */
public class Example{


    private void createCsvFileExample1() {
        String foldeName = "MyAppFolder";
        String fileName = "myFile";

        WriteCSVHelper writeCSVHelper = new WriteCSVHelper(foldeName, fileName, WriteCSVHelper.SEMICOLON_SEPARATOR);

        String[] header = {"first col", "second col", "third col"};
        String[] textCSV = {"first cell", "second cell", "third cell"};

        writeCSVHelper.writeLine(header);
        writeCSVHelper.writeLine(textCSV);
        writeCSVHelper.close();
    }


    private void createCsvFileExample2() {
        String foldeName = "MyAppFolder";
        String fileName = "myFile";

        WriteCSVHelper writeCSVHelper = new WriteCSVHelper(foldeName, fileName, WriteCSVHelper.SEMICOLON_SEPARATOR);

        String[] header = {"first col", "second col", "third col"};
        writeCSVHelper.writeLine(header);

        for(int i = 0; i<50; i+=3){
            double[] values = {i, i+1, i+2};
            writeCSVHelper.writeLine(values);
        }
        writeCSVHelper.close();
    }



}
