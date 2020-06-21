package ru.payts.materiallessons.lesson5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FabBehavior extends FloatingActionButton.Behavior {


    public FabBehavior(Context context, AttributeSet attrs) {
        super();
    }


    @SuppressLint("RestrictedApi")
    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout,
                               @NonNull FloatingActionButton fab,
                               @NonNull View target, int dxConsumed,
                               int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        super.onNestedScroll(coordinatorLayout, fab, target, dxConsumed, dyConsumed,
                dxUnconsumed, dyUnconsumed, type);
        //child -> Floating Action Button
        final OvershootInterpolator interpolator = new OvershootInterpolator(10.0F);//new LinearInterpolator()
        if (dyConsumed > 0) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
            int fab_bottomMargin = layoutParams.bottomMargin;

            fab.animate().rotation(135.0F).withLayer().setDuration(300L).setInterpolator(interpolator).start();

        } else if (dyConsumed < 0) {
            fab.animate().rotation(0F).withLayer().setDuration(300L).setInterpolator(interpolator).start();
        }

//        if (fab.getVisibility() == View.VISIBLE && dyConsumed > 0) {
//            fab.setVisibility(View.INVISIBLE);
//        } else if (fab.getVisibility() == View.INVISIBLE && dyConsumed < 0) {
//            fab.setVisibility(View.VISIBLE);
//        }
    }

    @Override
    public boolean onStartNestedScroll(
            @NonNull CoordinatorLayout coordinatorLayout,
            @NonNull FloatingActionButton child,
            @NonNull View directTargetChild,
            @NonNull View target,
            int axes,
            int type) {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }
}

