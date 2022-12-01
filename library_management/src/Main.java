import Module.borrowing;
import Module.students;
import Module.book;


public class Main {
    public static void main(String[] args) {

        book iewu = new book("It ends with us", "Colleen Hoover","468901","2nd August, 2016");
        book tkamb = new book("To kill a mocking bird","Harper Lee", "477119","11th July, 1960");

        students bb = new students("Ayden Vulpian", "12", "23089", "9876543210");
        students cc = new students("Charla Ranashinga", "11", "25632", "9840256734");

        borrowing dd = new borrowing("57218", "aa","22nd Aug","4th Oct",0,0);
        borrowing ee = new borrowing("57219", "bb","25th Aug","30th Oct",4,50);

        iewu.printFormat();


    }
    }
