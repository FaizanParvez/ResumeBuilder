/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resume;


/**
 *
 * @author jitender
 */

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

public class C121
{
Connection con=null;
    PreparedStatement preparedStatement=null;
    C12 c12=new C12();
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
int hss_year=2010;
int sss_year=2012;
float hss_percent=97f;
float sss_percent=98f;
String[] hobbies={"Listening Music","Reading Books"};
String nationality="Nationality";
String mar_status="Marital Satatus";
String f_name="Father's Name";
String career_objective="To get a growth oriented position in a reputed organization where my skills can be utilized for improvement and success of the organization.";
String sss_name="Senior Secondary School";
String hss_name="Higher Secondary School";
String sss_board="CBSE";
String hss_board="CBSE";
String stream12="Non-Medical";
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String[] tech_skills={"Languages","Core JAVA","Web based Development","Html","Operating system","Windows"};
String[] non_tech_skills= {"Honest and hardworking","Willingness to learn","Good team player","Good communication skills, optimistic and positive attitude."};
String[] extra_curricular={"Playing chess","Playing basket ball","Reading","Traveling and meeting new people","Swimming"};
public static FileOutputStream fo;
public static PdfWriter writer;
public void create() throws DocumentException,IOException{
    RESULT= System.getProperty("java.io.tmpdir")+"aaaaaaaaaaa0112422vsabldddmmm.pdf";
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
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 15, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+email+"\n\n"+phone_num,f1);
        Paragraph addr= new Paragraph(street+"\n\n"+city+"\n\n"+state,f1);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(addr);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
//        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("CAREER OBJECTIVE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n\n"));
        subhd= new Chunk("\nEDUCATION",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        Font heading1= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        subhd= new Chunk("\n12th- "+sss_board+" Board- "+stream12,heading1);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        Chunk c1= new Chunk("Institution    :   "+sss_name+"\nYear of Passing    :   "+sss_year+"\nPercentage    :   "+sss_percent+"%",content);
        document.add(c1);
        subhd= new Chunk("\n10th-"+hss_board+" Board",heading1);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        c1= new Chunk("Institution    :   "+hss_name+"\nYear of Passing    :   "+hss_year+"\nPercentage    :   "+hss_percent+"%",content);
        document.add(c1);
        document.add(new Chunk("\n\n"));
        subhd=new Chunk("SKILL SET\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new Chunk("Technical:",heading1));
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(tech_skills[i],content)));
        document.add(unorderedList);
        document.add(rect);
        document.add(new Chunk("Non Technical:",heading1));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<non_tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(non_tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n\n"));
        subhd=new Chunk("EXTRA CURRICULAR ACTIVITIES",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<extra_curricular.length;i++)
        unorderedList.add(new ListItem(new Chunk(extra_curricular[i],content)));
        document.add(subhd);
        document.add(unorderedList);
        subhd= new Chunk("\n\nPERSONAL PROFILE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt= new Paragraph("Name  :   "+name+"\nFather's Name :   "+f_name+"\nDate of Birth   :   "+date+"-"+month+"-"+year+"\nGender :   "+gender+"\nMarital Status  :   "+mar_status+"\nNationality	:  "+nationality+"\nLanguages Known :   "+language+"\nPermanent Address    :   "+street+","+city+","+state+"\nContact Number  :   "+phone_num,content);
        document.add(cntnt);
        subhd= new Chunk("\nDeclaration:",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt =new Paragraph("I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility for the correctness of the above-mentioned particulars.\nDate   :   "+date_declaration+"\nPlace    :   "+place_declaration,content);
        document.add(cntnt);
        document.add(rect);
        document.close();

 }
public void create12(){
    career_objective=c12.career_objective;
extra_curricular=c12.extra_curricular;
hss_board=b.hss_board;
sss_board=b.sss_board;
hss_name=b.hss_name;
sss_name=b.sss_name;
stream12=c12.stream12;
tech_skills=c12.tech_skills;
non_tech_skills=c12.non_tech_skills;
 date_declaration=b.date_declaration;
 place_declaration=b.place_declaration;
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
    nationality=b.nationality;
    language=b.language;
hss_percent=b.hss_percent;
sss_percent=b.sss_percent;
mar_status=b.mar_status;
f_name=b.f_name;
language=b.language;
try{        
    RESULT=System.getProperty("java.io.tmpdir")+"aaaaaaaaaaa0112422fffffffffffvsablmmm.pdf";
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
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 15, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+email+"\n\n"+phone_num,f1);
        Paragraph addr= new Paragraph(street+"\n\n"+city+"\n\n"+state,f1);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(addr);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        document.add(new Chunk("\n"));
//        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("CAREER OBJECTIVE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n\n"));
        subhd= new Chunk("\nEDUCATION",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        Font heading1= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        subhd= new Chunk("\n12th- "+sss_board+" Board- "+stream12,heading1);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        Chunk c1= new Chunk("Institution    :   "+sss_name+"\nYear of Passing    :   "+sss_year+"\nPercentage    :   "+sss_percent+"%",content);
        document.add(c1);
        subhd= new Chunk("\n10th-"+hss_board+" Board",heading1);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        c1= new Chunk("Institution    :   "+hss_name+"\nYear of Passing    :   "+hss_year+"\nPercentage    :   "+hss_percent+"%",content);
        document.add(c1);
        document.add(new Chunk("\n\n"));
        subhd=new Chunk("SKILL SET\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new Chunk("Technical:",heading1));
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(tech_skills[i],content)));
        document.add(unorderedList);
        document.add(rect);
        document.add(new Chunk("Non Technical:",heading1));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<non_tech_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(non_tech_skills[i],content)));
        document.add(unorderedList);
        document.add(new Chunk("\n\n"));
        subhd=new Chunk("EXTRA CURRICULAR ACTIVITIES",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<extra_curricular.length;i++)
        unorderedList.add(new ListItem(new Chunk(extra_curricular[i],content)));
        document.add(subhd);
        document.add(unorderedList);
        subhd= new Chunk("\n\nPERSONAL PROFILE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt= new Paragraph("Name  :   "+name+"\nFather's Name :   "+f_name+"\nDate of Birth   :   "+date+"-"+month+"-"+year+"\nGender :   "+gender+"\nMarital Status  :   "+mar_status+"\nNationality	:  "+nationality+"\nLanguages Known :   "+language+"\nPermanent Address    :   "+street+","+city+","+state+"\nContact Number  :   "+phone_num,content);
        document.add(cntnt);
        subhd= new Chunk("\nDeclaration:",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt =new Paragraph("I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility for the correctness of the above-mentioned particulars.\nDate   :   "+date_declaration+"\nPlace    :   "+place_declaration,content);
        document.add(cntnt);
        document.add(rect);
        document.close();

        }
        catch(IOException | DocumentException e){}

    }                                        
}