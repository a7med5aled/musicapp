package com.example.myapplication;

public class singer {
    private String ssongname;
    private String ssingername;

    public singer(String songname, String singername) {
        ssongname = songname;
        ssingername = singername;
    }

    public String getSongname() {
        return ssongname;
    }

    public String getSingername() {
        return ssingername;
    }
}
