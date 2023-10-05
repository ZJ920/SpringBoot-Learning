package sdwz.zj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdwz.zj.dao.BookMapper;
import sdwz.zj.domain.Book;
import sdwz.zj.service.IBookService;

import java.util.List;

@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper,Book> implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage,pageSize);
        page = bookMapper.selectPage(page, null);
        return page;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {

        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();

        //SQL语句动态查询：
        queryWrapper.like(Strings.isNotEmpty(book.getType()),"type", book.getType());
        queryWrapper.like(Strings.isNotEmpty(book.getName()),"name",book.getName());
        queryWrapper.like(Strings.isNotEmpty(book.getDescription()),"description",book.getDescription());

        IPage<Book> page = new Page<>(currentPage,pageSize);
        IPage<Book> bookPage = bookMapper.selectPage(page, queryWrapper);

        return bookPage;
    }
}
