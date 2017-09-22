package com.lxy.notes.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devsmart.android.ui.IteratorListView;
import com.lxy.notes.R;
import com.lxy.notes.adapter.NoteListAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by liuxinyong on 2017-9-10.
 */

public class NoteListFragment extends Fragment {

    public NoteListFragment(File path) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View contentView = inflater.inflate(R.layout.note_list_layout, container, false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
