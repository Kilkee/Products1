package com.example.delaney.products1;

public class Products {
    private int _id;
    private String _productname;
    private String _startDate;
    private String _endDate;
    private String _reason;

    //Added this empty constructor in lesson 50 in case we ever want to create the object and assign it later.
    public Products(){

    }
    public Products(String productName, String startDate, String endDate, String reason) {

        this._productname = productName;
        this._startDate = startDate;
        this._endDate = endDate;
        this._reason = reason;
    }
                                        //Getters
    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }

    public String get_startDate() {
        return _startDate;
    }

    public String get_endDate() {
        return _endDate;
    }

    public String get_reason() {
        return _reason;
    }
                                            //Setters
    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public void set_startDate(String _startDate) {
        this._startDate = _startDate;
    }

    public void set_endDate(String _endDate) {
        this._endDate = _endDate;
    }

    public void set_reason(String _reason) {
        this._reason = _reason;
    }
}
