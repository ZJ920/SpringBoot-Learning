package sdwz.zj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdwz.zj.domain.Book;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void addTest() {
        Book book = new Book();
        book.setName("测试数据11");
        book.setType("测试数据11");
        book.setDescription("测试数据11");
        bookService.add(book);
    }

    @Test
    void deleteTest() {
        System.out.println(bookService.delete(27));
    }

    @Test
    void updateTest() {
        Book book = new Book();
        book.setId(28);
        book.setName("测试数据111");
        book.setType("测试数据111");
        book.setDescription("测试数据111");
        System.out.println(bookService.update(book));
    }

    @Test
    void findAllTest() {
        System.out.println(bookService.selectAll());
    }

    @Test
    void findByIdTest() {
        System.out.println(bookService.selectById(7));
    }

    @Test
    void findPageTest() {
        bookService.selectPage(2,5);
    }

}
