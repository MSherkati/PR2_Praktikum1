package alleAufgaben.aufgabe12;

import java.io.FileWriter;
import java.io.IOException;

public class Protokollierer
{
    public static final String DATEIPFAD = "/Users/mojtaba/Documents/8. Semester/PR2/Fragen PR2W.docx";

    public void protokolliere(String eintrag) throws ProtokollierException
    {
        try (FileWriter writer = new FileWriter(DATEIPFAD, true))
        {
            writer.write(eintrag);
        }
        catch (IOException e)
        {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            // throw new ProtokollierException("Man kann nicht reinschreiben!");
        }

    }

}
