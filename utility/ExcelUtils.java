package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import webPage.PageURLs;

public class ExcelUtils {

	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static DataFormatter formatter;

	public static void setExcel() {

		try {
			FileInputStream fis = new FileInputStream(PageURLs.EXCEL_PATH);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println("An error has occurred!");
			e.printStackTrace();
		}

	}

	public static void setWorkSheet(int index) {
		sheet = wb.getSheetAt(index);
	}

	public static String getCellData(int row, int column) {
		cell = sheet.getRow(row).getCell(column);
		cell.setCellType(CellType.STRING);
		return cell.toString();

	}

	public static void setCellData(int row, int column, String data) {
		cell = sheet.getRow(row).getCell(column, MissingCellPolicy.RETURN_BLANK_AS_NULL);
		if (cell == null)
			sheet.getRow(row).createCell(column).setCellValue(data);
		else
			cell.setCellValue(data);

		try {
			FileOutputStream fos = new FileOutputStream(PageURLs.EXCEL_PATH);
			wb.write(fos);
			fos.flush();
			fos.close();

		} catch (Exception e) {
			System.out.println("An error has occurred!");
		}

	}

	public static boolean closeExcell() {
		if (wb != null) {
			try {
				wb.close();
				wb = null;
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				wb = null;
				return false;
			}
		}
		return true;
	}

}
