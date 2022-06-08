package com.example.oulutraineeship;

import androidx.annotation.NonNull;

public class dataSamples {
    private String DeviceId;
    private String Date;
    private String Time;
    private String Parking_Status;



    public String getDeviceId() {
        return DeviceId; }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId; }



    public String getDate() {
        return Date; }

    public void setDate(String date) {
        Date = date; }



    public String getTime() {
        return Time; }

    public void setTime(String time) {
        Time = time; }



    public String getParking_Status() {
        return Parking_Status; }

    public void setParking_Status(String parking_Status) {
        Parking_Status = parking_Status; }


    @NonNull
    @Override
    public String toString() {
        return "DataSample{" +
                "DeviceId='" + DeviceId + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Parking_Status=" + Parking_Status +
                '}';
    }
}