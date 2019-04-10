public class Main {
    public static void main(String[]args){
        Book bk=new Book();
        bk.setName("HarryPorter");
        System.out.println(bk.getName());
        bk.setCategory("MAGIC");
        System.out.println(bk.getCategory());
        bk.setISBN("5115165489481516");
        System.out.println(bk.getISBN());
        bk.setPrice("899$");
        System.out.println(bk.getPrice());
        bk.setPublisher("JAVA");
        System.out.println(bk.getPublisher());
    }
}
