package br.edu.ifsp.dmos5.model;

import br.edu.ifsp.dmos5.interfaces.ConversorTemperatura;

public class KelvinStrategy implements ConversorTemperatura {

    private static KelvinStrategy kelvinStrategy = null;

    private KelvinStrategy(){
    }

    public static KelvinStrategy getInstance(){
        if(kelvinStrategy == null){
            kelvinStrategy = new KelvinStrategy();
        }
        return kelvinStrategy;
    }

    @Override
    public double getConversion(double temperature) throws RuntimeException{
        try {

            return ((temperature - 32) / 1.8) + 273;
        }catch (RuntimeException ex){
            throw ex;
        }
    }
}
