package ar.com.ada.api.rrhh.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.rrhh.entities.Empleado;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado,Integer> {

    
    
}