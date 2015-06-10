package com.eleks.voiceassistant.voiceassistantpoc.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Serhiy.Krasovskyy on 10.06.2015.
 */
public class FontsHolder {

    private static final String WEATHER_FONT_NAME = "fonts/weathericons.ttf";
    private static final String ROBOTOMONO_REGULAR = "fonts/RobotoMono-Regular.ttf";
    private static final String ROBOTOMONO_BOLD = "fonts/RobotoMono-Bold.ttf";
    private static Typeface sWeatherIconFont;
    private static Typeface sRobotomonoRegular;
    private static Typeface sRobotomonoBold;
    private final Context mContext;

    public FontsHolder(Context context) {
        this.mContext = context;
    }


    public Typeface getWeatherIconFont() {
        if (sWeatherIconFont == null) {
            sWeatherIconFont = Typeface.createFromAsset(mContext.getAssets(), WEATHER_FONT_NAME);
        }
        return sWeatherIconFont;
    }

    public Typeface getRobotomonoRegular() {
        if (sRobotomonoRegular == null) {
            sRobotomonoRegular = Typeface.createFromAsset(mContext.getAssets(), ROBOTOMONO_REGULAR);
        }
        return sRobotomonoRegular;
    }

    public Typeface getRobotomonoBold() {
        if (sRobotomonoBold == null) {
            sRobotomonoBold = Typeface.createFromAsset(mContext.getAssets(), ROBOTOMONO_BOLD);
        }
        return sRobotomonoBold;
    }
}
