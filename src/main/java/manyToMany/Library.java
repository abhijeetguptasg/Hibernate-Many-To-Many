package manyToMany;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Library_Book", joinColumns = @JoinColumn(name= "Library_id"),
	inverseJoinColumns = @JoinColumn(name="Book_id"))
	Set<Book> books;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library( String name, String address, Set<Book> books) {
		super();
	
		this.name = name;
		this.address = address;
		this.books = books;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", address=" + address + ", books=" + books + "]";
	}
	
}
