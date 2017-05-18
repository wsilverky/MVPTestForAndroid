package silverk.daizhige.com.mymvptest.View;

/**
 * Created by silverk on 2017/5/18.
 */

public interface IUserView {

    int getId();//获取id
    String getUserName();//获取username
    String getPsw();//获取psw

    //进行写操作
    void setUserName(String userName);
    void setPsw(String psw);

}
