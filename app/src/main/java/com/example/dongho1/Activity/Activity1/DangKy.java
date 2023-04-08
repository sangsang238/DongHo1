package com.example.dongho1.Activity.Activity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dongho1.Activity.API.RetrofitService;
import com.example.dongho1.Activity.API.SignUpRequest;
import com.example.dongho1.Activity.API.SignUpResponse;
import com.example.dongho1.Activity.InterfaceAPI.ApiService;
import com.example.dongho1.R;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DangKy extends AppCompatActivity {

    CardView nutTrangChu,nutNext;
    EditText email, password, name, phone, address;
    TextView txtSignin;
    public static String tokenUser="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        AnhXa();
        AddItem();
        ApiService apiService = RetrofitService.getRetrofit().create(ApiService.class);

        nutTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TrangChu.class);
                v.getContext().startActivity(intent);
            }
        });

        txtSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DangNhap.class);
                v.getContext().startActivity(intent);
                Toast.makeText(DangKy.this, "dang nhap", Toast.LENGTH_SHORT).show();
            }
        });

        // bấm nút
        nutNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUpRequest signUpRequest = new SignUpRequest(email.getText().toString(), password.getText().toString(),name.getText().toString(), phone.getText().toString(),address.getText().toString());

                Call<SignUpResponse> signUpCall = apiService.signUp(signUpRequest);
                // gài đk
                signUpCall.enqueue(new Callback<SignUpResponse>() {
                    @Override
                    public void onResponse(Call<SignUpResponse> call, Response<SignUpResponse> response) {
                        if (response.isSuccessful()) {
                            SignUpResponse signUpResponse= response.body();
                            Intent intent = new Intent(v.getContext(), DangNhap.class);
                            v.getContext().startActivity(intent);
                            tokenUser = signUpResponse.getToken();
                            Call<ResponseBody> getallCall = apiService.getAllCus(tokenUser);
                            getallCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    ResponseBody rsponse= response.body();
                                    System.out.println(rsponse.toString());
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {

                                }
                            });

                        } else {

                            Toast.makeText(DangKy.this, "Lỗi máy chủ, xin thử lại sau.", Toast.LENGTH_SHORT).show();
                            // handle error
                        }
                    }

                    @Override
                    public void onFailure(Call<SignUpResponse> call, Throwable t) {
                        // handle failure
                    }
                });
            }
        });

    }


    private void AnhXa() {
        nutTrangChu = (CardView) findViewById(R.id.btnTrangChu);
        nutNext = (CardView) findViewById(R.id.btnNext_dangky);
        txtSignin = (TextView) findViewById(R.id.signin_dangky);
        email = (EditText) findViewById(R.id.email_dangky);
        password = (EditText) findViewById(R.id.password_dangky);
        name = (EditText) findViewById(R.id.name_dangky);
        phone = (EditText) findViewById(R.id.phone_dangky);
        address = (EditText) findViewById(R.id.address_dangky);
    }

    private void AddItem() {
        email.setText("dangthanhsang@gmail.com");
        password.setText("sang123456");
        name.setText("dangthanhsang");
        phone.setText("0832131102");
        address.setText("HCM");
    }

}