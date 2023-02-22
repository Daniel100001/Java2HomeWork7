package com.example.java2homework7;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//    EditText editText1 = findViewById(R.id.editpas);
//    EditText editText = findViewById(R.id.editemail);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText passwordEditText = findViewById(R.id.editpas);
        EditText userNameEditText = findViewById(R.id.editemail);
        Button loginButton = findViewById(R.id.g);
        TextView textView1 = findViewById(R.id.vhod);
        TextView textView2 = findViewById(R.id.dhodpro);
        TextView textView3 = findViewById(R.id.reg);
        TextView textView4 = findViewById(R.id.text5);
        TextView textView5 = findViewById(R.id.y);


        // Это для смены цвета кнопки Editpas
        userNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    loginButton.setBackgroundColor(getResources().getColor(R.color.your_highlight_color));
                } else {
                    loginButton.setBackgroundColor(getResources().getColor(R.color.your_highlight_color2));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });





        // это для смены цвета кнопки для editEmail
        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    loginButton.setBackgroundColor(getResources().getColor(R.color.your_highlight_color));
                } else {
                    loginButton.setBackgroundColor(getResources().getColor(R.color.your_highlight_color2));}
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        userNameEditText.addTextChangedListener(new TextWatcher(){

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count){

                // действия, когда вводится какой то текст
                // s - то, что вводится, для преобразования в строку - s.toString()


            }

            @Override
            public void afterTextChanged(Editable editable) {

                // действия после того, как что то введено
                // editable - то, что введено. В строку - editable.toString()
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                // действия перед тем, как что то введено
            }
        });



        TextView clickTextView = findViewById(R.id.text5);

        clickTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("admin") && password.equals("admin") ) {
                    // Действие при успешном входе
                    Toast.makeText(getApplicationContext(), "Успешный вход", Toast.LENGTH_SHORT).show();
                    userNameEditText.setVisibility(View.GONE);
                   passwordEditText.setVisibility(View.GONE);
                    loginButton.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    textView5.setVisibility(View.GONE);

                } else {
                    // Действие при неправильном логине или пароле
                    Toast.makeText(getApplicationContext(), "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}













//// устанавливаем слушатель изменения текста в EditText
//   editText.addTextChangedListener(new TextWatcher() {
//        @Override
//        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            // ничего не делаем
//        }
//
//        @Override
//        public void onTextChanged(CharSequence s, int start, int before, int count) {
//            // проверяем, есть ли символы в EditText
//            if (s.toString().trim().length() > 0) {
//                // меняем цвет кнопки
//                button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//            } else {
//                // сбрасываем цвет кнопки на стандартный
//                button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
//            }
//        }
//
//        @Override
//        public void afterTextChanged(Editable s) {
//            // ничего не делаем
//        }
//    });
//}