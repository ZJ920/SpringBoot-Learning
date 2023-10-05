package sdwz.zj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sdwz.zj.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
