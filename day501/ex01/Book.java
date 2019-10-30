package pangu.com.day501.ex01;

public class Book {
    private String title;
    private  int pageNum;

    public Book(){

    }
    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNum(int pageNum) {

        if(pageNum>200)pageNum=200;
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }



}
