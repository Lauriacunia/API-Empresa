package ar.com.ada.api.rrhh.services;

import ar.com.ada.api.rrhh.entities.Categoria;
import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.repos.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Service
public class CategoriaService {
   
    @Autowired
    CategoriaRepository categoriaRepository;

    //Buscar todas las categorias sin empleados y mostrarlas por nombre

    public void crearCategoria(Categoria categoria){
        
        categoriaRepository.save(categoria);

    }

    public List<Categoria> listarCategorias() {

        return categoriaRepository.findAll();
    }
    
    public List<Empleado> traerEmpleadosPorCategoria(int categoriaId){

        Optional<Categoria> optionalCategoria = categoriaRepository.findById(categoriaId);
        List<Empleado> listaVacia = new ArrayList<>();
        
        if(optionalCategoria.isPresent()){
            return optionalCategoria.get().getEmpleados();

        }
        return listaVacia;
    }
}