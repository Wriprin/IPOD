package io.wriprin.android.ipod;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static io.wriprin.android.ipod.MainActivity.musicFiles;
import static io.wriprin.android.ipod.MusicAdapter.mFiles;

/**
 * A simple {@link Fragment} subclass.
 */
public class SongsFragment extends Fragment {

    RecyclerView recyclerView;
    static MusicAdapter musicAdapter;
    public SongsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_songs, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        if (!(musicFiles.size() < 1))
        {
            musicAdapter = new MusicAdapter(getContext(),musicFiles);
            recyclerView.setAdapter(musicAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        }
        return view;
    }
}