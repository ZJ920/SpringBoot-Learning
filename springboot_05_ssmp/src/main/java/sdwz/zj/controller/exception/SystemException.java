package sdwz.zj.controller.exception;

public class SystemException extends RuntimeException{
    private boolean flag;

    public SystemException(){}

    public SystemException(boolean flag) {
        this.flag = flag;
    }

    public SystemException(boolean flag, String message) {
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
