import java.io.FileOutputStream;                           //io package
    public class fileout {
        public static void main(String[] args) {
            try{
                FileOutputStream fout = new FileOutputStream("D:fileout.txt");     //creating file

                String s = "hai iam smily";

                byte b[] = s.getBytes();                   //to convert the string into binary values which is bytestream
                fout. write(b);                            // writes the text

                fout. close();                             //close the file
                System.out.println("success....");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
