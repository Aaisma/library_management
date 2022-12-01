package Module;

public class book {
    String book_name;
    String writer;
    String ISBN;
    String published_date;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public book(String book_name, String writer, String ISBN, String published_date) {
        this.book_name = book_name;
        this.writer = writer;
        this.ISBN = ISBN;
        this.published_date = published_date;
    }

    public void printFormat(){
        System.out.println(this.book_name);
        System.out.println(this.ISBN);
        System.out.println(this.writer);

        System.out.println(this.published_date);


    }

}
