public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownload = new FileDownloader();
    @Override
    public void download(String URL){
        if(URL == "Trang bi cam"){
            throw new RuntimeException("Out of range");
        }
        fileDownload.download("URL: "+URL);
    }
}
