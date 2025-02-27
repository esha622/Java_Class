package Assignment;

class FileDownloader extends Thread {
    private String fileName;

    FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download for: " + fileName);
        try {
            Thread.sleep((long) (Math.random() * 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed download for: " + fileName);
    }
}

public class Concurrency {
    public static void main(String[] args) {
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};

        for (String file : files) {
            FileDownloader downloader = new FileDownloader(file);
            downloader.start();
        }
    }
}