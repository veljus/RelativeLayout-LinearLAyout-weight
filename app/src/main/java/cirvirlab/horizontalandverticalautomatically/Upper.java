package cirvirlab.horizontalandverticalautomatically;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Upper extends Fragment implements View.OnClickListener {
    Button button;
    int count = 0;
    Comm comm;
    public Upper() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upper, container, false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        comm=(Comm)getActivity();
        button =(Button)getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


            super.onCreate(savedInstanceState);
            if(savedInstanceState==null)
            {
                count = 0;
            }
            else
            {
                count = savedInstanceState.getInt("counter",0);
            }

    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter",count);
    }

    public void onClick(View v) {
        count++;
        comm.response("Clicked " + count + " times");
    }
}
