package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by eduardo_thp on 1/25/2018.
 */

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // (5) In SettingsFragment's onCreatePreferences method add the preference file using the
        // addPreferencesFromResource method
        addPreferencesFromResource(R.xml.pref_visualizer);

    }
}
