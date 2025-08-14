package com.example.webapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SlideFragment extends Fragment {

    private static final String ARG_TITLE = "arg_title";
    private static final String ARG_CONTENT = "arg_content";

    private String title;
    private String content;

    public SlideFragment() {
        // Required empty public constructor
    }

    public static SlideFragment newInstance(String title, String content) {
        SlideFragment fragment = new SlideFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_CONTENT, content);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            content = getArguments().getString(ARG_CONTENT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slide, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView titleTextView = view.findViewById(R.id.title_textview);
        TextView contentTextView = view.findViewById(R.id.content_textview);

        titleTextView.setText(title);
        contentTextView.setText(content);
    }
}
