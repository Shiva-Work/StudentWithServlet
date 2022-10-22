package school;
import java.io.*;
public class StudentBean  implements Serializable{
    private String sId,sName,sGender;
    private int tMarks;
    private float pr;
    public StudentBean(){}
    public void setsId(String sId)
    {
        this.sId=sId;
    }
    public String getsId()
    {
        return sId;
    }
    public void setsName(String sName)
    {
        this.sName=sName;
    }
    public String getsName()
    {
        return sName;
    }public void setsGender(String sGender)
    {
        this.sGender=sGender;
    }
    public String getsGender()
    {
        return sGender;
    }public void settMarks(int tMarks)
    {
        this.tMarks=tMarks;
    }
    public int gettMarks()
    {
        return tMarks;
    }public void setper(float pr)
    {
        this.pr=pr;
    }
    public float getper()
    {
        return pr;
    }

   
}
