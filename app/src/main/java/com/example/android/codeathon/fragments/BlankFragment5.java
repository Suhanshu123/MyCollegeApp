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
 * {@link BlankFragment5.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlankFragment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment5.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment5 newInstance(String param1, String param2) {
        BlankFragment5 fragment = new BlankFragment5();
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
        View view= inflater.inflate(R.layout.fragment_blank_fragment5, container, false);
        TextView textView=view.findViewById(R.id.history_fragment_text_view);
        if(Build.VERSION.SDK_INT<Build.VERSION_CODES.N){
            textView.setText(Html.fromHtml("Gurukula Kangri Vishwavidyalaya was founded on March 4, 1902 by Swami" +
                    " Shraddhanandaji with the sole aim to revive the ancient Indian Gurukula System of education, on the bank " +
                    "of Ganges at a distance of about 6 km. from Hardwar and about 200 km. from Delhi.<br/><br/> This institution was " +
                    "established with the objective of providing an indigenous alternative to Lord Macaulay’s education policy by" +
                    " imparting education in the areas of vedic literature, Indian philosophy, Indian culture, modern sciences" +
                    " and research.It is a deemed to be university fully funded by UGC/Govt. of India.\n" +
                    "\n" +
                    "Arya Samaj has been advocating women’s education since the day it was founded.<br/><br/>  As part of its policies for " +
                    "the up-liftment of women in the country, Kanya Gurukula Campus, Dehradun was established in 1922 by" +
                    " Acharya Ramdevji as a second campus of women’s education. To give real shape to the dreams of " +
                    "Swami Shraddhanandaji, Kanya Gurukula Campus, Hardwar was established in 1993.\n<br/><br/> " +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Gurukula has witnessed many distinguished guests in its journey till date. To name a few of them " +
                    "are Mr.C.F. Andrews, Former Prime Minister of Britain, Mr. Remjy Mcdonald, Mahatma Gandhi," +
                    " Pt. Madan Mohan Malviya, Dr. Rajendra Prasad, Dr Radha Krishnan, Sh.Jamnalal Bajaj,Dr. Munje, " +
                    "Sadhu Vaswani,Pt. Jawahar Lal Nehru, Smt. Indira Gandhi and Sh.Gyani Jail Singh, Sh.L.K.Advani and" +
                    " recently in 2011 Smt.Meira Kumar, Speaker Lok Sabha visited the vishwavidyalaya."));
        }
        else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            textView.setText(Html.fromHtml("Gurukula Kangri Vishwavidyalaya was founded on March 4, 1902 by Swami" +
                    " Shraddhanandaji with the sole aim to revive the ancient Indian Gurukula System of education, on the bank " +
                    "of Ganges at a distance of about 6 km. from Hardwar and about 200 km. from Delhi.<br/><br/> This institution was " +
                    "established with the objective of providing an indigenous alternative to Lord Macaulay’s education policy by" +
                    " imparting education in the areas of vedic literature, Indian philosophy, Indian culture, modern sciences" +
                    " and research.It is a deemed to be university fully funded by UGC/Govt. of India.\n" +
                    "\n" +
                    "Arya Samaj has been advocating women’s education since the day it was founded.<br/><br/>  As part of its policies for " +
                    "the up-liftment of women in the country, Kanya Gurukula Campus, Dehradun was established in 1922 by" +
                    " Acharya Ramdevji as a second campus of women’s education. To give real shape to the dreams of " +
                    "Swami Shraddhanandaji, Kanya Gurukula Campus, Hardwar was established in 1993.\n<br/><br/> " +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Gurukula has witnessed many distinguished guests in its journey till date. To name a few of them " +
                    "are Mr.C.F. Andrews, Former Prime Minister of Britain, Mr. Remjy Mcdonald, Mahatma Gandhi," +
                    " Pt. Madan Mohan Malviya, Dr. Rajendra Prasad, Dr Radha Krishnan, Sh.Jamnalal Bajaj,Dr. Munje, " +
                    "Sadhu Vaswani,Pt. Jawahar Lal Nehru, Smt. Indira Gandhi and Sh.Gyani Jail Singh, Sh.L.K.Advani and" +
                    " recently in 2011 Smt.Meira Kumar, Speaker Lok Sabha visited the vishwavidyalaya.",Html.FROM_HTML_MODE_COMPACT));
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
