package ar.com.ada.api.rrhh.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import ar.com.ada.api.rrhh.entities.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>{




    
}