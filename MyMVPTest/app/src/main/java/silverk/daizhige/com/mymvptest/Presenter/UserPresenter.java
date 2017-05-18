package silverk.daizhige.com.mymvptest.Presenter;

import android.util.Log;
import android.widget.Toast;

import silverk.daizhige.com.mymvptest.Bean.UserBean;
import silverk.daizhige.com.mymvptest.Model.IUserModel;
import silverk.daizhige.com.mymvptest.Model.UserModel;
import silverk.daizhige.com.mymvptest.View.IUserView;

/**
 * Created by silverk on 2017/5/18.
 */

public class UserPresenter implements IUserPresenter {

    private IUserView userView;
    private IUserModel userModel;

    public UserPresenter(IUserView userView){
        this.userView = userView;
        userModel = new UserModel();
    }

    @Override
    public boolean saveUser() {

        //-1为空
        if (userView.getId()<0 || userView.getUserName() == null || userView.getPsw() == null){
            Log.d("Test", "saveUser: 账号密码不能为空");
            return false;
        }else {
            userModel.setUserInfo(userView.getId(),userView.getUserName(),userView.getPsw());
            Log.d("Test", "saveUser: OK");
            return true;

        }


    }

    @Override
    public boolean loadUser() {

        if (userView.getId()<0){
            System.out.println("获取用户信息失败");
            return false;
        }

        UserBean userBean = userModel.load(userView.getId());

        if (userBean != null){
            userView.setUserName(userBean.getUser());
            userView.setPsw(userBean.getPsw());

            return true;
        }else {
            Log.d("test", "loadUser: 编号为id的用户数据不存在");
            return false;
        }
    }
}
