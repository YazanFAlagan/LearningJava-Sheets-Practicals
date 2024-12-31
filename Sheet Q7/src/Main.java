public static void main(String[] args) {

    Book b1 = new Book();
    System.out.println("The First Book (Default Constructor):");
    b1.printBookDetails();

    System.out.println("_______________________________________________________");

    Book b2 = new Book("The Prince", "Nicole Micha-vile");
    System.out.println("The Second Book (Title and Author Constructor):");
    b2.printBookDetails();

    System.out.println("_______________________________________________________");

    Book b3 = new Book("فاتتني صلاة", "إسلام جمال", 100);
    System.out.println("The Third Book (Title, Author, and Price Constructor):");
    b3.printBookDetails();
}