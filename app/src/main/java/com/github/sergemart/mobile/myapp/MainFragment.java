package com.github.sergemart.mobile.myapp;

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
     * Get widget references
     */
    private void initMemberVariables(View fragmentView) {
    }


    /**
     * Set widget attributes
     */
    private void setAttributes() {
    }


    /**
     * Set listeners to widgets
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
