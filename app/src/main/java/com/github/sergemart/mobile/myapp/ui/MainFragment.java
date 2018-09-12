package com.github.sergemart.mobile.myapp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.github.sergemart.mobile.myapp.R;


public class MainFragment extends Fragment {


    // --------------------------- Override fragment event handlers

    /**
     * View-unrelated startup actions
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHasOptionsMenu(true);                                                               // tell the fragment manager that this.onCreateOptionsMenu() should be called
    }


    /**
     * View-related startup actions
     * @return Inflated content view of the fragment
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_list, container, false);

        this.initMemberVariables(fragmentView);
        this.setAttributes();
        this.setListeners();

        return fragmentView;
    }


    /**
     * Inflate the menu
     */
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);                                                  // useless here, but is a good rule
        inflater.inflate(R.menu.fragment_main, menu);
    }


    /**
     * Process menu item selection
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch ( item.getItemId() ) {
            case R.id.menuItem_action:
                return true;                                                                        // no further processing needed

            default:
                return super.onOptionsItemSelected(item);                                           // unknown item id - call parent
        }
    }


    // --------------------------- Widget controls

    /**
     * Init member variables
     */
    private void initMemberVariables(View fragmentView) {
    }


    /**
     * Set attributes
     */
    private void setAttributes() {
    }


    /**
     * Set listeners to widgets and containers
     */
    private void setListeners() {
    }


    // --------------------------- Static encapsulation-leveraging methods

    /**
     * Create MainFragment instance
     */
    public static MainFragment newInstance() {
        return new MainFragment();
    }


}
