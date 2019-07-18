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
        // phuong thuc :
//            1 : Pham vi hoat dong(access modifer)
//            2 : Giá trị trả về cho phương thức(void cho kiểu dữ không trả về)
//            3 : Khi đặt tên phương thức không nên viết hoa cho hành động
        tinhsoChan(1000);
    }
    private void tinhsoChan(int size){
        for (int i = 0 ; i< size ; i++){
            if (i % 2 == 0){
                Log.d("BBB", String.valueOf(i));
            }
        }
    }

}
