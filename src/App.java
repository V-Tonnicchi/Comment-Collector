import java.util.ArrayList;

public class App 
{
    static Reader reader;
    static Writer writer;
    public static void main(String[] args) throws Exception 
    {
        init("C:\\Users\\vtonn\\Documents\\Comment Scraper\\recources\\Comments, (147) Mutant - YouTube (235).txt");
        reader.ReadComments();
        ArrayList<String[]> commentlist = reader.commentList;
        System.out.println(commentlist.toString());
        //writer.ExcelWrite(commentlist);
    }

    public static void init(String src)
    {   
        reader = new Reader(src);
        writer = new Writer();
    }

}
