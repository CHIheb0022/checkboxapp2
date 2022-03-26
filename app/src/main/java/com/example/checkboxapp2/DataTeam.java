package com.example.checkboxapp2;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataTeam {
    private DatabaseReference databaseReference;

    public DataTeam(){
        DatabaseReference db =FirebaseDatabase.getInstance().getReference("team");//.getReference(team.class.getName())
        this.databaseReference=db;
    }

    public DatabaseReference getDatabaseReference() {
        return databaseReference;
    }

    public void setDatabaseReference(DatabaseReference databaseReference) {
        this.databaseReference = databaseReference;
    }
    public Task<Void> add(team t) {
        return databaseReference.push().setValue(t);
    }
}
