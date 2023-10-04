package sdwz.zj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdwz.zj.domain.Book;

@SpringBootTest
public class IBookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void addTest() {
        Book book = new Book();
        book.setName("测试数据111");
        book.setType("测试数据111");
        book.setDescription("测试数据111");
        iBookService.save(book);
    }

    @Test
    void deleteTest() {
        System.out.println(iBookService.removeById(28));
    }

    @Test
    void updateTest() {
        Book book = new Book();
        book.setId(28);
        book.setName("测试数据1");
        book.setType("测试数据1");
        book.setDescription("测试数据1");

        System.out.println(iBookService.updateById(book));
    }

    @Test
    void findAllTest() {
        System.out.println(iBookService.list());
    }

    @Test
    void findByIdTest() {
        System.out.println(iBookService.getById(7));
    }

    @Test
    void findPageTest() {
        IPage<Book> page = new Page<Book>(1,5);
        iBookService.page(page,null);
    }

}
