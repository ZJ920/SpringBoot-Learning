package sdwz.zj;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdwz.zj.dao.BookDao;

@SpringBootTest
class Springboot03MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void findByIdTest() {
        System.out.println("通过id查询到："+bookDao.selectById(7));
    }

    @Test
    void findAllTest() {
        System.out.println("查询全部："+bookDao.selectList(null));
    }

}
