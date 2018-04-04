package com.example.android.codeathon.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.codeathon.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment7.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment7#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment7 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlankFragment7() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment7.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment7 newInstance(String param1, String param2) {
        BlankFragment7 fragment = new BlankFragment7();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_fragment7, container, false);
        TextView textView=view.findViewById(R.id.achievements_fragment_text_view);
        if(Build.VERSION.SDK_INT<Build.VERSION_CODES.N){
            textView.setText(Html.fromHtml("(a) Deemed University Status : The distinguished services of this institution to the nation were recognized when it was given the status of Deemed to be University in 1962 by University Grants Commission.<br/><br/>" +
                    "(b) A Grade : National Accreditation and Assessment Council (NAAC) has accredited university with A grade in 2015.<br/><br/>" +
                    "(c) Centenary Year : Vishwavidyalaya celebrated year 2002 as its centenary year. The Vishwavidyalaya has had phenomenal growth over the past 100 years and now offers 20 UG courses and 17 PG courses in different disciplines. Research programmes leading to the degree of Ph.D. are being run in the fields of Vedic literature, Sanskrit literature, Philosophy, Hindi, English, Psychology, Ancient Indian History Culture & Archaeology, Environmental Science, Physics, Chemistry, Mathematics, Human Consciousness and Yogic Sciences, Botany, Zoology, Microbiology, Computer Sciences and Management Studies.<br/><br/>" +
                    "(d) Membership : Gurukula Kangri Vishwavidyalaya is a Registered autonomous institute. All the degrees conferred by Vishwavidyalaya are recognized by UGC and AICTE wherever required. Gurukula Kangri Vishwavidyalaya is a pride member of Association of Indian Universities and Association of Commonwealth Universities.<br/><br/>" +
                    "Governing Bodies of the Vishwavidyalaya<br/><br/>" +
                    "(a) Board of Management<br/><br/>" +
                    "(b) Academic Council<br/><br/>" +
                    "(c) Finance Committee<br/><br/>"));
        }
        else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            textView.setText(Html.fromHtml("(a) Deemed University Status : The distinguished services of this institution to the nation were recognized when it was given the status of Deemed to be University in 1962 by University Grants Commission.<br/><br/>" +
                    "(b) A Grade : National Accreditation and Assessment Council (NAAC) has accredited university with A grade in 2015.<br/><br/>" +
                    "(c) Centenary Year : Vishwavidyalaya celebrated year 2002 as its centenary year. The Vishwavidyalaya has had phenomenal growth over the past 100 years and now offers 20 UG courses and 17 PG courses in different disciplines. Research programmes leading to the degree of Ph.D. are being run in the fields of Vedic literature, Sanskrit literature, Philosophy, Hindi, English, Psychology, Ancient Indian History Culture & Archaeology, Environmental Science, Physics, Chemistry, Mathematics, Human Consciousness and Yogic Sciences, Botany, Zoology, Microbiology, Computer Sciences and Management Studies.<br/><br/>" +
                    "(d) Membership : Gurukula Kangri Vishwavidyalaya is a Registered autonomous institute. All the degrees conferred by Vishwavidyalaya are recognized by UGC and AICTE wherever required. Gurukula Kangri Vishwavidyalaya is a pride member of Association of Indian Universities and Association of Commonwealth Universities.<br/><br/>" +
                    "<h5>Governing Bodies of the Vishwavidyalaya<h5/><br/><br/>" +
                    "(a) Board of Management<br/><br/>" +
                    "(b) Academic Council<br/><br/>" +
                    "(c) Finance Committee<br/><br/>",Html.FROM_HTML_MODE_COMPACT));
        }
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
