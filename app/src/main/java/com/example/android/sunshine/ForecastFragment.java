package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String[] forecastArray ={
                "Today - Sunny 88/63",
                "Tomorrow - gijasdf 234",
                "weds - 23 243 23  ",
                "Thurs - 234234 ",
                "Friday - asdfwqe4",
                "Saturaday - 2342314",
                "sunday - 2341234"
        };
        List<String> weekforecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

    ArrayAdapter mForecastAdapter= new ArrayAdapter<String>(
               getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekforecast);
       View rootView = inflater.inflate(R.layout.fragment_main, container, false);

       ListView listview =(ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);


        return rootView;//inflater.inflate(R.layout.fragment_main, container, false);
    }
}
