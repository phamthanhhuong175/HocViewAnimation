package phamthanhhuong.com.hocviewanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyAlphaAnimation(View view) {
        Button btnAlpha =findViewById(R.id.btnAlpha);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        btnAlpha.startAnimation(animation);
    }

    public void xuLySacleAnimation(View view) {
        Button btnScale=findViewById(R.id.btnSacle);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        btnScale.startAnimation(animation);
    }

    public void xuLyTranslateAnimation(View view) {
        Button btnTranslate=findViewById(R.id.btnTranslate);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.translate_amination);
        btnTranslate.startAnimation(animation);
    }

    public void xuLyRotateAnimation(View view) {
        Button btnRotate=findViewById(R.id.btnRotate);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        btnRotate.startAnimation(animation);
    }

    public void xuLyTongHopAnimation(View view) {
        Button btnTongHop=findViewById(R.id.btnTongHop);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.tonghop_hieuung);
        btnTongHop.startAnimation(animation);
    }

    public void xuLyExit(View view) {
        Button btnExit=findViewById(R.id.btnExit);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate_exit);
        btnExit.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
