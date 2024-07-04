package com.socola.out.socolaSpringBoot.controller.Administracion;

import com.socola.out.socolaSpringBoot.entity.Administracion.*;
import com.socola.out.socolaSpringBoot.service.Interface.IAdministracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Administracion/GET")
public class AdministracionControllerGET {

    @Autowired
    private IAdministracionService iAdministracionService;


    //Administradores
    @GetMapping("ListAdministrador")
    public ResponseEntity<List <Administrador>> ListAdministrador() {
        return ResponseEntity.ok(iAdministracionService.listAdministrador());
    }

    @GetMapping("FindAdministrador/{idAdministrador}")
    public ResponseEntity<Administrador> FindAdministrador(@PathVariable Long idAdministrador) {
        return ResponseEntity.ok(iAdministracionService.findByAdministrador(idAdministrador));
    }


    //Clientes
    @GetMapping("ListCliente")
    public ResponseEntity<List<Cliente>> ListCliente() {
        return ResponseEntity.ok(iAdministracionService.listCliente());
    }

    @GetMapping("FindCliente/{idCliente}")
    public ResponseEntity<Cliente> FindCliente(@PathVariable Long idCliente) {
        return ResponseEntity.ok(iAdministracionService.findByCliente(idCliente));
    }


    //Empleados
    @GetMapping("ListEmpleado")
    public ResponseEntity<List <Empleado>> ListEmpleado() {
        return ResponseEntity.ok(iAdministracionService.listEmpleado());
    }

    @GetMapping("FindEmpleado/{idEmpleado}")
    public ResponseEntity<Empleado> FindEmpleado(@PathVariable Long idEmpleado) {
        return ResponseEntity.ok(iAdministracionService.findByEmpleado(idEmpleado));
    }


    //Proveedores
    @GetMapping("ListProveedor")
    public ResponseEntity<List<Proveedor>> ListProveedor() {
        return ResponseEntity.ok(iAdministracionService.listProveedor());
    }

    @GetMapping("FindProveedor/{idProveedor}")
    public ResponseEntity<Proveedor> FindProveedor(@PathVariable Long idProveedor) {
        return ResponseEntity.ok(iAdministracionService.findByProveedor(idProveedor));
    }


    //Usuarios
    @GetMapping("ListUsuarios")
    public ResponseEntity<List<Usuario>> ListUsuarios() {
        return ResponseEntity.ok(iAdministracionService.listUsuario());
    }

    @GetMapping("FindUsuarios/{idUsuario}")
    public ResponseEntity<Usuario> FindUsuarios(@PathVariable Long idUsuario) {
        return ResponseEntity.ok(iAdministracionService.findByUsuario(idUsuario));
    }

    //Calculos

    @GetMapping("getTotalSedesByAdministradorId/{id}")
    public int getTotalSedesByAdministradorId(@PathVariable Long id){
        return iAdministracionService.getTotalSedesByAdministradorId(id);
    }

    @GetMapping("getTotalPedidosByClienteId/{id}")
    public int getTotalPedidosByClienteId(@PathVariable Long id){
        return iAdministracionService.getTotalPedidosByClienteId(id);
    }

    @GetMapping("getTotalPedidosByEmpleadoId/{id}")
    public int getTotalPedidosByEmpleadoId(@PathVariable Long id){
        return iAdministracionService.getTotalPedidosByEmpleadoId(id);
    }

    @GetMapping("getTotalPedidos")
    public long getTotalPedidos(){
        return iAdministracionService.getTotalPedidos();
    }

    @GetMapping("getTotalPedidosGestionados")
    public long getTotalPedidosGestionados(){
        return iAdministracionService.getTotalPedidosGestionados();
    }

    @GetMapping("getTotalSedesGestionadas")
    public long getTotalSedesGestionadas(){
        return iAdministracionService.getTotalSedesGestionadas();
    }

}
