package in.udayj.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.udayj.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
