package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;


/**
 * Created by Kleocida on 2017. 11. 22..
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    // COMPLETED (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {

        // COMPLETED (5) In SettingsFragment's onCreatePreferences method add the preference file using the
        // addPreferencesFromResource method

        // Add visualizer preferences, defined in the XML file in res->xml->pref_visualizer
        addPreferencesFromResource(R.xml.pref_visualizer);
    }

}