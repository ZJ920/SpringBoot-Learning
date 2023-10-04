package sdwz.zj.util;

import lombok.Data;

@Data
public class Result {
    private boolean flag;
    private String message;
    private Object data;

    public Result(){}

    public Result(boolean flag){
        this.flag = flag;
    }

    public Result(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public Result(boolean flag,String message){
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag,String message,Object data){
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
