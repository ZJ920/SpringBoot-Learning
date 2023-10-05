package sdwz.zj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sdwz.zj.controller.exception.BusinessException;
import sdwz.zj.controller.exception.SystemException;
import sdwz.zj.domain.Book;
import sdwz.zj.service.IBookService;
import sdwz.zj.util.Result;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/books")
public class BookServlet1 {

    @Autowired
    private IBookService iBookService;

    @PostMapping
    public Result add(@RequestBody Book book){
        boolean save = iBookService.save(book);
        Result result = new Result(save,null);
        return result;
    }

    @DeleteMapping("{id}")
    public Result deleteById(@PathVariable int id){
        boolean removeById = iBookService.removeById(id);
        Result result = new Result(removeById,null);
        return result;
    }

    @PutMapping
    public Result updateById(@RequestBody Book book){
        boolean updateById = iBookService.updateById(book);
        Result result = new Result(updateById,null);
        return result;
    }

    @GetMapping
    public Result selectAll(){
        List<Book> list = iBookService.list();
        Result result = new Result(true,list);
        return result;
    }

    @GetMapping("{id}")
    public Result selectById(@PathVariable int id){
        if (id < 1){
            throw new BusinessException(false,"selectById查询输入异常...");
        }
        try {
            //int i = 1/0;
            Book book = iBookService.getById(id);
            // flag=true ？？？？？？？？
            Result result = new Result(true,book);
            return result;
        } catch (Exception e) {
            throw  new SystemException(false,"selectById查询系统异常...");
        }
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        System.out.println("经过getPage1");
//        IPage<Book> page = iBookService.getPage(currentPage, pageSize);
//        Result result = new Result(true,page);
//        return result;
//    }

    //selectConditional
    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        System.out.println("经过getPage2");
        System.out.println("使用了getPage方法");
        IPage<Book> page = iBookService.getPage(currentPage, pageSize, book);
        Result result = new Result(true,page);
        return result;
    }

}
