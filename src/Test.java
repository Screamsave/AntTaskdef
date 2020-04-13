
        import java.io.File;
        import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileSorter fileSorter = new FileSorter();
        File myFile = new File("D://ANTTEST//input.txt");
        File myFileout = new File("D://ANTTEST//output.txt");
        fileSorter.setFile(myFile);
        fileSorter.setTofile(myFileout);
        fileSorter.execute();
    }
}
