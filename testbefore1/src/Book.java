public class Book {
    private String Name,ISBN,Price,category,Publisher;
    public Book(){

    }

    public void setName(String newName){
        this.Name=newName;
    }
    public String getName(){
        return this.Name;
    }
    public void setISBN(String newISBN){
        this.ISBN=newISBN;
    }public String getISBN(){
        return this.ISBN;
    }
    public void setPrice(String newPrice){
        this.Price=newPrice;
    }
    public String getPrice(){
        return this.Price;
    }
    public void setCategory(String newcategory){
        this.category=newcategory;
    }
    public String getCategory(){
        return this.category;
    }
    public void setPublisher(String newPublisher){
        this.Publisher=newPublisher;
    }
    public String getPublisher(){
        return this.Publisher;
    }
}
