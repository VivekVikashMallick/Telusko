
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReader {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException 
    
    {
        System.out.println("Hello, World!");
      
      //  int num = System.in.read();
       // System.out.println("The number is: " + num);
       // this will only read the single doggit number and gives you the answer in ASCII value. 
       //System.out.println("The number is: " + (num - 48)) ;
       

       InputStreamReader in = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(in);
       
       //System.out.println("The number is: " + (num - 48)) ;
        int num = Integer.parseInt(br.readLine());
        System.out.println("The number is: " + num) ;

        br.close();

        // BufferedReader is used to read the data from the input stream in the form of the string. or it is used to read the data from the file as well.
        // InputStreamReader is used to convert the byte stream into the character stream.
        // System.in is used to read the data from the console.

    }
}
