import java.net.*;
import java.io.*;
import javax.swing.*;
// in java there is always a class , becuase classes are loaded into the compiler from the disk , and alll the files are saved as classes in the disk after edditn 
public class ClientWriteNetEx{
  // all things happen in the main fucntion 
  try{
    PersonInfo p = new PersonInfo('ali ' , 'defence'  , '9201211')
    // create a socket communtiant 
      Socket s = new Socket('localhost' , 2222) // its like the adress of teh person adn his fone number 
      // getio streams \
      Outputstream is = s s.getOutputStream();
  // attaching object output stream over INputStream 
  ObjectOutputStream oos = new ObjectOutputStream(is);
  // writing object to the network  , this is the command for al the prepariaont above happend
  oos.writeObject(p)
  // closing the communication socket 
    s.close()
  }catch(Exception ex){
  System.out.println(ex)
  }
}// the class ends herere
