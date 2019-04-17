package resume;

import GUI.C12;
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

public class C123 {
    Connection con=null;
PreparedStatement preparedStatement=null;
C12 c12=new C12();
Basic b=new Basic();
BasicInfo i=new BasicInfo();

    String name="Name";
      String email="Email_ID";
      String street="Street";
      String state="State";
      String city="City";
      String gender="Gender";
      String qualification="12th";
      int date=01;
      int month= 01;
      int year=1996;
    String phone_num="Phone Number";    
int age=22;
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String[] personal_traits= {"Polite","Confident","Have patience","Helping nature","Disciplined","Ability to handle the stressed situation"};
String language="English,Hindi";
String career_objective="To get a growth oriented position in a reputed organization where my skills can be utilized for improvement and success of the organization.";
int hss_year=2010;
int sss_year=2012;
float hss_percent=97f;
float sss_percent=98f;
String[] extra_curricular={"Playing chess","Playing basket ball","Reading","Traveling and meeting new people","Swimming"} ;
String nationality="Nationality";
String mar_status="Marital Status";
String f_name="Father's Name";
String sss_board="CBSE";
String hss_board="CBSE";
String hss_name="Higher Secondary School";
String sss_name="Senior Secondary School";
String stream12="Medical";
String[] tech_skills={"Thorough knowledge of general patient psychology.","Ability to demonstrate about prescription and Drugs.","Good Communication skills (Verbal) to help patients during treatment.","Responsible to repair injuries, correct deformities, prevent diseases.","Selection of appropriate surgical procedures under pressure","Usage of established surgical techniques during operations."};
String[] hobbies= {"Honest and hardworking","Willingness to learn","Good team player","Good communication skills, optimistic and positive attitude."};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String[] non_tech_skills={};
public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"0112422vsabl2.pdf";
        // step 1
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(RESULT));
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
        info= new Paragraph(career_objective,f1);
        document.add(info);
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
        info= new Paragraph(sss_name,heading);
        document.add(info);
        info=new Paragraph(stream12+" "+sss_year,f1);
        document.add(info);
        info=new Paragraph("Percentage: "+sss_percent,f1);
        document.add(info);
        info=new Paragraph("Board: "+sss_board,f1);
        document.add(info);
        info= new Paragraph(hss_name,heading);
        document.add(info);
        info=new Paragraph(""+hss_year,f1);
        document.add(info);
        info=new Paragraph("Percentage: "+hss_percent,f1);
        document.add(info);
        info=new Paragraph("Board: "+hss_board,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("SKILLS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info= new Paragraph("Technical Skills",heading);
        document.add(info);
        List unorderedList = new List(List.UNORDERED);
         for (String tech_skill : tech_skills) {
             unorderedList.add(new ListItem(new Chunk(tech_skill, f1)));
         }
        document.add(unorderedList);
         info= new Paragraph("Non Techical Skills",heading);
        document.add(info);
         unorderedList = new List(List.UNORDERED);
         for (String n_tech_skill : non_tech_skills) {
             unorderedList.add(new ListItem(new Chunk(n_tech_skill, f1)));
         }
         document.add(unorderedList);
         document.add(new Chunk("\n"));
          
         info= new Paragraph("EXTRA CURRICULAR ACTIVITIES",f2);
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
         for (String extra : extra_curricular) {
             unorderedList.add(new ListItem(new Chunk(extra, f1)));
         }
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("ACHIEVEMENTS",f2);
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
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],f1)));
        document.add(unorderedList);
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

public void create12() {                                         
        career_objective=c12.career_objective;
extra_curricular=c12.extra_curricular;
non_tech_skills=c12.non_tech_skills;
hss_board= b.hss_board;
sss_board= b.sss_board;
hss_name=b.hss_name;
sss_name=b.sss_name;
stream12=c12.stream12;
hobbies=b.hobbies;
tech_skills=c12.tech_skills;
 date_declaration=b.date_declaration;
 place_declaration=b.place_declaration;
 
        name=i.name;
        email=i.email;
      street=i.street;
      state=i.state;
    city=i.city;
    gender=i.city;
      qualification=i.qualification;
      date=i.date;
      month=i.month;
      year=i.year;
    phone_num=i.phone_num;    
    age=b.age;
    language=b.language;
hss_percent=b.hss_percent;
sss_percent=b.sss_percent;
mar_status=b.mar_status;
f_name=b.f_name;
            try{        
                RESULT= System.getProperty("java.io.tmpdir")+"011242llllll2vsabl2.pdf";
        // step 1
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(RESULT));
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
        info= new Paragraph(career_objective,f1);
        document.add(info);
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
        info= new Paragraph(sss_name,heading);
        document.add(info);
        info=new Paragraph(stream12+" "+sss_year,f1);
        document.add(info);
        info=new Paragraph("Percentage: "+sss_percent,f1);
        document.add(info);
        info=new Paragraph("Board: "+sss_board,f1);
        document.add(info);
        info= new Paragraph(hss_name,heading);
        document.add(info);
        info=new Paragraph(""+hss_year,f1);
        document.add(info);
        info=new Paragraph("Percentage: "+hss_percent,f1);
        document.add(info);
        info=new Paragraph("Board: "+hss_board,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        info= new Paragraph("SKILLS",f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info= new Paragraph("Technical Skills",heading);
        document.add(info);
        List unorderedList = new List(List.UNORDERED);
         for (String tech_skill : tech_skills) {
             unorderedList.add(new ListItem(new Chunk(tech_skill, f1)));
         }
        document.add(unorderedList);
         info= new Paragraph("Non Techical Skills",heading);
        document.add(info);
         unorderedList = new List(List.UNORDERED);
         for (String n_tech_skill : non_tech_skills) {
             unorderedList.add(new ListItem(new Chunk(n_tech_skill, f1)));
         }
         document.add(unorderedList);
         document.add(new Chunk("\n"));
          
         info= new Paragraph("EXTRA CURRICULAR ACTIVITIES",f2);
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
         for (String extra : extra_curricular) {
             unorderedList.add(new ListItem(new Chunk(extra, f1)));
         }
        document.add(unorderedList);
         
        document.add(new Chunk("\n"));
        info= new Paragraph("ACHIEVEMENTS",f2);
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
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],f1)));
        document.add(unorderedList);
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
        catch(IOException | DocumentException e){}
                      
    }                                        
}