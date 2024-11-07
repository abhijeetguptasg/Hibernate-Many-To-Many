package manyToMany;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String author;
	double price;
	
	@ManyToMany(mappedBy = "books")
	Set<Library> libraries;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book( String name, String author, double price) {
		super();
		
		this.name = name;
		this.author = author;
		this.price = price;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(Set<Library> libraries) {
		this.libraries = libraries;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
