package programmerzamannow.lombok;

import lombok.Cleanup;

import java.io.FileReader;
import java.util.Scanner;

public class FileHelper {


    /// CARA MANUAL
//    public static String loadFile(String file) throws Exception{
//        FileReader fileReader = null;
//
//        try {
//            fileReader = new FileReader(file);
//            Scanner scanner = null;
//            try {
//                scanner = new Scanner(fileReader);
//            }finally {
//                if (scanner != null){
//                    scanner.close();
//                }
//            }
//
//        }finally {
//            if (fileReader != null){
//                fileReader.close();
//            }
//        }
//
//    }

        public static String loadFile(String file) throws Exception{
        @Cleanup FileReader fileReader = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }
        return builder.toString();



    }

}
