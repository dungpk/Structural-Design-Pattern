import java.io.File;

public class FileDownloader implements Downloader{
    @Override
    public void download(String URL){
        System.out.println("use URL: "+URL);
    }
}
