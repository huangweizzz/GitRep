package Bean;


public class UserQureyVo {
    //在这里包装所需要的查询条件
    //包装其他的查询条件比如 订单 商品....
    private  User user;

    public UserQureyVo() {

    }

    public UserQureyVo(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
