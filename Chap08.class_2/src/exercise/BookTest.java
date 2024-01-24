package exercise;

class Author {

	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return "Author[ name = " + getName() + ", email = " + getEmail() + ", gender = " + getGender() + "]";
	}

}

class Book {

	private String name;
	private Author author; //포함관계
	private int price;
	private int qty = 0; //책 재고수량

	public Book(String name, Author author, int price) {

		this.name = name;
		this.author = author;
		this.price = price;

	}

	public Book(String name, Author author, int price, int qty) {

		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;

	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {

		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book[ name = " + name + ", " + author.toString() + "], price = " + price + ", qty = " + qty + "]";

	}

}

public class BookTest {

	public static void main(String[] args) {

		Author author = new Author("Bret Spell", "Bspell@nowhere.com", 'm');

		System.out.println(author); //author.toSring()이 생략된 형태

		author.setEmail("jingbo@nowhere.com");

		System.out.println("name is : " + author.getName());
		System.out.println("email is : " + author.getEmail());
		System.out.println("gender is : " + author.getGender());

		Book dummyBook = new Book("Pro JAVA 8 Programming", author, 30000, 99);

		System.out.println(dummyBook);

		dummyBook.setPrice(35000);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor());
		System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

		Book anotherBook = new Book("more Java", new Author("Paul Ahan", "paul@somewhere.com", 'm'), 30000);

		System.out.println(anotherBook);

	}

}
