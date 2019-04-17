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

public class MBA2{
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
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};

        String sss_Board="CBSE";
        String sss_name="Consolata Primary School";
        String hss_Board="CBSE";
        String Mba_year="2012";
        String Grad_year="2013";

   public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"0x112422vsablc.pdf";
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
        
         Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(3);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+qualification+","+"\n\nContact Number: "+phone_num+"\n\nEmail: "+email+"\n\nAddress: "+street+","+city+","+state,f1);
        PdfPTable table = new PdfPTable(1);     //to left align info and right align addr
        table.setWidthPercentage(65);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(new Chunk("\n\n\n"));
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
        Chunk subhd= new Chunk("CAREER OBJECTIVE\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective+"\n",content);
        document.add(cntnt);    //content
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nBASIC ACADEMIC CREDENTIALS\n\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        table = new PdfPTable(4);     //to left align info and right align addr
        table.setWidthPercentage(85);
        table.spacingAfter();
        Font content1= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.BLACK);
        cell = new PdfPCell(new Paragraph("Qualification\n\n"+qualification+"\n\n\nIntermediate\n\nHigh School",content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(new Chunk("\n\n"));
        document.add(rect);
        cell = new PdfPCell(new Paragraph("Board/University\n\n"+Mba_univ+"\n"+sss_Board+"\n\n"+hss_Board,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("Year\n\n"+Mba_year+"\n\n\n"+sss_year+"\n\n"+hss_year,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("Percentage\n\n"+Mba_division+"\n\n\n"+sss_percent+"\n\n"+hss_percent,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPROJECT REPORT",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new Chunk("\n"));
        document.add(new Chunk(Mba_proj,content));
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Chunk subhd1= new Chunk("\n\nIT PROFICIENCY",heading);
        subhd1.setUnderline(1.5f, 0f);
        document.add(subhd1);
        document.add(rect);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<IT_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(IT_skills[i],content)));
        document.add(unorderedList);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        
        unorderedList = new List(List.UNORDERED);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        
        subhd= new Chunk("\nACHIEVEMENTS:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(subhd1);
        document.add(unorderedList);
        
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        document.add(rect);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPERSONAL PROFILE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt= new Paragraph("Name  :   "+name+"\nFather's Name :   "+f_name+"\nDate of Birth   :   "+date+"-"+month+"-"+year+"\nGender :   "+gender+"\nMarital Status  :   "+mar_status+"\nNationality	:  "+nationality+"\nPermanent Address    :   "+street+","+city+","+state+"\nContact Number  :   "+phone_num,content);
        document.add(cntnt);
        subhd= new Chunk("\nDeclaration:",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt =new Paragraph("I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility for the correctness of the above-mentioned particulars.\nDate   :   "+date_declaration+"\nPlace    :   "+place_declaration,content);
        document.add(cntnt);
        document.add(rect);
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
        RESULT= System.getProperty("java.io.tmpdir")+"0x112422sssvsablc.pdf";
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
        
         Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(3);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph("CURRICULUM VITAE\n\n",font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+qualification+","+"\n\nContact Number: "+phone_num+"\n\nEmail: "+email+"\n\nAddress: "+street+","+city+","+state,f1);
        PdfPTable table = new PdfPTable(1);     //to left align info and right align addr
        table.setWidthPercentage(65);
        table.spacingAfter();
        PdfPCell cell = new PdfPCell(info);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(new Chunk("\n\n\n"));
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
        Chunk subhd= new Chunk("CAREER OBJECTIVE\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective+"\n",content);
        document.add(cntnt);    //content
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nBASIC ACADEMIC CREDENTIALS\n\n",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        table = new PdfPTable(4);     //to left align info and right align addr
        table.setWidthPercentage(85);
        table.spacingAfter();
        Font content1= new Font (Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, BaseColor.BLACK);
        cell = new PdfPCell(new Paragraph("Qualification\n\n"+qualification+"\n\n\nIntermediate\n\nHigh School",content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(new Chunk("\n\n"));
        document.add(rect);
        cell = new PdfPCell(new Paragraph("Board/University\n\n"+Mba_univ+"\n"+sss_Board+"\n\n"+hss_Board,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("Year\n\n"+Mba_year+"\n\n\n"+sss_year+"\n\n"+hss_year,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("Percentage\n\n"+Mba_division+"\n\n\n"+sss_percent+"\n\n"+hss_percent,content1));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPROJECT REPORT",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(new Chunk("\n"));
        document.add(new Chunk(Mba_proj,content));
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Chunk subhd1= new Chunk("\n\nIT PROFICIENCY",heading);
        subhd1.setUnderline(1.5f, 0f);
        document.add(subhd1);
        document.add(rect);
        List unorderedList = new List(List.UNORDERED);
        for(int i=0;i<IT_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(IT_skills[i],content)));
        document.add(unorderedList);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        
        unorderedList = new List(List.UNORDERED);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        
        subhd= new Chunk("\nACHIEVEMENTS:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(subhd1);
        document.add(unorderedList);
        
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        document.add(rect);
        //document.add(new LineSeparator(2f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPERSONAL PROFILE",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt= new Paragraph("Name  :   "+name+"\nFather's Name :   "+f_name+"\nDate of Birth   :   "+date+"-"+month+"-"+year+"\nGender :   "+gender+"\nMarital Status  :   "+mar_status+"\nNationality	:  "+nationality+"\nPermanent Address    :   "+street+","+city+","+state+"\nContact Number  :   "+phone_num,content);
        document.add(cntnt);
        subhd= new Chunk("\nDeclaration:",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        cntnt =new Paragraph("I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility for the correctness of the above-mentioned particulars.\nDate   :   "+date_declaration+"\nPlace    :   "+place_declaration,content);
        document.add(cntnt);
        document.add(rect);
        document.close();
}
}