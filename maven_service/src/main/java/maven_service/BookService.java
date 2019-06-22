package maven_service;

import java.util.List;
import maven_domain.Book;

public interface BookService {

	List<Book>findAll();
}
