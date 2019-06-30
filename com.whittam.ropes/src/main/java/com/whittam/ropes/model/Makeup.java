package com.whittam.ropes.model;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyronboyd on 15/6/19.
 */
public class Makeup {

    @Id
    private String id;
    private String ref;
    private String description;
    private String customer;
    private String winder;
    private String inMetres;
    private String endsOne;
    private String endsTwo;
    private String braider;
    private String carriers;
    private String gears;
    private List<String> productCodes = new ArrayList<String>();
    private String core;
    private String misc1;
    private String misc2;
    private String misc3;

    public String getEndsOne() {
        return endsOne;
    }

    public void setEndsOne(String endsOne) {
        this.endsOne = endsOne;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getWinder() {
        return winder;
    }

    public void setWinder(String winder) {
        this.winder = winder;
    }

    public String getInMetres() {
        return inMetres;
    }

    public void setInMetres(String inMetres) {
        this.inMetres = inMetres;
    }

    public String getEndsTwo() {
        return endsTwo;
    }

    public void setEndsTwo(String endsTwo) {
        this.endsTwo = endsTwo;
    }

    public String getBraider() {
        return braider;
    }

    public void setBraider(String braider) {
        this.braider = braider;
    }

    public String getCarriers() {
        return carriers;
    }

    public void setCarriers(String carriers) {
        this.carriers = carriers;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public List<String> getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(List<String> productCodes) {
        this.productCodes = productCodes;
    }
}
