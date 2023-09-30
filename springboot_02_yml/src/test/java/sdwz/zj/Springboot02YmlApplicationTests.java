package sdwz.zj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdwz.zj.dao.Dao;
import sdwz.zj.dao.impl.DaoImpl;

@SpringBootTest
class Springboot02YmlApplicationTests {

    @Autowired
    private Dao dao;
    @Test
    void findAllTest() {
        dao.findAll();
    }

}
