
/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{

    private String patientName;
    private int patientAge;
    private String  patientGender;

    Patient (String patientName, int patientAge,String patientGender, String disease)
    {
        this.patientName= patientName;
        this.patientGender= patientGender;
        this.patientAge=patientAge;
        
    }   

  

    public String toString()
    {
        return (patientName+""+patientAge+""+patientGender);
    }

}
