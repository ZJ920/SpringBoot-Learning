package sdwz.zj.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import sdwz.zj.domain.Book;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    List<Book> findById(Integer id);

    @Select("select * from tbl_book")
    List<Book> findAll();
}
