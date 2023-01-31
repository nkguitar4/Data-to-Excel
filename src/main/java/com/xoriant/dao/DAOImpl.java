package com.xoriant.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.ui.Model;

import com.xoriant.models.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DAOImpl implements DAO{


	public String addUser(User user,HttpServletRequest req,HttpServletResponse res,Model model) {
		try {
			String adr="E:\\Filehandling\\info.xlsx";
			FileInputStream myxls = new FileInputStream(adr);
			XSSFWorkbook workbook = new XSSFWorkbook(myxls);
			XSSFSheet sh = workbook.getSheetAt(0);
			int lastRow=sh.getLastRowNum();
			System.out.println(lastRow);



			int rowCount = 0;
			Row rowZero = sh.createRow(rowCount++);
			CellStyle style = workbook.createCellStyle();
			Font font = workbook.createFont();
			font.setBoldweight(Font.BOLDWEIGHT_BOLD);
			style.setFont(font);



			String[] coloumnheadings= {"First Name","Last Name","Email","Designation",
					"Start of Contract","End of Contract","Position Number","Function","Manager Name",
					"PO Number","Vendor Name","Personal Address","Contact Number","Current location"};
			int noOfColumns = coloumnheadings.length;
			for (int col = 0; col < noOfColumns; col++) {
				Cell cell = rowZero.createCell(col);
				cell.setCellValue(coloumnheadings[col]);
				cell.setCellStyle(style);
			}

			sh.createFreezePane(0, 1);

			int lastrowcount=sh.getLastRowNum();
			System.out.println(lastrowcount);

			for(int i=0;i<noOfColumns;i++) 
				sh.autoSizeColumn(i);

			lastrowcount++;
			Row row=sh.createRow(lastrowcount);
			row.createCell(0).setCellValue(user.getFname());
			row.createCell(1).setCellValue(user.getLname());
			row.createCell(2).setCellValue(user.getMail());
			row.createCell(3).setCellValue(user.getDesg());
			row.createCell(4).setCellValue(user.getSoc());
			row.createCell(5).setCellValue(user.getEoc());
			row.createCell(6).setCellValue(user.getPosnum());
			row.createCell(7).setCellValue(user.getFn());
			row.createCell(8).setCellValue(user.getMname());
			row.createCell(9).setCellValue(user.getPonum());
			row.createCell(10).setCellValue(user.getVname());
			row.createCell(11).setCellValue(user.getPaddr());
			row.createCell(12).setCellValue(user.getNum());
			row.createCell(13).setCellValue(user.getCrrloc());




			FileOutputStream fileout=new FileOutputStream(adr);
			workbook.write(fileout);
			fileout.close();
			workbook.close();
			String error="Data Inserted successfully in the file";
			model.addAttribute("error",error);
			return "successlogin";


		}catch(Exception e){

			//e.printStackTrace();
			System.out.println("Problem with file....Data not inserted");
			System.out.println("ERROR: "+e);
			String error="Problem with file....Data not inserted";
			model.addAttribute("error",error);
			return "successlogin";

		}


	}




}
