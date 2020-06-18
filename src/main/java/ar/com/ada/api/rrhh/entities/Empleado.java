package ar.com.ada.api.rrhh.entities;

import java.util.List;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "empleado")
public class Empleado {

  @Id
  @Column(name = "empleado_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int empleadoId;
  private String nombre;
  private int edad;
  private BigDecimal sueldo;
  @Column(name = "estado_id")
  private int estado;
  @Column(name = "fecha_alta")
  private Date fechaAlta;
  @Column(name = "fecha_baja")
  private Date fechaBaja;

  @ManyToOne
  @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
  private Categoria categoria;

  public int getEmpleadoId() {
    return empleadoId;
  }

  public void setEmpleadoId(int empleadoId) {
    this.empleadoId = empleadoId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public BigDecimal getSueldo() {
    return sueldo;
  }

  public void setSueldo(BigDecimal sueldo) {
    this.sueldo = sueldo;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public Date getFechaAlta() {
    return fechaAlta;
  }

  public void setFechaAlta(Date fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  public Date getFechaBaja() {
    return fechaBaja;
  }

  public void setFechaBaja(Date fechaBaja) {
    this.fechaBaja = fechaBaja;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

}