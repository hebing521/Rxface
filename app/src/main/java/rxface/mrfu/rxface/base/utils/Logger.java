package rxface.mrfu.rxface.base.utils;

import android.util.Log;

import rxface.mrfu.rxface.BuildConfig;


/**
 * Created by Horse
 * 2017/9/15 16:41
 * Description:
 */

public class Logger {

    /**
     * @return  根据gradle配置，是否处于debug模式，
     * 发布的时候改成false
     */
    private static boolean isDebug(){
        if(BuildConfig.DEBUG_MODE){
            return true;
        }else{
            return false;
        }
    }

    /**
     * tag缺失的时候默认为包名
     */
    private static String TAG = BuildConfig.APPLICATION_ID;

    //===========================我是分割线=======================================//
    public static void d(String message) {
        if(isDebug()){
            Log.d(TAG,message);
        }
    }

    public static void d(String tag, String message) {
        if(isDebug()){
            Log.d(tag,message);
        }
    }

    //===========================我是分割线=======================================//
    public static void e(String message) {
        if(isDebug()){
            Log.e(TAG,message);
        }
    }

    public static void e(String tag, String message) {
        if(isDebug()){
            Log.e(tag,message);
        }
    }

    //===========================我是分割线=======================================//
    public static void i(String message) {
        if(isDebug()){
            Log.i(TAG,message);
        }
    }

    public static void i(String tag, String message) {
        if(isDebug()){
            Log.i(tag,message);
        }
    }

    //===========================我是分割线=======================================//
    public static void w(String message) {
        if(isDebug()){
            Log.w(TAG,message);
        }
    }

    public static void w(String tag, String message) {
        if(isDebug()){
            Log.w(tag,message);
        }
    }

}
