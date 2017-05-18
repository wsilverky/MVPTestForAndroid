package silverk.daizhige.com.mymvptest.Model;


import silverk.daizhige.com.mymvptest.Bean.UserBean;

/**
 * Created by silverk on 2017/5/18.
 */

public interface IUserModel {

    void setUserInfo(int id,String username,String psw);
    UserBean load (int id);//通过id读取user信息，返回userbean


}
