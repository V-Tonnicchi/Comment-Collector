public class App 
{
    static Reader reader;
    static Writer writer;
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello World!");
        //init("C:\Users\vtonn\Documents\Comment Scraper\recources\Comments, (147) Mutant - YouTube (235).txt");
        //ArrayList<String> commentlist = reader.ReadComments();
        //writer.ExcelWrite(this.commentlist);
    }

    public static void init(String src)
    {   
        reader = new Reader(src);
        writer = new Writer();
    }

}
