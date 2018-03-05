package com.example.alice.movies;

import android.database.DataSetObserver;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MovieListActivity extends AppCompatActivity {

    private static final String TAG ="MovieListActivity";
    private static final boolean DEBUG = true;

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */

    private boolean mTwoPane;
    private static final int SORT_BY_POPULARITY = 0;
    private static final int SORT_BY_RATING = 1;
    private static final int SORT_BY_FAVORITES = 2;
    private static final int SORT_BY_LATEST = 3;
    private static final int SORT_BY_UPCOMING = 4;
    private int SORT_BY = SORT_BY_POPULARITY;
    private ArrayList<Movie> mMovies;
    private MovieAdapter mAdapter;
    private GridView mGridView;

    private static final int ViewByPopularity = 0;
    private static final int ViewByRating = 1;
    private static final int ViewByFavorites = 2;
    private static final int ViewByUpcoming = 4;
    private static final int ViewByLatest = 5;
    private static final String STATE_VIEW_MODE = "STATE_VIEW_MODE";
    private static final String STATE_LIST_POSTITION = "STATE_LIST_POSTITION";

    private int mSelectedView = ViewByPopularity;
    private int mLastPosition = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (DEBUG) {
            MyDebug.LOGD(TAG, "onCreate");
        }
        setContentView(R.layout.activity_movie_list);

        mMovies = new ArrayList<>();
        mGridView = (GridView) findViewById(R.id.movie_list);
        mAdapter = new MovieAdapter(this, android.R.layout.simple_list_item_1);
        mGridView.setAdapter(mAdapter);


        
    }

    private class MovieAdapter implements ListAdapter {
        public MovieAdapter(MovieListActivity movieListActivity, int simple_list_item_1) {
        }

        @Override
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override
        public boolean isEnabled(int position) {
            return false;
        }

        @Override
        public void registerDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }

        @Override
        public int getItemViewType(int position) {
            return 0;
        }

        @Override
        public int getViewTypeCount() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }

    private static class MyDebug {
        public static void LOGD(String tag, String onCreate) {
        }
    }
}
