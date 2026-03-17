package LAB_7;

class Book {

    String bookID;
    String Title;
    String Author;
    int price;

    Book(String bookID, String Title, String Author, int price)
    {
        this.bookID = bookID;
        this.Title = Title;
        this.Author = Author;
        this.price = price;
    }
}

class Periodical extends Book {

    Periodical(String bookID, String Title, String Author, int price) {
        super(bookID, Title, Author, price);
    }
    
    String Period;

    Periodical(String bookID, String Title, String Author, int price, String Period) {
        super(bookID, Title, Author, price);
        this.Period = Period;
    }

    void changePrice(int newPrice) {
        this.price = newPrice;
    }

    void changePeriod(String newPeriod) {
        this.Period = newPeriod;
    }
}

public class BookManager {
    public static void main(String[] args) {
        
        Periodical pb = new Periodical("AII001", "ABCD", "XYZ", 400, "Daily");

        System.out.println("Before change : " + pb.Period);
        pb.changePeriod("Weekly");
        System.out.println("Changed period : " + pb.Period);

        System.out.println("Before change : " + pb.price);
        pb.changePrice(450);
        System.out.println("Changed price : " + pb.price);
    }
}
