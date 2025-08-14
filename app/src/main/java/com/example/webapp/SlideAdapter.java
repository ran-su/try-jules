package com.example.webapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class SlideAdapter extends FragmentStateAdapter {

    private final List<Slide> slides;

    public SlideAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.slides = SlideContent.getSlides();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Slide slide = slides.get(position);
        return SlideFragment.newInstance(slide.getTitle(), slide.getContent());
    }

    @Override
    public int getItemCount() {
        if (slides == null) {
            return 0;
        }
        return slides.size();
    }
}
