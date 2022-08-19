package com.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	public static void main(String[] args) throws IOException {
		File fs = new File("C:\\Users\\barat\\OneDrive\\Documents\\Book1.xlsx");
		FileInputStream fns = new FileInputStream(fs);
		Workbook wb = new XSSFWorkbook(fns);
		Sheet s = wb.getSheetAt(0);
		int rows = s.getPhysicalNumberOfRows();
		Row row1 = s.getRow(1);
		int cells = row1.getPhysicalNumberOfCells();
		String data[][] = new String[rows][cells];
		for (int i = 0; i < rows; i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				String value = null;
				if (type.equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					data[i][j] = value;
				} else if (type.equals(CellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					int a = (int) d;
					value = String.valueOf(a);
					data[i][j] = value;
				}
			}
			wb.close();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(data[i][j]);
			}
		}
	}
}
