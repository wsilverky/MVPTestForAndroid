package silverk.daizhige.com.mymvptest.Model;

import android.util.SparseArray;

import silverk.daizhige.com.mymvptest.Bean.UserBean;

/**
 * Created by silverk on 2017/5/18.
 */

public class UserModel implements IUserModel {

    private SparseArray<UserBean> array = new SparseArray<>();

    @Override
    public void setUserInfo(int id, String username, String psw) {
       array.append(id,new UserBean(username,psw));
    }

    @Override
    public UserBean load(int id) {

        if (array.indexOfKey(id) >= 0){
            return array.get(id);
        }else return null;

    }

}
