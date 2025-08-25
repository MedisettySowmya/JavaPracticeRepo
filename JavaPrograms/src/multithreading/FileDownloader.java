package multithreading;

public class FileDownloader extends Thread {

	private String fileName;

	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		System.out.println("Downloading " + fileName + " started...");
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Downloading " + fileName + ": " + (i * 20) + "%");
				Thread.sleep(500); // simulate time taken
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Downloading " + fileName + " completed!");

	}
}
