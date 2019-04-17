/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javax.swing.JOptionPane;
import static GUI.View.RESULT;

public class C124  {
    Connection con=null;
    PreparedStatement preparedStatement=null;
    Basic b= new Basic();
    BasicInfo i= new BasicInfo();
    C12 c12=new C12();
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
String[] non_tech_skills= {"Honest and hardworking","Willingness to learn","Good team player","Good communication skills, optimistic and positive attitude."};
int hss_year=2010;
int sss_year=2012;
float hss_percent=97f;
float sss_percent=98f;
String[] hobbies={"Listening Music","Reading Books"};
String nationality="Nationality";
String mar_status="Marital Satatus";
String f_name="Father's Name";
String[] personal_traits= {"Sound knowledge of OOPS concepts, C, C++, Core Java & Android. ","Passion for Technology, aware and updated with the upcoming changes.","Ability to work under pressure and handling critical situations with efficient problem-solving skills.","Effective self-motivated team players open to new ideas and up gradation."};
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String career_objective="To get a growth oriented position in a reputed organization where my skills can be utilized for improvement and success of the organization.";
String[] extra_curricular={"Playing chess","Playing basket ball","Reading","Traveling and meeting new people","Swimming"} ;
String sss_board="CBSE";
String hss_board="CBSE";
String hss_name="Higher Secondary School";
String sss_name="Senior Secondary School";
String stream12="Stream";
String[] tech_skills={"Thorough knowledge of general patient psychology.","Ability to demonstrate about prescription and Drugs.","Good Communication skills (Verbal) to help patients during treatment.","Responsible to repair injuries, correct deformities, prevent diseases.","Selection of appropriate surgical procedures under pressure","Usage of established surgical techniques during operations."};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
   
public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"011242ffffllllll2vsabl2.pdf";
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
        
        Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(4);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
        Font f1= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, BaseColor.BLACK);
        Paragraph info= new Paragraph(name,f1);
        PdfPTable table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        info= new Paragraph(street+","+city+","+state+"\n"+email+"\n"+phone_num,f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("PROFILE",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font content= new Font (Font.FontFamily.HELVETICA, 16, Font.ITALIC, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n"));
        title= new Paragraph("EDUCATION",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Paragraph cls= new Paragraph("Class 10\n\nClass 12- "+stream12,content);
        Paragraph school= new Paragraph(hss_name+"\n\n"+sss_name,content);
        Paragraph marks= new Paragraph(hss_percent+"%\n\n"+sss_percent+"%",content);
        table = new PdfPTable(3);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(cls);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(school);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(marks);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
        title= new Paragraph("AWARDS RECEIVED",font);
        document.add(rect);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        title= new Paragraph("TECHNICAL SKILLS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        title= new Paragraph("NON TECHNICAL SKILLS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<non_tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(non_tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
            title= new Paragraph("PERSONAL TRAITS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(rect);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<personal_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(personal_traits[i],content)));
        document.add(unorderedList);
        document.add(rect);
        document.close();
 }
public void create12() {                                         
        career_objective=c12.career_objective;
extra_curricular=c12.extra_curricular;
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
non_tech_skills=c12.non_tech_skills;
            try{        
                RESULT= System.getProperty("java.io.tmpdir")+"011242fffflllssssvvvvlll2vsabl2.pdf";
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
        
        Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(4);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
        Font f1= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, BaseColor.BLACK);
        Paragraph info= new Paragraph(name,f1);
        PdfPTable table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        info= new Paragraph(street+","+city+","+state+"\n"+email+"\n"+phone_num,f2);
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("PROFILE",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font content= new Font (Font.FontFamily.HELVETICA, 16, Font.ITALIC, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n"));
        title= new Paragraph("EDUCATION",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Paragraph cls= new Paragraph("Class 10\n\nClass 12- "+stream12,content);
        Paragraph school= new Paragraph(hss_name+"\n\n"+sss_name,content);
        Paragraph marks= new Paragraph(hss_percent+"%\n\n"+sss_percent+"%",content);
        table = new PdfPTable(3);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(cls);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(school);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(marks);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
        title= new Paragraph("AWARDS RECEIVED",font);
        document.add(rect);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        title= new Paragraph("TECHNICAL SKILLS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        title= new Paragraph("NON TECHNICAL SKILLS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<non_tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(non_tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n"));
            title= new Paragraph("PERSONAL TRAITS",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(rect);
        document.add(title);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<personal_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(personal_traits[i],content)));
        document.add(unorderedList);
        document.add(rect);
        document.close();
        }
        catch(IOException | DocumentException e){}
                      
    }                                        
}