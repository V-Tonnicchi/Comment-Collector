import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader 
{
    String divider = "#####";
    String txtFile;
    ArrayList<String[]> commentList;

    public Reader(String src)
    {
        this.txtFile = src;
    }

    public void ReadComments() throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File(txtFile));
        // TODO: Logik für das seperieren der comments in Array
        for(int i = 0; i < 10; i++)
        {
            scan.next();
        }
        //do:
        do
        {
            if(!scan.nextLine().equals(divider)) //Wenn nächste Line nicht '#####' oder REPLY ist.
            {
                //Zeilen jeweils in Strings speichern
                String space1 = scan.nextLine();
                String type = scan.nextLine();
                String user = scan.nextLine();
                String userURL = scan.nextLine();
                String space2 = scan.nextLine();
                String videoURL = scan.nextLine();
                String stats = scan.nextLine();
                String comment = scan.nextLine(); //Fall von Zeilenübergreifenden Kommentaren nicht berücksichtigt
                String space3 = scan.nextLine();
                //TODO: Relevante Strings in ein Array speichern.

                //String-Array in ArrayList speichern

            }
            else if(true) //Fall: Reply
            {
                //TODO
                //Eventuell seperate methode für übersichtlichekeit?
            }
        scan.next();    
        }while(scan.hasNextLine());
        //Solange File eine nächste Line hat
        scan.close();
    }
}
