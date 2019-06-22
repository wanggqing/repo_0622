package maven_dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import maven_domain.Book;

public interface BookDao {
	
   @Select("select * from book")
   List<Book>findAll();
}
