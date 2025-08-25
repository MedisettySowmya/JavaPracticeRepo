package multithreading;

public class FileDownloaderUsingRunnableInterface implements Runnable {

    private String fileName;

    public FileDownloaderUsingRunnableInterface(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + " started (Runnable)...");
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Downloading " + fileName + " (Runnable): " + (i * 20) + "%");
                Thread.sleep(500); // simulate download time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Downloading " + fileName + " completed! (Runnable)");
    }
}
