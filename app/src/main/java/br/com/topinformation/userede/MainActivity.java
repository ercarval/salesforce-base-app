package br.com.topinformation.userede;

import com.salesforce.androidsdk.rest.RestClient;
import com.salesforce.androidsdk.ui.SalesforceActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends SalesforceActivity {

    @AfterViews
    protected void afterViews() {

    }

    @Override
    public void onResume(RestClient client) {

    }
}
