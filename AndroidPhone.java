package com.alicer.springdemo;

public class AndroidPhone implements Phone{
    private CPU mCPU;
    private String brand;
    private String Country;

    public AndroidPhone(){
    }

    public AndroidPhone(CPU c){
        this.mCPU = c;
    }

    @Override
    public String getMessage() {
        return "Hello Android!";
    }

    @Override
    public String getCPUFramework() {
        return this.mCPU.getFramework();
    }

    //setter & getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("setBrand method");
        this.brand = brand;
    }
    public void setbrand(String brand) {
        System.out.println("setbrand method");
        this.brand = brand;
    }

    public String getCountry() {
        return Country;
    }

    public void setcountry(String country) {
        System.out.println("setCountry method");
        Country = country;
    }
    public void setCountry(String country) {
        System.out.println("setcountry method");
        Country = country;
    }

    public void setMCPU(CPU mCPU) {
        System.out.println("setMCPU method");
        this.mCPU = mCPU;
    }

    public CPU getmCPU() {
        return mCPU;
    }
}
