import com.alibaba.fastjson.JSON;

import java.io.File;
import java.nio.file.Files;

public class MainTest {

    public static void main(String[] args) throws Exception {
        String  filename    = System.getProperty("user.dir") + "/src/main/resources/poc-bcel-37-parseobject.txt";
        String poc = new String(Files.readAllBytes((new File(filename)).toPath() ));

        System.out.println(poc);

        //case 1, ok
//        JSON.parse(poc);

        //case 2, ok
        JSON.parseObject(poc);

        //case 3, no ok
        //JSON.parseObject(poc, User.class);
    }
}

