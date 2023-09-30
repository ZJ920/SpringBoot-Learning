package sdwz.zj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sdwz.zj.pojo.MyDataSource;

@Controller
@ResponseBody
@RequestMapping("/test")
public class TestServlet {

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public MyDataSource test(){
        System.out.println("Test controller running...");
        return myDataSource;
    }
}
