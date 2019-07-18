package khoapham.ptp.phamtanphat.rulesandroid02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //access modifer : public , private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int tong = tinhTong(5, 6);
        Log.d("BBB", String.valueOf(tong));

    }
    private int tinhTong(int a , int b){
        int ketqua = a + b;
        return ketqua;
    }

}
