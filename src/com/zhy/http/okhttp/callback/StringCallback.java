package com.zhy.http.okhttp.callback;

import java.io.IOException;

import android.util.Log;

import okhttp3.Response;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class StringCallback extends Callback<String>
{
    @Override
    public String parseNetworkResponse(Response response) throws IOException
    {
    	// Log.d("wellgood", ""+response.body().string());
        return response.body().string();
       
    }

}
