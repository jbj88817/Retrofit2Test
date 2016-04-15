package com.treehouse.android.retrofitworkshop.api;

/**
 * Created by bojiejiang on 4/14/16.
 */
public interface Imgur {

    String IMGUR_BASE_URL = "https://api.imgur.com";
    String IMGUR_CLIENT_ID = "a9c73bf3767b193";
    String AUTHORIZATION_URL = IMGUR_BASE_URL + "/oauth2/authorize?client_id=" + IMGUR_CLIENT_ID +
            "&response_type=token";
    String REDIRECT_URL = "https://bojie:88";



}
