package com.simpleway.frst.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * excel import util
 * @author xiongfeixiang
 * @param <T>
 * @Date 2016年12月12日 
 */
public class ImportExcel {

  @SuppressWarnings("resource")
  public static List<List<String>> getListByInputStream(InputStream ins) {
    List<List<String>> reList = new ArrayList<>();

    try {
      Workbook wb = WorkbookFactory.create(ins);
      Sheet sheet = wb.getSheetAt(0);// 只有一个sheet
      for (Row row : sheet) {
        List<String> rowList = new ArrayList<>();
        for (Cell cell : row) {
          rowList.add(getValue(cell));
        }
        reList.add(rowList);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return reList;
  }

  @SuppressWarnings("static-access")
  private static String getValue(Cell cell) {
    if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
      // 返回布尔类型的值
      return String.valueOf(cell.getBooleanCellValue());
    } else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
      // 返回数值类型的值
      return String.valueOf(cell.getNumericCellValue());
    } else {
      // 返回字符串类型的值
      return String.valueOf(cell.getStringCellValue());
    }
  }

  
}
