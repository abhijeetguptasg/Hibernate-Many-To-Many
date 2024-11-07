package manyToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class MainApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("LibraryBook");
		EntityManager em= emf.createEntityManager();
		EntityTransaction transaction= em.getTransaction();
		
		Set<Book> books= new HashSet<>();
//		
//		books.add(new Book("Core Java","Pratiksha", 3000));
//		books.add(new Book("Adv Java","Pooja", 2000));
//		books.add(new Book("Java Script","Omkar",2500));
//		
		Library l1= new Library("City Library", "Swargate", books);
//		Library l2= new Library("Technolearn", "Pune", books);
//		
//		
		
//		em.persist(l1);
//		em.persist(l2);
		
//		System.out.println("Data Inserted");
		//* Read Operation
//		List<Library> libraries= em.createQuery("select l from Library l",Library.class).getResultList();
//		
//		for(Library l:libraries)
//		{
//			System.out.println(l);
//		}
		
		Library l= em.find(Library.class, 1);
		l.setBooks(null);
		transaction.begin();
		em.remove(l);
		transaction.commit();
		
		
	}
}
