package me.gungunpriatna.mynavigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HalamanFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HalamanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HalamanFragment extends Fragment {

    static final String TAG = HalamanFragment.class.getSimpleName();

    public static final String EXTRAS = "extras";

    public HalamanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_halaman, container, false);

        TextView textView = (TextView) view.findViewById(R.id.tv_fragment);

        String halaman = getArguments().getString(EXTRAS);
        textView.setText(halaman);

        Log.e(TAG, "onCreateView: halaman fragment "+ halaman );
        return view;
    }

}
