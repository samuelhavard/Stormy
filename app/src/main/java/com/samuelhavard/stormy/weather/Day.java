package com.samuelhavard.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by samue_000 on 10/16/2015.
 */
public class Day {
        private long mTime;
        private String mSummary;
        private double mTempMax;
        private String mIcon;
        private String mTimeZone;

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

        public int getTempMax() {
            return (int) Math.round(mTempMax);
        }

        public void setTempMax(double tempMax) {
            mTempMax = tempMax;
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

    public int getIconId(){
        return Forecast.getIconId(mIcon);
    }
    public String getDayOfTheWeek(){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimeZone));
        Date dateTime = new Date(mTime * 1000);
        return formatter.format(dateTime);
    }

}
