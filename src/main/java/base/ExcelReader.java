package base;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelReader {
    private String filePath;
    private String sheetName;
    protected Map<String, Map<String, String>> testDataMap ;

    public ExcelReader(String filePath, String sheetName) {
        this.filePath = filePath;
        this.sheetName = sheetName;
    }

    public Map<String, Map<String, String>> readTestData() {
        testDataMap = new HashMap<>();

        try {
            // Create a FileInputStream to read the Excel file
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));

            // Create a workbook instance for the XLSX file
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Specify the sheet
            Sheet sheet = workbook.getSheet(sheetName);

            // Iterate through rows starting from the second row (assuming the first row is for headers)
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row row = sheet.getRow(rowNum);

                // Assuming the first column contains test case IDs
                Cell testCaseIdCell = row.getCell(0);

                // Get the test case ID as a string
                String testCaseId = testCaseIdCell.getStringCellValue();

                // Create a map to store column values for the current test case ID
                Map<String, String> columnValues = new LinkedHashMap<>();

                // Iterate through columns starting from the second column
                for (int colNum = 1; colNum <= 9; colNum++) {
                    Cell cell = row.getCell(colNum);

                    // Get the column header as a string
                    String columnHeader = sheet.getRow(0).getCell(colNum).getStringCellValue();

                    // Get the cell value as a string
                    String cellValue = cell.getStringCellValue();
                    if (cellValue!= null || !cellValue.equals("-")) {

                        // Store the column value in the map
                        columnValues.put(columnHeader, cellValue);
                    }
                }

                // Store the column values map in the main map using the test case ID as the key
                testDataMap.put(testCaseId, columnValues);
            }

            // Close the workbook and FileInputStream
            workbook.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testDataMap;
    }
}
