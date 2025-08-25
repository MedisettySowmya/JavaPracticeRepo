package multithreading;

public class MultiThreadDownload {

	public static void main(String[] args) throws InterruptedException {

		FileDownloader file1 = new FileDownloader("File.pdf");
		FileDownloader file2 = new FileDownloader("File.zip");
		FileDownloader file3 = new FileDownloader("File.mp4");
        // Start downloading all files concurrently
		file1.start();
		file2.start();
		file3.start();
	    // Ensure main thread waits until all downloads finish
        file1.join();
        file2.join();
        file3.join();
        System.out.println("Main thread says: I am done!");
        System.out.println();
        //Implements Runnable Interface
        FileDownloaderUsingRunnableInterface iFile1 = new FileDownloaderUsingRunnableInterface("File.pdf");
        FileDownloaderUsingRunnableInterface iFile2 = new FileDownloaderUsingRunnableInterface("File.zip");
        
        Thread thread1 = new Thread(iFile1);
        Thread thread2 = new Thread(iFile2);
        
        thread1.start();
        thread2.start();
        



	}

}
