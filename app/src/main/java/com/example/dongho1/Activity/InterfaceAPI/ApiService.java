package com.example.dongho1.Activity.InterfaceAPI;
import com.example.dongho1.Activity.API.SignInRequest;
import com.example.dongho1.Activity.API.SignInResponse;
import com.example.dongho1.Activity.API.SignUpRequest;
import com.example.dongho1.Activity.API.SignUpResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
public interface ApiService {
    @POST("account/login")
    Call<SignInResponse> signIn(@Body SignInRequest request);

    //DangKy
    @POST("account/sign-up")
    Call<SignUpResponse> signUp(@Body SignUpRequest request);

    @GET("account/get-all")
    Call<ResponseBody> getAllCus(@Header("access-token-secret") String content_type);

}

