package resume;

import GUI.BE;
import GUI.Basic;
import GUI.BasicInfo;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static GUI.View.RESULT;

public class BE3 {
    Connection con=null;
PreparedStatement preparedStatement=null;
BE be=new BE();
    Basic b= new Basic();
    BasicInfo i= new BasicInfo();
     String name="Name";
      String email="Email Id";
      String street="street";
      String state="state";
      String city="city";
      String gender="gender";
      String qualification="qualification";
      int date=01;
      int month=01;
      int year=1992;
    String phone_num="Phone Number";    
int age=22;
String language="Languages you know";
String career_objective="To hold a challenging and competitive position in an organization, where I can enhance my skills and strength in conjunction with company's goals and objectives. ";
int hss_year=2010;
int sss_year=2012;
float hss_percent=97f;
float sss_percent=98f;
String[] hobbies={"Listening Music","Reading Books"};
String nationality="Nationality";
String mar_status="Marital Satatus";
String f_name="Father's Name";
String[] personal_traits= {"Sound knowledge of OOPS concepts, C, C++, Core Java & Android. ","Passion for Technology, aware and updated with the upcoming changes.","Ability to work under pressure and handling critical situations with efficient problem-solving skills.","Effective self-motivated team players open to new ideas and up gradation."};
String min_proj="Resume Builder";
String min_proj_tech= "Java";
String maj_proj= "FingerPrint Detection Software";
String maj_proj_tech="Advanced Java and Android";
String univ_be="College's Name";
float be_cgpa=9.5f;
String stream="Stream";
    String be_year="2014";
String[] area_interest={"Website Development","Compiler Design"};
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String[] key_strengths;
String[] prof_traits={"Willingness to work in team and hard worker.","Ability to deal with people dramatically","Disciplined & good etiquette"};
String[] comp_skills={"Programming Languages :  Java, .NET, PHP","Operating Systems :  Windows XP, Linux, MS-DOS","Packages :  Microsoft Office","RDBMS :  Oracle,MS-SQL server"};
String[] training= {"Undergone certification course in .NET","Successful completion of course in PHP and JSP"};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String des_maj="Describe your Project\n\n";
String des_min="Describe your Project\n\n";
public static FileOutputStream fo;
public static PdfWriter writer;
public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"0112422vsabl2.pdf";
        // step 1
        Document document = new Document();
        // step 2
        fo= new FileOutputStream(RESULT);
        writer=PdfWriter.getInstance(document,fo );
        document.setPageSize(PageSize.LETTER);
        document.setMargins(36, 36, 36, 36);
        document.setMarginMirroring(false);
        // step 3
        document.open();
        // step 4
        
        Font f1= new Font (Font.FontFamily.UNDEFINED, 16, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+phone_num+"\n\n"+email,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        info= new Paragraph("SUMMARY",f2);
        PdfPTable table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        info= new Paragraph("Enthusiastic recent graduate in "+stream+" with strong analytical, organizational and creative problem-solving skills.",f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("CAREER OBJECTIVE",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        info= new Paragraph(career_objective,f1);
        document.add(info);
        document.add(new Chunk("\n"));
         
        info= new Paragraph("EXPERIENCE",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        List unorderedList = new List(List.UNORDERED);
         for (String training1 : training) {
             unorderedList.add(new ListItem(new Chunk(training1, f1)));
           
           
         }
           document.add(unorderedList);
         
         document.add(new Chunk("\n"));
        info= new Paragraph("EDUCATION",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 17, Font.BOLDITALIC, BaseColor.BLACK);
        info= new Paragraph(univ_be,heading);
        document.add(info);
        info=new Paragraph("BE "+stream+" "+be_year,f1);
        document.add(info);
        info=new Paragraph("CGPA: "+be_cgpa,f1);
        document.add(info);
        info=new Paragraph("Senior Secondary School Percentage: "+sss_percent+"%\nHigher Secondary School Percentage: "+hss_percent+"%",f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("COMPUTER SKILLS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        unorderedList = new List(List.UNORDERED);
         for (String comp_skill : comp_skills) {
             unorderedList.add(new ListItem(new Chunk(comp_skill, f1)));
         }
         document.add(unorderedList);
         document.add(new Chunk("\n"));
          
         info= new Paragraph("INTERESTSS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        unorderedList = new List(List.UNORDERED);
         for (String area_interest1 : area_interest) {
             unorderedList.add(new ListItem(new Chunk(area_interest1, f1)));
         }
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("PROFESSIONAL STRENGTHS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<prof_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(prof_traits[i],f1)));
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("PROJECTS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Chunk subhd= new Chunk("\nMinor Project: "+min_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph("Language of implementation : "+min_proj_tech,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_min,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Major Project: "+maj_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+maj_proj_tech,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_maj,f1);
        document.add(subhd);
        document.add(cntnt);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("ADDRESS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info=new Paragraph(street+"\n"+city+"\n"+state,f1);
        document.add(info);
        document.close();
}

public void createBE() throws IOException, DocumentException{                                         
career_objective=be.career_objective;
min_proj=be.min_proj;
 min_proj_tech=be.min_proj_tech;
maj_proj= be.maj_proj;
maj_proj_tech=be.maj_proj_tech;
univ_be=be.univ_be;
be_cgpa=be.be_cgpa;
stream=be.stream;
area_interest=be.area_interest;
awards=be.awards;
prof_traits=be.prof_traits;
comp_skills=be.comp_skills;
training= be.training;
 date_declaration=b.date_declaration;
 place_declaration=b.place_declaration;
 des_maj=be.des_min;
des_min=be.des_min;
        name=i.name;
        email=i.email;
      street=i.street;
      state=i.state;
    city=i.city;
    gender=i.gender;
      qualification=i.qualification;
      date=i.date;
      month=i.month;
      year=i.year;
    phone_num=i.phone_num;    
    age=b.age;
    language=b.language;
hss_percent=b.hss_percent;
sss_percent=b.sss_percent;
hobbies=b.hobbies;
mar_status=b.mar_status;
f_name=b.f_name;
personal_traits=b.personal_traits;
be_year=be.be_year;
RESULT= System.getProperty("java.io.tmpdir")+"0112422ddddvsabl2.pdf";
        // step 1
        Document document = new Document();
        // step 2
        fo= new FileOutputStream(RESULT);
        writer=PdfWriter.getInstance(document,fo );
        document.setPageSize(PageSize.LETTER);
        document.setMargins(36, 36, 36, 36);
        document.setMarginMirroring(false);
        // step 3
        document.open();
        // step 4
        
        Font f1= new Font (Font.FontFamily.UNDEFINED, 16, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+phone_num+"\n\n"+email,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        info= new Paragraph("SUMMARY",f2);
        PdfPTable table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        info= new Paragraph("Enthusiastic recent graduate in "+stream+" with strong analytical, organizational and creative problem-solving skills.",f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("CAREER OBJECTIVE",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        info= new Paragraph(career_objective,f1);
        document.add(info);
        document.add(new Chunk("\n"));
         
        info= new Paragraph("EXPERIENCE",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        List unorderedList = new List(List.UNORDERED);
         for (String training1 : training) {
             unorderedList.add(new ListItem(new Chunk(training1, f1)));
           
           
         }
           document.add(unorderedList);
         
         document.add(new Chunk("\n"));
        info= new Paragraph("EDUCATION",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 17, Font.BOLDITALIC, BaseColor.BLACK);
        info= new Paragraph(univ_be,heading);
        document.add(info);
        info=new Paragraph("BE "+stream+" "+be_year,f1);
        document.add(info);
        info=new Paragraph("CGPA: "+be_cgpa,f1);
        document.add(info);
        info=new Paragraph("Senior Secondary School Percentage: "+sss_percent+"%\nHigher Secondary School Percentage: "+hss_percent+"%",f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("COMPUTER SKILLS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         
        unorderedList = new List(List.UNORDERED);
         for (String comp_skill : comp_skills) {
             unorderedList.add(new ListItem(new Chunk(comp_skill, f1)));
         }
         document.add(unorderedList);
         document.add(new Chunk("\n"));
          
         info= new Paragraph("INTERESTSS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        unorderedList = new List(List.UNORDERED);
         for (String area_interest1 : area_interest) {
             unorderedList.add(new ListItem(new Chunk(area_interest1, f1)));
         }
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("PROFESSIONAL STRENGTHS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<prof_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(prof_traits[i],f1)));
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("PROJECTS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Chunk subhd= new Chunk("\nMinor Project: "+min_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph("Language of implementation : "+min_proj_tech,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_min,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Major Project: "+maj_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+maj_proj_tech,f1);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_maj,f1);
        document.add(subhd);
        document.add(cntnt);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("ADDRESS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info=new Paragraph(street+"\n"+city+"\n"+state,f1);
        document.add(info);
        document.close();
}
}