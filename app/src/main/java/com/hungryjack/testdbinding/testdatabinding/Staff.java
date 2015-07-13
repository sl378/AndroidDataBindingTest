package com.hungryjack.testdbinding.testdatabinding;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by alex.liu on 7/13/2015.
 */
public class Staff extends BaseObservable {
    private String mName;
    private String mEmail;

    public Staff(String name, String email){
        mName = name;
        mEmail = email;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    @Bindable
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}