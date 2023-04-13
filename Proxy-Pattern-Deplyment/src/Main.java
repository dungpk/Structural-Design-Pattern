import java.io.File;

public class Main {
    public static void main(String[] args) {

        FileDownloaderProxy proxy = new FileDownloaderProxy();
        proxy.download("Trang khong bi cam");
    }
}