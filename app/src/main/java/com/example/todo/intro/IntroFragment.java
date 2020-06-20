package com.example.todo.intro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment extends Fragment {

    int pos;

    public IntroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        TextView textView = view.findViewById(R.id.tv_fragment_intro);
        ImageView imageView = view.findViewById(R.id.iv_fragment_intro);
        pos = getArguments().getInt("pos");

        switch (pos) {
            case 0:
                break;
            case 1:
                imageView.setImageResource(R.drawable.intro2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.intro3);
                break;
        }
        return view;
    }
}
