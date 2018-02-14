import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileReader in = null;
      FileWriter out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         //in = new FileInputStream("C:\\TRAINING\\SAMPLES3\\input.txt");
         //out = new FileOutputStream("C:\\TRAINING\\SAMPLES3\\output.txt");
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	  System.out.println("Enter input:");
          String input=br.readLine();
          System.out.println("Enter the output");
          String output=br.readLine();
   
    	  in = new FileReader(input);
    	  out = new FileWriter(output);
          
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
            
         }
         System.out.println("File copied....");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}