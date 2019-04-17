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

public class MBA3{
    Connection con=null;
    PreparedStatement preparedStatement=null;
       MBA mba=new MBA();
        Basic b= new Basic();
    BasicInfo i= new BasicInfo();
    String name="Monika Gahlawat";
      String email="monikiagahlawat@gmail.com";
      String street="#66,Sector-1";
      String state="Haryana";
      String city="Zirakpur";
      String gender="female";
      String qualification="MBA";
      int date=4;
      int month= 11;
      int year=1994;
    String phone_num="96469644243";    
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
String f_name="Rambir Singh";
String[] personal_traits= {""};
String Mba_division="9.5";
String Grad_division="9.3";
String Grad_deg="";
String[] Proff_traits={"Excellent interpersonal skills with the ability to work with people at all levels.","Excellent writing, presentation and analytical skills.","High integrity, dynamic and proactive."};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String[] IT_skills={"Proficiency in the use of Microsoft Office applications (i.e.  MS excel, MS word, MS PowerPoint and Outlook).","Concise analytical skills in spreadsheets and their use in relating business cases for optimizing decisions.","Use of different templates in populating customized report such as appraisal reports, evaluating value for money decisions and other tailored reports."};
String Mba_univ="Punjab University";
String Grad_univ="Punjab University";
String Mba_proj="\"The role of IT in human resources.\"for M.B.A based on, Life Insurance Company. L.I.C. (India)";
String Grad_proj="\"Production management\" for B.B.A. based on Saamana daily newspaper (a regional daily newspaper in India.";
String hss_name="Highway Secondary School";
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String[] area_interest={"Website Development","Compiler Design"};
String field="";
String des_maj="Describe your Project\n\n";
String des_min="Describe your Project\n\n";
        String sss_Board="CBSE";
        String sss_name="Consolata Primary School";
        String hss_Board="CBSE";
        String Mba_year="2012";
        String Grad_year="2013";
   public void create() throws DocumentException,IOException{
        RESULT= System.getProperty("java.io.tmpdir")+"n0112422vsablc.pdf";
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
         
        info= new Paragraph("Enthusiastic recent graduate in "+Grad_deg+" with strong analytical, organizational and creative problem-solving skills.",f1);
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
        info= new Paragraph(Grad_univ,heading);
        document.add(info);
        info=new Paragraph("Graduation Degree "+Grad_deg+" "+Grad_year,f1);
        document.add(info);
        info=new Paragraph("CGPA: "+Grad_division,f1);
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
        List unorderedList = new List(List.UNORDERED);
        unorderedList = new List(List.UNORDERED);
         for (String comp_skill : IT_skills) {
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
        for(int i=0;i<Proff_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(Proff_traits[i],f1)));
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
        Chunk subhd= new Chunk("\nGraduation Project: "+Grad_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph();
        document.add(cntnt);
        subhd= new Chunk("MBA Project: "+Mba_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+field,f1);
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
        //cell.enableBorderSide(Rectangle.BOX);
        //cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info=new Paragraph(street+"\n"+city+"\n"+state,f1);
        document.add(info);
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
Proff_traits=mba.prof_traits;
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
RESULT= System.getProperty("java.io.tmpdir")+"n0112422vsdddddmmmmmmmmmmmablc.pdf";
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
         
        info= new Paragraph("Enthusiastic recent graduate in "+Grad_deg+" with strong analytical, organizational and creative problem-solving skills.",f1);
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
        info= new Paragraph(Grad_univ,heading);
        document.add(info);
        info=new Paragraph("Graduation Degree "+Grad_deg+" "+Grad_year,f1);
        document.add(info);
        info=new Paragraph("CGPA: "+Grad_division,f1);
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
        List unorderedList = new List(List.UNORDERED);
        unorderedList = new List(List.UNORDERED);
         for (String comp_skill : IT_skills) {
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
        for(int i=0;i<Proff_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(Proff_traits[i],f1)));
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
        Chunk subhd= new Chunk("\nGraduation Project: "+Grad_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph();
        document.add(cntnt);
        subhd= new Chunk("MBA Project: "+Mba_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+field,f1);
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
        //cell.enableBorderSide(Rectangle.BOX);
        //cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
         info=new Paragraph(street+"\n"+city+"\n"+state,f1);
        document.add(info);
        document.close();
}
}