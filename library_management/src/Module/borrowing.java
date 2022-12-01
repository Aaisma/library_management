package Module;

public class borrowing {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowed_date() {
        return borrowed_date;
    }

    public void setBorrowed_date(String borrowed_date) {
        this.borrowed_date = borrowed_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getFine_rate() {
        return fine_rate;
    }

    public void setFine_rate(int fine_rate) {
        this.fine_rate = fine_rate;
    }

    String id;
    String borrower;
    String borrowed_date;
    String return_date;
    int extra_days;
    int fine_rate;

    public borrowing(String id, String borrower, String borrowed_date, String return_date, int extra_days, int fine_rate) {
        this.id = id;
        this.borrower = borrower;
        this.borrowed_date = borrowed_date;
        this.return_date = return_date;
        this.extra_days = extra_days;
        this.fine_rate = fine_rate;
    }
    public void final_fine(){
        double total_fine= this.extra_days * this.fine_rate;
        System.out.println(total_fine);
    }

}
