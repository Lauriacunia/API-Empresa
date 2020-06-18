package ar.com.ada.api.rrhh.controllers;

import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.services.EmpleadoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {

@Autowired
EmpleadoService empleadoService;

// hacer metodos get post put etc

@PostMapping("/empleados")
public ResponseEntity<?> crearEmpleado(@RequestBody Empleado empleado){

    empleadoService.crearEmpleado(empleado);

    return ResponseEntity.ok(empleado.getEmpleadoId()); // devolves todo el objeto o solo un atributo
    

}

@GetMapping("/empleado")
public ResponseEntity<?> listarEmpleado(){
    
    return ResponseEntity.ok(empleadoService.listarEmpleados());
    
}
}
    
