package bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[]=new ExtBook[2];

        books[0]=new ExtBook("Java","James",2014,"Valgus");
        books[1]=new ExtBook("Oracle","McMillar",2018,"Tänapäev");

        for (int i=0;i<books.length;i++){
            if (books[i].getAuthor()=="James")
            {System.out.println(books[i]);
            System.out.println("Author: "+books[i].getAuthor() +". Publisher: "+books[i].getPublisher());}
        }
    }
}
