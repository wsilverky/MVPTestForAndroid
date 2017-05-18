package silverk.daizhige.com.mymvptest.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import silverk.daizhige.com.mymvptest.Base.BaseActivity;
import silverk.daizhige.com.mymvptest.Presenter.IUserPresenter;
import silverk.daizhige.com.mymvptest.Presenter.UserPresenter;
import silverk.daizhige.com.mymvptest.R;

public class UserActivity extends BaseActivity implements IUserView,View.OnClickListener{

    EditText userId ;
    EditText userName ;
    EditText userPsw;

    Button saveBtn;
    Button loadBtn ;

    IUserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

         userId = (EditText)findViewById(R.id.user_id);
         userName = (EditText)findViewById(R.id.user_name);
         userPsw = (EditText)findViewById(R.id.user_psw);

         saveBtn = (Button)findViewById(R.id.save_info_button);
         loadBtn = (Button)findViewById(R.id.load_info_button);

        presenter = new UserPresenter(this);
        saveBtn.setOnClickListener(this);
        loadBtn.setOnClickListener(this);
    }


    //点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.save_info_button:
            {
                if (presenter.saveUser()){
                    this.clear();
                    Toast.makeText(getApplicationContext(),"保存成功",Toast.LENGTH_LONG).show();
                }
                break;
            }
            case R.id.load_info_button:
            {

                if(presenter.loadUser()){
                    Toast.makeText(getApplicationContext(),"加载成功",Toast.LENGTH_LONG).show();

                }
            }
        }

    }

    @Override
    public int getId() {

        if (TextUtils.isEmpty(userId.getText().toString())){
            return -1;
        }
        return Integer.parseInt(userId.getText().toString());
    }

    @Override
    public String getUserName() {
        return userName.getText().toString();
    }

    @Override
    public String getPsw() {
        return userPsw.getText().toString();
    }

    //写入
    @Override
    public void setUserName(String userName) {

        this.userName.setText(userName);
    }

    @Override
    public void setPsw(String psw) {
        this.userPsw.setText(psw);
    }


    private void clear(){
        this.userName.setText(null);
        this.userId.setText(null);
        this.userPsw.setText(null);

    }

}
