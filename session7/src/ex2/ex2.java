package ex2;

public class ex2 {
    public static void main(String[] args){
        Book bk1 = new Book();

        bk1.setTitle("Java programming");
        bk1.setAuthor("John Doe");
        bk1.setPrice(29.9);

        System.out.println("title: "+bk1.getTitle());
        System.out.println("author: "+bk1.getAuthor());
        System.out.println("price: "+bk1.getPrice());

        bk1.setPrice(35.00);
        System.out.println("gia moi: "+bk1.getPrice());

        bk1.setPrice(-1);
    }
}
