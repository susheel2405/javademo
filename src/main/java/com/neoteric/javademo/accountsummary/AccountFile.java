package com.neoteric.javademo.accountsummary;

public class AccountFile {

    private String fileLocation; // Immutable class because private
    private String filename;
    private String fileType;

    public AccountFile( String filename) {
        this.fileLocation = fileLocation;
        this.filename = filename;
        this.fileType = fileType;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
