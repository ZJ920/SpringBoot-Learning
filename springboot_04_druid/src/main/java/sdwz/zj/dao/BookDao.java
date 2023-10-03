package sdwz.zj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import sdwz.zj.domain.Book;

import java.util.List;

@Mapper
public interface BookDao extends BaseMapper<Book> {
//    @Select("select * from tbl_book where id = #{id}")
//    List<Book> findById(Integer id);
//
//    @Select("select * from tbl_book")
//    List<Book> findAll();
}
