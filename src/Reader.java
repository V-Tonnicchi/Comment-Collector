import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader 
{
    String divider = "#####";
    String txtFile;
    ArrayList<String[]> commentList = new ArrayList<>();

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
            if(!scan.nextLine().equals(divider) && !scan.nextLine().equals("Replies:")) //Wenn nächste Line nicht '#####' oder REPLY ist.
            {
                //Zeilen jeweils in Strings speichern
                scan.next();
                String type = scan.nextLine();
                String user = scan.nextLine();
                String userURL = scan.nextLine();
                scan.next();
                scan.next();
                String stats = scan.nextLine();
                String comment = scan.nextLine();
                if(!scan.nextLine().equals("\s"))
                {
                    while(!scan.nextLine().equals("\s"))
                    {
                        comment = comment + " " + scan.nextLine();  
                    }
                }
                scan.next();

                String[] finalStrings = {type, user, userURL, stats, comment};
                commentList.add(finalStrings);

            }
            else if(!scan.nextLine().equals(divider) && scan.nextLine().equals("Replies:")) //Fall: Reply
            {
                scan.next();
                String type = scan.nextLine();
                String user = scan.nextLine();
                String userURL = scan.nextLine();
                scan.next();
                scan.next();
                String stats = scan.nextLine();
                String comment = scan.nextLine();
                if(!scan.next().equals("\s"))
                {
                    while(!scan.nextLine().equals("\s"))
                    {
                        comment = comment + " " + scan.next();
                    }
                }
                scan.next();

                String[] finalStrings = {type, user, userURL, stats, comment};
                commentList.add(finalStrings);
            }
        scan.next();    
        }while(scan.hasNextLine());
        //Solange File eine nächste Line hat
        scan.close();
    }
}
