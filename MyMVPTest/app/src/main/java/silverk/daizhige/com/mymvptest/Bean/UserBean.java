package silverk.daizhige.com.mymvptest.Bean;

/**
 * Created by silverk on 2017/5/18.
 */

 //首先我们需要一个UserBean，用来保存用户信息

public class UserBean {

    public String getUser() {
        return user;
    }

    public String getPsw() {
        return psw;
    }

    private String user;
    private String psw;

    public UserBean(String user,String psw){

        this.user = user;
        this.psw = psw;

    }




}
