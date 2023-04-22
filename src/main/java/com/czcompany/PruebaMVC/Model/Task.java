
package com.czcompany.PruebaMVC.Model;


public class Task {
    //Atributos que representan descripcion de tarea
    private String description;
    
    //Constructor

    public Task(String description) {
        this.description = description;
    }
    
    //metodos accesores

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
