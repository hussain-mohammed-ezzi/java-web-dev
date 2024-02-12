import java.net*;
import java.io*;
import javax.swing*;
public class ServerReadNetEx{
 public static void main(String args[]){
   try{
     // create a server socket \
     ServerSocket ss = new ServerSocket(2222);
     System.out.println('Server Started')
     /// loop back to the accept method nad wait for the clikent to file a connection request , so server will continously listen for the reauest\
     while(true){
       Socket s = ss.accept();
       System.out.Println('conncetion request recived');
       /// Get IO stream 
       InputStream is = s.getInputStream();
       // attaching ObjectOutputStream over input stream 
        ObjectInputStream ois = new ObjectInputStream(is);
        // read PerosnInfo object from network 
        PersonInfo p =(PersonInfo)ois.readObject(is);
      p.printPersonInfo();
      // closing communication socket 
      s.close()
       
      
     } 



  
    // end while 
    catch(Exception ex) {
     system.out.println(ex);
    }
   }
 } 
}
