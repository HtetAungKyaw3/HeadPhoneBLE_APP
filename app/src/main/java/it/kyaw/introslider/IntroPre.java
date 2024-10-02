package it.kyaw.introslider;

import android.content.Context;
import android.content.SharedPreferences;

public class IntroPre {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    private static final  String PRE_NAME = "xyz";
    private static final  String IS_FIRST_TIME_LUNCH = "firsttime";

    public  IntroPre(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PRE_NAME,PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setIsFirstTimeLunch(boolean firstTimeLunch){
        editor.putBoolean(IS_FIRST_TIME_LUNCH,firstTimeLunch);
        editor.commit();

    }
    public boolean isFirstTimeLaunch(){
        return preferences.getBoolean(IS_FIRST_TIME_LUNCH,true);
    }
}
