package com.example.alice.movies.ui;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.alice.movies.R;
import com.example.alice.movies.util.MyDebug;

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

        //Check whether we're recreating a previously destroyedinstance
        if (savedInstanceState != null) {
            //Restore state members from saved instance
            mSelectedView = savedInstanceState.getInt(STATE_VIEW_MODE);
            mLastPosition = savedInstanceState.getInt(STATE_LIST_POSTITION);
            if (mSelectedView==ViewByFavorites)queryFavorites();
            else{

            }
        }


        
    }


}
