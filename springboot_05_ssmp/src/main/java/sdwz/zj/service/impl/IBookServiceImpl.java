package sdwz.zj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import sdwz.zj.dao.BookMapper;
import sdwz.zj.domain.Book;
import sdwz.zj.service.IBookService;

import java.util.List;

@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper,Book> implements IBookService {


    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage,pageSize);
        page = baseMapper.selectPage(page, null);
        return page;
    }
}
