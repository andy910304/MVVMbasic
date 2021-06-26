package com.example.mvvmbasic;

class AlCuadradoModel {

    private double resultado;
    public AlCuadradoModel(){
    }

    public String alCuadrado(String data){
        if(data.equals("")){
            return "Campo Vacio";
        }else{
            resultado = Double.valueOf(data)*Double.valueOf(data);
            return String.valueOf(resultado);
        }
    }
}
