package br.edu.ifsp.dmos5.model;

import br.edu.ifsp.dmos5.interfaces.ConversorTemperatura;

public class FahrenheitStrategy implements ConversorTemperatura {

    private static FahrenheitStrategy fahrenheitStrategy = null;

    private FahrenheitStrategy(){
    }

    public static FahrenheitStrategy getInstance(){
        if(fahrenheitStrategy == null){
           fahrenheitStrategy = new FahrenheitStrategy();
        }
        return fahrenheitStrategy;
    }

    @Override
    public double getConversion(double temperature) throws RuntimeException{
        try {
            return 1.8 * temperature + 32;
        }catch (RuntimeException ex){
            throw ex;
        }
    }
}
