package com.socola.out.socolaSpringBoot.service.Interface;

import com.socola.out.socolaSpringBoot.entity.Administracion.*;

import java.util.List;

public interface IAdministracionService {

    List <Administrador> listAdministrador();
    List <Cliente> listCliente();
    List <Empleado> listEmpleado();
    List <Proveedor> listProveedor();
    List <Usuario> listUsuario();


    Administrador findByAdministrador(Long idAdministrador);
    Cliente findByCliente(Long idCliente);
    Empleado findByEmpleado(Long idEmpleado);
    Proveedor findByProveedor(Long idProveedor);
    Usuario findByUsuario(Long idUsuario);


    Administrador saveAdministrador(Administrador admin);
    Cliente saveCliente(Cliente client);
    Empleado saveEmpleado(Empleado empleado);
    Proveedor saveProveedor(Proveedor proveedor);
    Usuario savaUsuario(Usuario usuario);
}
