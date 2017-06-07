package jpa.entity;

import javax.persistence.*;

/**
 * Created by DELL on 06/07/17.
 */
@Entity
@Table(name = "xaydung")
public class XayDungEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idxaydung;

    @Column(name = "name")
    private String name;

    @Column(name = "phanloai")
    private String phanloai;

    @Column(name = "luong")
    private double luong;

    public XayDungEntity() {
    }

    public int getIdxaydung() {
        return idxaydung;
    }

    public void setIdxaydung(int idxaydung) {
        this.idxaydung = idxaydung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
