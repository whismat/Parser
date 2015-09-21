package jesusignacio.es.parser;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jesusignacio on 21/09/15.
 */

public class ActivitySwipeDetector implements View.OnTouchListener {

    static final String logTag = "ActivitySwipeDetector";
    private Activity activity;
    static final int MIN_DISTANCE = 100;
    private float downX, downY, upX, upY;

    public ActivitySwipeDetector(Activity activity){
        this.activity = activity;
    }

    public void onRightSwipe(){
        Log.i(logTag, "RightToLeftSwipe!");
        Toast.makeText(activity, "Izquierda", Toast.LENGTH_SHORT).show();
    }

    public void onLeftSwipe(){
        Log.i(logTag, "LeftToRightSwipe!");
        Toast.makeText(activity, "Derecha", Toast.LENGTH_SHORT).show();
        
    }

    public void onDownSwipe(){
        Log.i(logTag, "onTopToBottomSwipe!");
        Toast.makeText(activity, "Abajo", Toast.LENGTH_SHORT).show();
    }

    public void onUpSwipe(){
        Log.i(logTag, "onBottomToTopSwipe!");
        Toast.makeText(activity, "Arriba", Toast.LENGTH_SHORT).show();
    }

    public boolean onTouch(View v, MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN: {
                downX = event.getX();
                downY = event.getY();
                return true;
            }
            case MotionEvent.ACTION_UP: {
                upX = event.getX();
                upY = event.getY();

                float deltaX = downX - upX;
                float deltaY = downY - upY;

                // swipe horizontal?
                if(Math.abs(deltaX) > Math.abs(deltaY))
                {
                    if(Math.abs(deltaX) > MIN_DISTANCE){
                        // left or right
                        if(deltaX > 0) { this.onRightSwipe(); return true; }
                        if(deltaX < 0) { this.onLeftSwipe(); return true; }
                    }
                    else {
                        Log.i(logTag, "Horizontal Swipe was only " + Math.abs(deltaX) + " long, need at least " + MIN_DISTANCE);
                        return false; // We don't consume the event
                    }
                }
                // swipe vertical?
                else
                {
                    if(Math.abs(deltaY) > MIN_DISTANCE){
                        // top or down
                        if(deltaY < 0) { this.onDownSwipe(); return true; }
                        if(deltaY > 0) { this.onUpSwipe(); return true; }
                    }
                    else {
                        Log.i(logTag, "Vertical Swipe was only " + Math.abs(deltaX) + " long, need at least " + MIN_DISTANCE);
                        return false; // We don't consume the event
                    }
                }

                return true;
            }
        }
        return false;
    }

}