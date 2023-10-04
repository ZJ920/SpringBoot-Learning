package sdwz.zj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdwz.zj.dao.BookMapper;
import sdwz.zj.domain.Book;
import sdwz.zj.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean add(Book book) {
        return bookMapper.insert(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public Book selectById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> selectPage(int currentPage, int pageSize) {
        IPage<Book> iPage = new Page<>(currentPage,pageSize);
        iPage = bookMapper.selectPage(iPage, null);
        List<Book> bookList = iPage.getRecords();
        return bookList;
    }
}

//public class BookServiceImpl extends ServiceImpl<BookMapper,Book> implements BookService {
//
//}
