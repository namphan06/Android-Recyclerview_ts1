package book;

public class Book {
    private int resouceId;
    private String title;

    public Book(int resouceId, String title) {
        this.resouceId = resouceId;
        this.title = title;
    }

    public int getResouceId() {
        return resouceId;
    }

    public void setResouceId(int resouceId) {
        this.resouceId = resouceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
