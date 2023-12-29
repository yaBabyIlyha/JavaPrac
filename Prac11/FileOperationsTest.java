public class FileOperationsTest {
    public static void main (String[] args) {

        FileOperations f_op = new FileOperations("test.txt");

        f_op.FileWriter();
        f_op.FileWriterAppend();
        f_op.FileReader();

    }
}
