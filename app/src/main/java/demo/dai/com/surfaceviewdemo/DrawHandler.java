package demo.dai.com.surfaceviewdemo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/**
 * Created by dai on 2017/7/18.
 */

public class DrawHandler extends Handler {
    public static final int START_DRAW_KEY = 0x01;
    public static final int STOP_DRAW_KEY = 0x02;

    private DrawInterface drawInterface;

    public DrawHandler(Looper looper, DrawInterface drawInterface) {
        super(looper);
        this.drawInterface = drawInterface;
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case START_DRAW_KEY:
                drawInterface.startDraw();
                break;
            case STOP_DRAW_KEY:
                drawInterface.stopDraw();
                break;
        }
    }
}
