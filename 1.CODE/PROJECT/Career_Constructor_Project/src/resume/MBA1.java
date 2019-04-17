package resume;

import GUI.MBA;
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
import static GUI.View.RESULT;

public class MBA1{
    Connection con=null;
    PreparedStatement preparedStatement=null;
       MBA mba=new MBA();
        Basic b= new Basic();
    BasicInfo i= new BasicInfo();
    String name="Sakshi Sehgal";
      String email="sehgalsakshi@ymail.com";
      String street="#615,Sector-2";
      String state="Haryana";
      String city="Panchkula";
      String gender="female";
      String qualification="MBE";
      int date=22;
      int month= 8;
      int year=1994;
    String phone_num="9646966928";    
int age=20;
String language="English,Hindi";
String career_objective="To be a leading business leader in a multinational organization where my professional and leadership skills, as well as experience gained through exposure to diverse business environments can be successfully applied. ";
String hss_year="2010";
String sss_year="2012";
float hss_percent=97f;
float sss_percent=98f;
String[] hobbies={"Swimming","Reading Books","Surfing Net"};
String nationality="Indian";
String mar_status="Single";
String f_name="Capt Ravi Sehgal";
String[] personal_traits= {""};
String Mba_division="9.5";
String Grad_division="9.3";
String[] key_strengths={"Excellent interpersonal skills with the ability to work with people at all levels.","Excellent writing, presentation and analytical skills.","High integrity, dynamic and proactive."};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String[] IT_skills={"Proficiency in the use of Microsoft Office applications (i.e.  MS excel, MS word, MS PowerPoint and Outlook).","Concise analytical skills in spreadsheets and their use in relating business cases for optimizing decisions.","Use of different templates in populating customized report such as appraisal reports, evaluating value for money decisions and other tailored reports."};
String Mba_univ="DR BABASAHEB AMBEDKAR MARATHWADA UNIVERSITY";
String Grad_univ="DR BABASAHEB AMBEDKAR MARATHWADA UNIVERSITY";
String Mba_proj="\"The role of IT in human resources.\"for M.B.A based on, Life Insurance Company. L.I.C. (India)";
String Grad_proj="\"Production management\" for B.B.A. based on Saamana daily newspaper (a regional daily newspaper in India.";
String hss_name="Highway Secondary School";
        String sss_Board="CBSE";
        String sss_name="Consolata Primary School";
        String hss_Board="CBSE";
        String Mba_year="2012";
        String Grad_year="2013";

   public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"aa0112422vsablc.pdf";
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        document.setPageSize(PageSize.LETTER);
        document.setMargins(36, 72, 108, 180);
        document.setMarginMirroring(false);
        // step 3
        document.open();
        // step 4
        
         //Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        //rect.setBorder(Rectangle.BOX);
        //rect.setBorderWidth(3);
        //rect.setBorderColor(BaseColor.BLACK);
        //document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC, BaseColor.BLACK);
        Paragraph info1= new Paragraph(name+"\n\n",f1);
        info1.setAlignment(Element.ALIGN_LEFT);
        document.add(info1);
        document.add(new LineSeparator(2f,110,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
        Paragraph info= new Paragraph("\n"+email+"\n\n"+phone_num+"\n",f2);
        document.add(info);
        document.add(new Chunk("\n"));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        Font heading1= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("Career Objective ",heading);
        subhd.setUnderline(1f, 0);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        subhd= new Chunk("\n Key Competencies\n",heading);
        subhd.setUnderline(1f, 0);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<key_strengths.length;i++)
        unorderedList.add(new ListItem(new Chunk(key_strengths[i],content)));
        document.add(subhd);
        document.add(unorderedList);
        subhd=new Chunk("\nProfessional Qualifications Summary",heading);
        subhd.setUnderline(1f,0);
        document.add(subhd);
        Chunk subhd1=new Chunk("\nHuman Resource Administration/management: \n",heading1);
        document.add(subhd1);
        Chunk b1=new Chunk("Review of company human resource requirements and needs as well as management and the administration of the same.",content);
        document.add(b1);
        subhd1=new Chunk("\nIT Skills:\n",heading1);
        document.add(subhd1);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<IT_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(IT_skills[i],content)));
        document.add(unorderedList);
        subhd= new Chunk("\nEducational Background\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new LineSeparator(2f,110,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Paragraph p1= new Paragraph(Mba_year,heading);
        Paragraph p2= new Paragraph(Mba_univ,heading);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Chunk c1= new Chunk("Passed MBA in "+Mba_division+" class honors",content);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Project report on "+Mba_proj,content)));
        document.add(unorderedList);
        p1= new Paragraph(Grad_year,heading);
        p2= new Paragraph(Grad_univ,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed Graduation in "+Grad_division+" class honors",content);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Project report on "+Mba_proj,content)));
        document.add(unorderedList);
        p1= new Paragraph(sss_year,heading);
        p2= new Paragraph(sss_name,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed "+sss_Board+"with "+sss_percent+"%",content);
        unorderedList = new List(List.UNORDERED);
        p1= new Paragraph(hss_year,heading);
        p2= new Paragraph(hss_name,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed "+hss_Board+"with "+hss_percent+"%",content);
        unorderedList = new List(List.UNORDERED);
        document.close();
    }

    



public void createMBA() throws IOException, DocumentException{                                         
        Grad_univ=mba.grad_univ;
        Grad_year=mba.grad_year;
        Grad_division=mba.grad_cgpa;
        Mba_univ=mba.mba_univ;
        Mba_year=mba.mba_year;
        Mba_division=mba.mba_cgpa;
        career_objective=mba.career_objective;
        Grad_proj=mba.min_proj;
        Mba_proj= mba.maj_proj;
key_strengths=mba.prof_traits;
IT_skills=mba.comp_skills;
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
    language=b.language;
hss_percent=b.hss_percent;
sss_percent=b.sss_percent;
hobbies=b.hobbies;
mar_status=b.mar_status;
f_name=b.f_name;
personal_traits=b.personal_traits;
        RESULT= System.getProperty("java.io.tmpdir")+"aa0112422vssssvvvmnmnmnablc.pdf";
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        document.setPageSize(PageSize.LETTER);
        document.setMargins(36, 72, 108, 180);
        document.setMarginMirroring(false);
        // step 3
        document.open();
        // step 4
        
         //Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        //rect.setBorder(Rectangle.BOX);
        //rect.setBorderWidth(3);
        //rect.setBorderColor(BaseColor.BLACK);
        //document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC, BaseColor.BLACK);
        Paragraph info1= new Paragraph(name+"\n\n",f1);
        info1.setAlignment(Element.ALIGN_LEFT);
        document.add(info1);
        document.add(new LineSeparator(2f,110,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font f2= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
        Paragraph info= new Paragraph("\n"+email+"\n\n"+phone_num+"\n",f2);
        document.add(info);
        document.add(new Chunk("\n"));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
        Font heading1= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("Career Objective ",heading);
        subhd.setUnderline(1f, 0);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        subhd= new Chunk("\n Key Competencies\n",heading);
        subhd.setUnderline(1f, 0);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<key_strengths.length;i++)
        unorderedList.add(new ListItem(new Chunk(key_strengths[i],content)));
        document.add(subhd);
        document.add(unorderedList);
        subhd=new Chunk("\nProfessional Qualifications Summary",heading);
        subhd.setUnderline(1f,0);
        document.add(subhd);
        Chunk subhd1=new Chunk("\nHuman Resource Administration/management: \n",heading1);
        document.add(subhd1);
        Chunk b1=new Chunk("Review of company human resource requirements and needs as well as management and the administration of the same.",content);
        document.add(b1);
        subhd1=new Chunk("\nIT Skills:\n",heading1);
        document.add(subhd1);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<IT_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(IT_skills[i],content)));
        document.add(unorderedList);
        subhd= new Chunk("\nEducational Background\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new LineSeparator(2f,110,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Paragraph p1= new Paragraph(Mba_year,heading);
        Paragraph p2= new Paragraph(Mba_univ,heading);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Chunk c1= new Chunk("Passed MBA in "+Mba_division+" class honors",content);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Project report on "+Mba_proj,content)));
        document.add(unorderedList);
        p1= new Paragraph(Grad_year,heading);
        p2= new Paragraph(Grad_univ,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed Graduation in "+Grad_division+" class honors",content);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Project report on "+Mba_proj,content)));
        document.add(unorderedList);
        p1= new Paragraph(sss_year,heading);
        p2= new Paragraph(sss_name,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed "+sss_Board+"with "+sss_percent+"%",content);
        unorderedList = new List(List.UNORDERED);
        p1= new Paragraph(hss_year,heading);
        p2= new Paragraph(hss_name,heading);
        table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(p1);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(p2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        c1= new Chunk("Passed "+hss_Board+"with "+hss_percent+"%",content);
        unorderedList = new List(List.UNORDERED);
        document.close();

}
}