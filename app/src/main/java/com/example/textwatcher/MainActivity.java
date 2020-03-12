package com.example.textwatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.tv_main);
//        editText.addTextChangedListener(new TextWatcher() {
//            /**
//             * 内容改变前调用
//             * 原有的文本s中，从start开始的count个字符将会被一个新的长度为after的文本替换，注意这里是将被替换，还没有被替换
//             * @param s
//             * @param start
//             * @param count
//             * @param after
//             */
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Log.i("beforeTextChanged",s+"********"+start+"*******"+count+"****"+after);
//            }
//
//            /**
//             * 内容改变过程中调用
//             * 原有的文本s中，从start开始的count个字符替换长度为before的旧文本，注意这里没有将要之类的字眼，也就是说一句执行了替换动作
//             * @param s
//             * @param start
//             * @param before
//             * @param count
//             */
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                Log.i("onTextChanged",s+"********"+start+"****"+before+"*******"+count);
//            }
//
//            /**
//             * 内容改变后调用
//             * @param s 最终内容
//             */
//            @Override
//            public void afterTextChanged(Editable s) {
//                Log.i("afterTextChanged",s.toString());
//            }
//        });
    }
}
