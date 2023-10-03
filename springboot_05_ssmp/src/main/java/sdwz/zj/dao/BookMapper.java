package sdwz.zj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sdwz.zj.domain.Book;

//@Mapper
//使用了MyBatisPlus简化开发
public interface BookMapper extends BaseMapper<Book> {
}
