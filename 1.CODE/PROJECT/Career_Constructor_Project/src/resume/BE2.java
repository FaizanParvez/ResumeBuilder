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

public class BE2  {
 
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
String career_objective="Intend to build a challenging career in an esteemed organization with determination and self confidence and give out the best to my organization and become its key player";
String be_year="2016";
String hss="Higher Secondary School";
String sss="Senior Secondary School";
String hss_board="Higher Secondary School Board";
String sss_board="Senior Secondary School Board Board";
String[] strengths={"Team Player","Goal Oriented","Innovative","Ambitious","Willing to learn new things","Good communication skills"};
String[] area_interest={"Website Development","Compiler Design"};
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
String[] key_strengths;
String[] prof_traits={"Willingness to work in team and hard worker.","Ability to deal with people dramatically","Disciplined & good etiquette"};
String[] comp_skills={"Programming Languages :  Java, .NET, PHP","Operating Systems :  Windows XP, Linux, MS-DOS","Packages :  Microsoft Office","RDBMS :  Oracle,MS-SQL server"};
String[] training= {"Undergone certification course in .NET","Successful completion of course in PHP and JSP","HCL Infosystems (July01’2012 – December31’2012)"};
String date_declaration="13-07-2014";
String place_declaration="Chandigarh";
String des_maj="Describe your Project\n\n";
String des_min="Describe your Project\n\n";
    public void create() throws DocumentException,IOException{
        RESULT=  System.getProperty("java.io.tmpdir")+"0mm112422vsabl1.pdf";
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
        rect.setBorderWidth(2);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph(name,font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(phone_num,f1);
        Paragraph addr= new Paragraph(email,f1);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(75);
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
        table = new PdfPTable(1);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        cell = new PdfPCell(new Paragraph(career_objective,content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        title= new Paragraph("PRECISE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        List unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Completed "+qualification+" from "+univ_be+", with specialisation in "+stream+".",content)));        
        for(int i=0;i<personal_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(personal_traits[i],content)));
        document.add(unorderedList);
        title= new Paragraph("EDUCATION",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        table = new PdfPTable(4);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(new Paragraph(qualification+" in "+stream+"\n\n10th\n\n\n12th\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph(univ_be+"\n"+sss+"\n("+sss_board+")\n"+hss+"\n("+hss_board+")",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
                cell = new PdfPCell(new Paragraph(be_year+"\n\n"+sss_year+"\n\n\n"+hss_year+"\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph(be_cgpa+"\n\n"+sss_percent+"\n\n\n"+hss_percent+"\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        document.add(table);
        title= new Paragraph("TECHNICAL KNOWLEDGE BASE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<comp_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(comp_skills[i],content)));
        document.add(unorderedList);
        title= new Paragraph("INDUSTRIAL TRAINING",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<training.length;i++)
        unorderedList.add(new ListItem(new Chunk(training[i],content)));
        document.add(unorderedList);
        title= new Paragraph("PROJECTS UNDERTAKEN",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
               Chunk subhd= new Chunk("\nProject1: "+min_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph("Language of implementation : "+min_proj_tech,content);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph(des_min,content);
        document.add(rect);
        document.add(subhd);
        document.add(cntnt);
                subhd= new Chunk("\nProject2: "+maj_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+maj_proj_tech,content);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_maj,content);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(cntnt);
        title= new Paragraph("ACHIEVEMENTS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(unorderedList);
        title= new Paragraph("INTERESTS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<hobbies.length;i++)
        unorderedList.add(new ListItem(new Chunk(hobbies[i],content)));
        document.add(unorderedList);
        document.add(rect);
        title= new Paragraph("STRENGTHS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<strengths.length;i++)
        unorderedList.add(new ListItem(new Chunk(strengths[i],content)));
        document.add(unorderedList);
        title= new Paragraph("PERSONAL VITAE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
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
    
public     void createBE() {                                         
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
strengths=be.prof_traits;
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
hobbies=b.hobbies;
mar_status=b.mar_status;
f_name=b.f_name;
personal_traits=b.personal_traits;
try{        
    
            RESULT=  System.getProperty("java.io.tmpdir")+"0mm1124aaaaaaaaa22vsabl1.pdf";
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
        rect.setBorderWidth(2);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Paragraph title= new Paragraph(name,font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(phone_num,f1);
        Paragraph addr= new Paragraph(email,f1);
        PdfPTable table = new PdfPTable(2);     //to left align info and right align addr
        table.setWidthPercentage(75);
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
        table = new PdfPTable(1);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        cell = new PdfPCell(new Paragraph(career_objective,content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.enableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(1.5f);
        table.addCell(cell);
        document.add(table);
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        title= new Paragraph("PRECISE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        List unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(new Chunk("Completed "+qualification+" from "+univ_be+", with specialisation in "+stream+".",content)));        
        for(int i=0;i<personal_traits.length;i++)
        unorderedList.add(new ListItem(new Chunk(personal_traits[i],content)));
        document.add(unorderedList);
        title= new Paragraph("EDUCATION",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        table = new PdfPTable(4);     //to left align info and right align addr
        table.setWidthPercentage(100);
        table.spacingAfter();
        cell = new PdfPCell(new Paragraph(qualification+" in "+stream+"\n\n10th\n\n\n12th\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph(univ_be+"\n"+sss+"\n("+sss_board+")\n"+hss+"\n("+hss_board+")",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
                cell = new PdfPCell(new Paragraph(be_year+"\n\n"+sss_year+"\n\n\n"+hss_year+"\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph(be_cgpa+"\n\n"+sss_percent+"\n\n\n"+hss_percent+"\n",content));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.disableBorderSide(Rectangle.BOX);
        cell.setExtraParagraphSpace(0.5f);
        table.addCell(cell);
        document.add(table);
        title= new Paragraph("TECHNICAL KNOWLEDGE BASE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<comp_skills.length;i++)
        unorderedList.add(new ListItem(new Chunk(comp_skills[i],content)));
        document.add(unorderedList);
        title= new Paragraph("INDUSTRIAL TRAINING",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<training.length;i++)
        unorderedList.add(new ListItem(new Chunk(training[i],content)));
        document.add(unorderedList);
        title= new Paragraph("PROJECTS UNDERTAKEN",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
               Chunk subhd= new Chunk("\nProject1: "+min_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        Paragraph cntnt = new Paragraph("Language of implementation : "+min_proj_tech,content);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph(des_min,content);
        document.add(rect);
        document.add(subhd);
        document.add(cntnt);
                subhd= new Chunk("\nProject2: "+maj_proj,heading);
        subhd.setUnderline(1.5f, 0f);
        cntnt = new Paragraph("Language of implementation : "+maj_proj_tech,content);
        document.add(subhd);
        document.add(cntnt);
        subhd= new Chunk("Project Description:",heading);
        cntnt = new Paragraph(des_maj,content);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);
        document.add(cntnt);
        title= new Paragraph("ACHIEVEMENTS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<awards.length;i++)
        unorderedList.add(new ListItem(new Chunk(awards[i],content)));
        document.add(unorderedList);
        title= new Paragraph("INTERESTS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<hobbies.length;i++)
        unorderedList.add(new ListItem(new Chunk(hobbies[i],content)));
        document.add(unorderedList);
        document.add(rect);
        title= new Paragraph("STRENGTHS",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
        for(int i=0;i<strengths.length;i++)
        unorderedList.add(new ListItem(new Chunk(strengths[i],content)));
        document.add(unorderedList);
        title= new Paragraph("PERSONAL VITAE",heading);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);    //subheading
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        unorderedList = new List(List.UNORDERED);
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
        catch(IOException | DocumentException e){}
    }                                        
}
