import java.io.FileInputStream;                    //importing io packages
public class filein {
    public static void main(String[] args)
    {
        try{
            FileInputStream fin=new FileInputStream("D:filein.txt");     //creating file
            int i;
            while ((i = fin.read()) != -1)              //condition to check whether the file is empty or not
                System.out. println((char) i);
            fin.close();                                //closing file
        }
        catch (Exception e) {
            System.out.println(e);
        }

        }
    }
