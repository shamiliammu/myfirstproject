package com.example.elavarsan.myfirstproject;

import android.accounts.Account;
import android.app.Activity;
import android.os.AsyncTask;

import java.io.IOException;

public class GetTokenTask /*extends AsyncTask<Void, Void, Void>*/ {
//    Activity mActivity;
//    String mScope;
//    Account mAccount;
//    int mRequestCode;
//
//    GetTokenTask(Activity activity, Account account, String scope, int requestCode) {
//        this.mActivity = activity;
//        this.mScope = scope;
//        this.mAccount = account;
//        this.mRequestCode = requestCode;
//    }
//
//    protected Void doInBackground(Void... params) {
//        try {
//            String token = fetchToken();
//            if (token != null) {
//                ((MainActivity) mActivity).onTokenReceived(token);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    protected String fetchToken() throws IOException {
//        String accessToken;
//        try {
//            accessToken = GoogleAuthUtil.getToken(mActivity, String.valueOf(mAccount), mScope);
//            GoogleAuthUtil.invalidateToken(mActivity, accessToken); // used to remove stale tokens.
//            accessToken = GoogleAuthUtil.getToken(mActivity, String.valueOf(mAccount), mScope);
//            return accessToken;
//        } catch (UserRecoverableAuthException userRecoverableException) {
//            mActivity.startActivityForResult(userRecoverableException.getIntent(), mRequestCode);
//        } catch (GoogleAuthException fatalException) {
//            fatalException.printStackTrace();
//        }
//        return null;
//
//    }

}