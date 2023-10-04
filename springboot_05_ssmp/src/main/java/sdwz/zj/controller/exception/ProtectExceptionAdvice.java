package sdwz.zj.controller.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sdwz.zj.util.Result;

//声明一个异常处理器
@RestControllerAdvice
public class ProtectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(false,"未知异常...");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        return new Result(e.getFlag(),e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getFlag(),e.getMessage());
    }
}
