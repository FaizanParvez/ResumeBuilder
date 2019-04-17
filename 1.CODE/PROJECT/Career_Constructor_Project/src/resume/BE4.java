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

public class BE4 {
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
String[] area_interest={"Website Development","Compiler Design"};
String[] awards={"Participate in National Level Seminar","Got first prize in Quiz program in the Intra-college competition","Received best student award in HSC"};
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
        RESULT= System.getProperty("java.io.tmpdir")+"0112422vsablmmm.pdf";
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
        
        Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(4);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+email+"\n\n"+phone_num,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("Career Objective: ",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Profile Summary: ",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        List unorderedList = new List(List.UNORDERED);
         for (String x : prof_traits) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Personality Traits: ",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x : personal_traits) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Academia: ",heading);
        subhd.setUnderline(1.5f, 0f);
        Chunk c2= new Chunk("Bachelor of Engineering and Technology,"+univ_be+" with an aggregate of "+be_cgpa+"%",content);
        Chunk c3= new Chunk("HSC with an aggregate of "+hss_percent+"%.",content);
        Chunk c4= new Chunk("SSC with an aggregate of "+sss_percent+"%.",content);
       document.add(rect);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(c2));
        unorderedList.add(new ListItem(c3));
        unorderedList.add(new ListItem(c4));
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Chunk subhd1= new Chunk("Technical Qualifications:",heading);
        subhd1.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: training) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd1);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Projects:",heading);
        subhd.setUnderline(1.5f, 0f);
        c2= new Chunk("Major Project: "+maj_proj+"\nTechnology: "+maj_proj_tech,content);
        c3= new Chunk("Minor Project: "+min_proj+"\nTechnology: "+min_proj_tech,content);
       unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(c2));
        unorderedList.add(new ListItem(c3));
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Achievements:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: awards) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Hobbies:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: hobbies) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(rect);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPersonal Details:",heading);
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
        RESULT= System.getProperty("java.io.tmpdir")+"aaaaaaaaaaa0112422vsablmmm.pdf";
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
        
        Rectangle rect= new Rectangle(33, 40, 580, 750);    //Page Border
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(4);
        rect.setBorderColor(BaseColor.BLACK);
        document.add(rect);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK);
        Font f1= new Font (Font.FontFamily.UNDEFINED, 13, Font.NORMAL, BaseColor.BLACK);
        Paragraph info= new Paragraph(name+"\n\n"+email+"\n\n"+phone_num,f1);
        document.add(info);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Font heading= new Font (Font.FontFamily.TIMES_ROMAN, 16, Font.BOLDITALIC, BaseColor.BLACK);
        Chunk subhd= new Chunk("Career Objective: ",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        Font content= new Font (Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.BLACK);
        Paragraph cntnt= new Paragraph(career_objective,content);
        document.add(cntnt);    //content
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Profile Summary: ",heading);
        subhd.setUnderline(1.5f, 0f);
        document.add(subhd);    //subheading
        List unorderedList = new List(List.UNORDERED);
         for (String x : prof_traits) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Personality Traits: ",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x : personal_traits) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Academia: ",heading);
        subhd.setUnderline(1.5f, 0f);
        Chunk c2= new Chunk("Bachelor of Engineering and Technology,"+univ_be+" with an aggregate of "+be_cgpa+"%",content);
        Chunk c3= new Chunk("HSC with an aggregate of "+hss_percent+"%.",content);
        Chunk c4= new Chunk("SSC with an aggregate of "+sss_percent+"%.",content);
       document.add(rect);
        unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(c2));
        unorderedList.add(new ListItem(c3));
        unorderedList.add(new ListItem(c4));
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        Chunk subhd1= new Chunk("Technical Qualifications:",heading);
        subhd1.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: training) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd1);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Projects:",heading);
        subhd.setUnderline(1.5f, 0f);
        c2= new Chunk("Major Project: "+maj_proj+"\nTechnology: "+maj_proj_tech,content);
        c3= new Chunk("Minor Project: "+min_proj+"\nTechnology: "+min_proj_tech,content);
       unorderedList = new List(List.UNORDERED);
        unorderedList.add(new ListItem(c2));
        unorderedList.add(new ListItem(c3));
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Achievements:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: awards) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("Hobbies:",heading);
        subhd.setUnderline(1.5f, 0f);
        unorderedList = new List(List.UNORDERED);
         for (String x: hobbies) {
             unorderedList.add(new ListItem(new Chunk(x, content)));
         }
        document.add(subhd);
        document.add(unorderedList);
        document.add(rect);
        document.add(new Chunk("\n"));
        document.add(new LineSeparator(5f,100,BaseColor.DARK_GRAY,Element.ALIGN_CENTER,-1f));
        subhd= new Chunk("\nPersonal Details:",heading);
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