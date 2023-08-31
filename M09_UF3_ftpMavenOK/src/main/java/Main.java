
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FtpClient ftp = new FtpClient();
        ftp.open();
        ftp.close();
    }
}
