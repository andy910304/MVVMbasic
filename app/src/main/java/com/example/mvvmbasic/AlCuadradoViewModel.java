package com.example.mvvmbasic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlCuadradoViewModel extends ViewModel {

    private MutableLiveData<String> resultado;
    private AlCuadradoModel model;

    public LiveData<String> getAlCuadrado(){
        if(resultado==null){
            model = new AlCuadradoModel();
            resultado = new MutableLiveData<String>();
        }
        return resultado;
    }

    public void alCuadrado(String data){
        resultado.setValue(model.alCuadrado(data));
    }

}
