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
        tinhsoChan(100);

//        1 phương thức : truyền vào 1 giá trị
//                + Trả về true nếu là số nguyên tố
//                + Trả về false nếu ngược lại

        boolean check = tinhSonguyento(100);
        Log.d("BBB", String.valueOf(check));
    }
    private void tinhsoChan(int size){
        for (int i = 0 ; i< size ; i++){
            if (i % 2 == 0){
                Log.d("BBB", String.valueOf(i));
            }
        }
    }
    private Boolean tinhSonguyento(int number){
        if (number <2) return  false;
        for (int i = 2 ; i < number / 2 ; i++){
            if (number % i == 0) return false;
        }
        return true;
    }


}
