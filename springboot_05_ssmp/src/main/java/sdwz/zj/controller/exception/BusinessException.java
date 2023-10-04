package sdwz.zj.controller.exception;

public class BusinessException extends RuntimeException{
    private boolean flag;

    public BusinessException(){}

    public BusinessException(boolean flag) {
        this.flag = flag;
    }

    public BusinessException(boolean flag, String message) {
        super(message);
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
