package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainJavaActivity extends AppCompatActivity {
    public MainJavaActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaring our widget
        final Button btnSave = findViewById(R.id.btn_save);
        final EditText etName = findViewById(R.id.et_name);
        final TextView tvName = findViewById(R.id.tv_user_name);

        Button btnAdd = findViewById(R.id.btn_add);
        final TextView tvResult = findViewById(R.id.tv_result);

        Button btnSub = findViewById(R.id.btn_sub);
        final TextView tvResultSub = findViewById(R.id.tv_result_sub);

        Button btnMulti = findViewById(R.id.btn_multi);
        final TextView tvResultProd = findViewById(R.id.tv_result_prod);

        Button btnDiv = findViewById(R.id.btn_div);
        final TextView tvResultDiv = findViewById(R.id.tv_result_div);

        //add
        final EditText et_number_one = findViewById(R.id.et_number_one);
        final EditText et_number_two = findViewById(R.id.et_number_two);

        //sub
        final EditText et_number_Sub1 = findViewById(R.id.et_number_Sub1);
        final EditText et_number_Sub2 = findViewById(R.id.et_number_sub2);

        //multi
        final EditText et_number_multi1 = findViewById(R.id.et_number_multi1);
        final EditText et_number_multi2 = findViewById(R.id.et_number_multi2);

        //Div
        final EditText et_number_div1 = findViewById(R.id.et_number_div1);
        final EditText et_number_div2 = findViewById(R.id.et_number_div2);


        // Div button
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = et_number_div1.getText().toString();
                String numberTwo = et_number_div2.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int div = a / b;

//                tvResultDiv.setText(Integer.toString(div));

                if(div != 0) {
                    tvResultDiv.setText(Integer.toString(div));
                }else{
                    tvResultDiv.setText("You cannot have a 0 result");

                }
            }


        });



        //Multi button
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = et_number_multi1.getText().toString();
                String numberTwo = et_number_multi2.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int prod = a * b;

                tvResultProd.setText(Integer.toString(prod));
            }


        });


        // Substraction button
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = et_number_Sub1.getText().toString();
                String numberTwo = et_number_Sub2.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int sub = a - b;

                tvResultSub.setText(Integer.toString(sub));
            }


        });

        //Addition button
        btnAdd.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          String numberOne = et_number_one.getText().toString();
                                          String numberTwo = et_number_two.getText().toString();

                                          int a = Integer.parseInt(numberOne);
                                          int b = Integer.parseInt(numberTwo);

                                          int sum = a + b;

                                          tvResult.setText(Integer.toString(sum));
                                      }


                                  });


                //eventListener for the button
                btnSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = etName.getText().toString();
                        tvName.setText("Zupppp \n" + name + " \nmy man!!!");


                    }
                });


    }
}
