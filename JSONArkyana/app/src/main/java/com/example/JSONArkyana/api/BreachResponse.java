package com.example.JSONArkyana.api;

public class BreachResponse {
    private String Name, Title, Domain, BreachDate, AddedDate, ModifiedDate, Description, LogoPath;
    private int PwnCount;
    private String[] DataClasses;
    private boolean IsVerified, IsFabricated, IsSensitive, IsRetired, IsSpamList;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getBreachDate() {
        return BreachDate;
    }

    public void setBreachDate(String breachDate) {
        BreachDate = breachDate;
    }

    public String getAddedDate() {
        return AddedDate;
    }

    public void setAddedDate(String addedDate) {
        AddedDate = addedDate;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLogoPath() {
        return LogoPath;
    }

    public void setLogoPath(String logoPath) {
        LogoPath = logoPath;
    }

    public int getPwnCount() {
        return PwnCount;
    }

    public void setPwnCount(int pwnCount) {
        PwnCount = pwnCount;
    }

    public String[] getDataClasses() {
        return DataClasses;
    }

    public void setDataClasses(String[] dataClasses) {
        DataClasses = dataClasses;
    }

    public boolean isVerified() {
        return IsVerified;
    }

    public void setVerified(boolean verified) {
        IsVerified = verified;
    }

    public boolean isFabricated() {
        return IsFabricated;
    }

    public void setFabricated(boolean fabricated) {
        IsFabricated = fabricated;
    }

    public boolean isSensitive() {
        return IsSensitive;
    }

    public void setSensitive(boolean sensitive) {
        IsSensitive = sensitive;
    }

    public boolean isRetired() {
        return IsRetired;
    }

    public void setRetired(boolean retired) {
        IsRetired = retired;
    }

    public boolean isSpamList() {
        return IsSpamList;
    }

    public void setSpamList(boolean spamList) {
        IsSpamList = spamList;
    }

    @Override
    public String toString() {
        return "BreachResponse{" +
                "Name='" + Name + '\'' +
                ", Title='" + Title + '\'' +
                ", Domain='" + Domain + '\'' +
                ", BreachDate='" + BreachDate + '\'' +
                ", AddedDate='" + AddedDate + '\'' +
                ", ModifiedDate='" + ModifiedDate + '\'' +
                ", Description='" + Description + '\'' +
                ", LogoPath='" + LogoPath + '\'' +
                ", PwnCount=" + PwnCount +
                '}';
    }
}
