package sdwz.zj.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdwz.zj.dao.BookMapper;
import sdwz.zj.domain.Book;

@SpringBootTest
class SSMPApplicationTests {


    @Autowired
    private BookMapper bookMapper;

    @Test
    void addTest() {
        Book book = new Book();
        book.setName("测试数据1");
        book.setType("测试数据1");
        book.setDescription("测试数据1");
        bookMapper.insert(book);
    }

    @Test
    void deleteTest() {
        System.out.println(bookMapper.deleteById(26));
    }

    @Test
    void updateTest() {
        Book book = new Book();
        book.setId(12);
        book.setName("测试数据1");
        book.setType("测试数据1");
        book.setDescription("测试数据1");
        System.out.println(bookMapper.updateById(book));
    }

    @Test
    void findAllTest() {
        System.out.println(bookMapper.selectList(null));
    }

    @Test
    void findByIdTest() {
        System.out.println(bookMapper.selectById(7));
    }

    @Test
    void findPageTest() {
        IPage<Book> page = new Page<>(2,5);
        bookMapper.selectPage(page,null);
    }

    @Test
    void getByConditionTest() {
        String name = "spring";
        String type = "计算机理";
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(Strings.isNotEmpty(type),"type",type);
        queryWrapper.like(Strings.isNotEmpty(name),"name",name);

        IPage<Book> page = new Page<>(1,5);
        IPage<Book> bookIPage = bookMapper.selectPage(page, queryWrapper);
        System.out.println(bookIPage.getRecords());
    }

    @Test
    void getByConditionTest2() {
        String name = "spring";
        String type = "计算机理论";
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        //SQL语句动态查询：
        queryWrapper.in(Strings.isNotEmpty(type),"type", type);
        queryWrapper.like(Strings.isNotEmpty(name),"name",name);

        IPage<Book> page = new Page<>(1,5);
        IPage<Book> bookIPage = bookMapper.selectPage(page, queryWrapper);
        System.out.println(bookIPage.getRecords());
    }

}
