import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            File file1 = new File("./txt/file1.txt");
            File file2 = new File("./txt/file2.txt");
            FileReader lol = new FileReader(file1);
            FileWriter coc = new FileWriter(file2);

            int line;
            while ((line=lol.read())!=-1){
                coc.write(line);
            }
            lol.close();
            coc.close();
        }catch (IOException e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
