package com.example.exam_p2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class ArrowView extends View {
    private Paint paint;
    private int arrowCount = 0;
    private final int arrowSize = 100;
    private final int arrowStrokeWidth = 15;

    public ArrowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(0xFFFFA500);
        paint.setStrokeWidth(arrowStrokeWidth);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int startX = 50;
        int startY = getHeight() / 2;

        for (int i = 0; i < arrowCount; i++) {
            drawChevron(canvas, startX + i * (arrowSize + 20), startY);
        }
    }

    private void drawChevron(Canvas canvas, int startX, int startY) {
        Path path = new Path();
        path.moveTo(startX, startY - arrowSize / 2);
        path.lineTo(startX + arrowSize, startY);
        path.lineTo(startX, startY + arrowSize / 2);
        canvas.drawPath(path, paint);
    }

    public void incrementArrowCount() {
        arrowCount++;
        invalidate();
    }

    public void resetArrowCount() {
        arrowCount = 0;
        invalidate();
    }
}
