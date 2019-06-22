package maven_service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import maven_dao.BookDao;
import maven_domain.Book;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao dao;

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
