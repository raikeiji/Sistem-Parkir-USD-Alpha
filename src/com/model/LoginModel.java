/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

/**
 *
 * @author rai
 */
public class LoginModel {
    private String id_petugas, nama_petugas, password, status;

    public LoginModel() {
    }

    public LoginModel(String id_petugas, String nama_petugas, String password, String status) {
        this.id_petugas = id_petugas;
        this.nama_petugas = nama_petugas;
        this.password = password;
        this.status = status;
    }

    public String getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(String id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
