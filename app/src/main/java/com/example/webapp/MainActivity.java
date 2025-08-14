package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Button prevButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        prevButton = findViewById(R.id.prev_button);
        nextButton = findViewById(R.id.next_button);

        viewPager.setAdapter(new SlideAdapter(this));

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                int slideCount = viewPager.getAdapter().getItemCount();
                prevButton.setEnabled(position > 0);
                nextButton.setEnabled(position < slideCount - 1);
            }
        });

        // Set initial button states
        // The onPageSelected callback will be called for the initial page, so this is handled there.
        // We need to set the initial state correctly based on a slide count of more than 0
        if (viewPager.getAdapter().getItemCount() > 0) {
            prevButton.setEnabled(false);
            nextButton.setEnabled(viewPager.getAdapter().getItemCount() > 1);
        } else {
            prevButton.setEnabled(false);
            nextButton.setEnabled(false);
        }
    }
}
