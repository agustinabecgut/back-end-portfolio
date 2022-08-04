
package com.miportfolio.abb.Interfaz;

import com.miportfolio.abb.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //Traer una lista de personas
    
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
    
}
