package ar.com.ada.api.rrhh.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.rrhh.entities.Categoria;
import ar.com.ada.api.rrhh.services.CategoriaService;

@RestController
public class CategoriaController {

@Autowired
CategoriaService categoriaService;

// hacer los metodos get, set, put, etc

// get categorias Todas . sin empleados
@PostMapping("/categorias")   //no devuelve nada, pero a front hay que avisarle algo. Le mando un response entity
public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria){

    categoriaService.crearCategoria(categoria);
    return ResponseEntity.ok(categoria);
}

@GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> listarCategorias() {

        return ResponseEntity.ok(categoriaService.listarCategorias());
    }
    
}