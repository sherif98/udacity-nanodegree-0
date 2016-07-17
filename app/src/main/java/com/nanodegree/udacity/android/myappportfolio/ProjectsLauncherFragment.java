package com.nanodegree.udacity.android.myappportfolio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class ProjectsLauncherFragment extends Fragment {


    public ProjectsLauncherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_projects_launcher, container, false);
        setupButtonListeners(rootView);
        return rootView;
    }

    private void setupButtonListeners(View rootView) {
        ButtonClickedListener buttonClickedListener = new ButtonClickedListener();
        rootView.findViewById(R.id.popular_movies).setOnClickListener(buttonClickedListener);
        rootView.findViewById(R.id.stock_hawk).setOnClickListener(buttonClickedListener);
        rootView.findViewById(R.id.build_it_bigger).setOnClickListener(buttonClickedListener);
        rootView.findViewById(R.id.make_material).setOnClickListener(buttonClickedListener);
        rootView.findViewById(R.id.go_ubiquitous).setOnClickListener(buttonClickedListener);
        rootView.findViewById(R.id.capstone).setOnClickListener(buttonClickedListener);
    }

    public static ProjectsLauncherFragment newInstance() {
        return new ProjectsLauncherFragment();
    }

    private class ButtonClickedListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Button clickedButton = (Button) view;
            String toastMessage = getToastMessage(clickedButton);
            makeToast(toastMessage);
        }

        private void makeToast(String toastMessage) {
            Toast.makeText(getActivity(), toastMessage, Toast.LENGTH_SHORT)
                    .show();
        }

        private String getToastMessage(Button clickedButton) {
            return getString(R.string.project_start_toast_msg,
                    clickedButton.getText().toString());
        }
    }
}
