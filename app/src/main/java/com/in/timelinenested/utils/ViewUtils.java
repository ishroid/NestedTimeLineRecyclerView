package com.in.timelinenested.utils;

import android.view.View;
import android.widget.RelativeLayout;

import com.in.timelinenested.R;

/**
 * Created by ishratkhan on 26/02/16.
 */
public class ViewUtils {

    public static void handleVerticalLines(View v2, View v3) {

        RelativeLayout.LayoutParams pram = new RelativeLayout.LayoutParams(3, RelativeLayout.LayoutParams.MATCH_PARENT);
        pram.setMarginStart(ViewUtils.getLevelOneMargin());
        v2.setLayoutParams(pram);

        RelativeLayout.LayoutParams pram2 = new RelativeLayout.LayoutParams(3, RelativeLayout.LayoutParams.MATCH_PARENT);
        pram2.setMarginStart(getLevelTwoMargin());
        v3.setLayoutParams(pram2);
    }

    public static int getLevelOneMargin() {
        return 100;
    }

    public static int getLevelTwoMargin() {
        return 200;
    }
}
