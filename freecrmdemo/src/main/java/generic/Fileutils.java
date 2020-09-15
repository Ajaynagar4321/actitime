package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutils {
	public static String loginName(int row, int col, String sheet) {
		Workbook book;
		String value = "";
		try {
			book = WorkbookFactory.create(new FileInputStream("./src/main/resources/testdata/testdata.xlsx"));
			value = book.getSheet(sheet).getRow(row).getCell(col).toString();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}
}
