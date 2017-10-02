package br.edu.fatecsjc.ggimenez.cademeuonibus.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Onibus {
    public String numero;
    public String lat;
    public String longi;
    private DatabaseReference firebase;

    public Onibus(String numero, String lat, String longi) {
        this.numero = numero;
        this.lat = lat;
        this.longi = longi;
    }

    public void saveLocation() {
        firebase = FirebaseDatabase.getInstance().getReference();
        firebase.child("onibus").child(numero).child("lat").setValue(lat);
        firebase.child("onibus").child(numero).child("longi").setValue(longi);
        firebase.push();
    }
}
