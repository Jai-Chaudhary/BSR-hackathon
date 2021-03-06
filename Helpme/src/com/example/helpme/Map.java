package com.example.helpme;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class Map extends Activity{
	private GoogleMap mMap;
	LatLng coordinate;
    float Latitude,Longitutde;
    double latitudenew,longitudenew;
    
	protected void onCreate(Bundle savedinstanceState)
	{
		super.onCreate(savedinstanceState);
		setContentView(R.layout.mapnew);
		
		// Using GPS
		LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

		LocationListener mlocListener = new MyLocationListener();


		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
		
		/*// Using Network provider
		LocationManager lm = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);

	    Location location = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

	if(location != null){
	    latitudenew = location.getLatitude();
	    longitudenew = location.getLongitude();
	    Toast.makeText(Map.this, Double.toString(latitudenew)+" "+Double.toString(longitudenew), Toast.LENGTH_LONG).show();    
	}
		
		
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mMap.addMarker(new MarkerOptions()
		        .position(new LatLng(latitudenew,longitudenew))
		        .title("Cornell Tech Bitches!"));
		
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitudenew,longitudenew), 15));
		*/
		
	}
	
	public class MyLocationListener implements LocationListener

	{

	@Override

	public void onLocationChanged(Location loc)

	{

	loc.getLatitude();

	loc.getLongitude();

	String Text = "My current location is: " +

	"Latitud = " + loc.getLatitude() +

	"Longitud = " + loc.getLongitude();


	Toast.makeText( getApplicationContext(),

	Text,

	Toast.LENGTH_SHORT).show();

	}


	@Override

	public void onProviderDisabled(String provider)

	{

	Toast.makeText( getApplicationContext(),

	"Gps Disabled",

	Toast.LENGTH_SHORT ).show();

	}


	@Override

	public void onProviderEnabled(String provider)

	{

	Toast.makeText( getApplicationContext(),"Gps Enabled",Toast.LENGTH_SHORT).show();

	}


	@Override

	public void onStatusChanged(String provider, int status, Bundle extras)

	{


	}

	}/* End of Class MyLocationListener */


}
