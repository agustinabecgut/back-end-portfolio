
package com.miportfolio.abb.Seguridad.Service;

import com.miportfolio.abb.Seguridad.Entity.Rol;
import com.miportfolio.abb.Seguridad.Enums.RolNombre;
import com.miportfolio.abb.Seguridad.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
    
}
