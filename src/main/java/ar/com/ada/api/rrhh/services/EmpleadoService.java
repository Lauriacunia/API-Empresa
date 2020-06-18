package ar.com.ada.api.rrhh.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.repos.EmpleadoRepository;

@Service
public class EmpleadoService {

@Autowired
EmpleadoRepository empleadoRepository;

public void crearEmpleado(Empleado empleado){
    
    empleadoRepository.save(empleado);

}

public List<Empleado> listarEmpleados(){

    return empleadoRepository.findAll();
}

// traer empledos por id

public Empleado traerEmpleadoPorId(int empleadoId){

    Optional<Empleado> optionalEmpleado = empleadoRepository.findById(empleadoId); ///devuelve un objeto optional, que puede estar o no, por eso tengo que crear un objeto Optional
    
    if(optionalEmpleado.isPresent()) {

        return optionalEmpleado.get(); // retorna un empleado

    }
    return null;
}
}