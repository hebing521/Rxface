package rxface.mrfu.rxface;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import rxface.mrfu.rxface.base.utils.Logger;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_tips)
    TextView tvTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Logger.i("hebing","这是测试版本，发布时看到这条消息说明版本打错了");
        Log.d("hebing","册数");
        Toast.makeText(this,"eeeeeeeee",Toast.LENGTH_LONG).show();


    }

    private void setTextColor(@ColorRes int color){
        tvTips.setTextColor(getResources().getColor(color));
    }
}
