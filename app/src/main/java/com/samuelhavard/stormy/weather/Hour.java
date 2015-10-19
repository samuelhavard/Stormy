package com.samuelhavard.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by samue_000 on 10/16/2015.
 */
public class Hour implements Parcelable{
    private long mTime;
    private String mSummary;
    private double mTemp;
    private String mIcon;
    private String mTimeZone;

    public Hour() { }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemp() {
        return mTemp;
    }

    public void setTemp(double temp) {
        mTemp = temp;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mSummary);
        dest.writeDouble(mTemp);
        dest.writeString(mIcon);
        dest.writeString(mTimeZone);
    }

    private Hour (Parcel in) {
        mTime = in.readLong();
        mSummary = in.readString();
        mTemp = in.readDouble();
        mIcon = in.readString();
        mTimeZone = in.readString();
    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel in) {
            return new Hour(in);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };
}
