package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double a) {
        this.gram = a;
    }

    public void setOunce(double a) {
        this.gram = a * 28.3495231;
    }

    public void setPound(double a) {
        this.gram = a * 453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce() {
        return gram / 28.3495231;
    }

    public double getPound() {
        return gram / 453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {

        //Gram to Gram
        if (oriUnit.equals("Grm") && convUnit.equals("Grm")) {
            setGram(value);
            return getGram();
        }
        //Gram to Ounce
        else if (oriUnit.equals("Grm") && convUnit.equals("Onc")) {
            setGram(value);
            return getOunce();
        }
        //Gram to Pound
        else if (oriUnit.equals("Grm") && convUnit.equals("Pnd")) {
            setGram(value);
            return getPound();
        }
        //Ounce to Gram
        else if (oriUnit.equals("Onc") && convUnit.equals("Grm")) {
            setOunce(value);
            return getGram();
        }
        //Ounce to Ounce
        else if (oriUnit.equals("Onc") && convUnit.equals("Onc")) {
            setOunce(value);
            return getOunce();
        }
        //Ounce to Pound
        else if (oriUnit.equals("Onc") && convUnit.equals("Pnd")) {
            setOunce(value);
            return getPound();
        }
        //Pound to Gram
        else if (oriUnit.equals("Pnd") && convUnit.equals("Grm")) {
            setPound(value);
            return getGram();
        }
        //Pound to Ounce
        else if (oriUnit.equals("Pnd") && convUnit.equals("Onc")) {
            setPound(value);
            return getOunce();
        }
        //Pound to Pound
        else {
            setPound(value);
            return getPound();
        }
    }
}
