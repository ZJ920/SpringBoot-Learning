package sdwz.zj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sdwz.zj.domain.Book;
import sdwz.zj.service.IBookService;

import java.util.List;

//@Controller
@ResponseBody
@RequestMapping("/books")
public class BookServlet {

    @Autowired
    private IBookService iBookService;

    @PostMapping
    public boolean add(@RequestBody Book book){
        boolean save = iBookService.save(book);
        return save;
    }

    @DeleteMapping("{id}")
    public boolean deleteById(@PathVariable int id){
        boolean removeById = iBookService.removeById(id);
        return removeById;
    }

    @PutMapping
    public boolean updateById(@RequestBody Book book){
        boolean updateById = iBookService.updateById(book);
        return updateById;
    }

    @GetMapping
    public List<Book> selectAll(){
        List<Book> list = iBookService.list();
        return list;
    }

    @GetMapping("{id}")
    public Book selectById(@PathVariable int id){
        Book book = iBookService.getById(id);
        return book;
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        IPage<Book> page = iBookService.getPage(currentPage, pageSize);
        return page;
    }

}
