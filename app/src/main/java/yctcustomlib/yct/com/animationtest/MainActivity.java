package yctcustomlib.yct.com.animationtest;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageview);

        //帧动画的xml实现方式
        //在xml中定义好资源文件
        //然后在代码中使用
        /*imageView.setBackgroundResource(R.drawable.drawable_anim);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();*/


        //不适用xml资源文件，完全在代码中实现的方式和逻辑
        /*AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i = 1; i <= 4; i++) {
            int id = getResources().getIdentifier("hw_device_guid_omron9200_img_"+i,"drawable",getPackageName());
            Drawable drawable = getDrawable(id);
            animationDrawable.addFrame(drawable,1000);
        }
        imageView.setBackground(animationDrawable);
        animationDrawable.setOneShot(false);
        AnimationDrawable animationDrawableFromBG = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();*/

        //补间动画---旋转（rotate）xml资源文件
        /*Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                Toast.makeText(MainActivity.this,"start",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(MainActivity.this,"end",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(animation);*/

        //补间动画---旋转（rotate）代码实现
        /*RotateAnimation rotateAnimation = new RotateAnimation(0,360);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setFillAfter(true);
        imageView.startAnimation(rotateAnimation);*/


    }
}
