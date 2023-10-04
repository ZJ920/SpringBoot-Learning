package sdwz.zj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import sdwz.zj.domain.Book;

import java.util.List;

public interface BookService {
    boolean add(Book book);
    boolean delete(Integer id);
    boolean update(Book book);
    List<Book> selectAll();
    Book selectById(Integer id);
    //页码、每页数据条数
    List<Book> selectPage(int currentPage,int pageSize);
}

//public interface BookService extends IService<Book> {
//}