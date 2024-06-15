package com.socola.out.socolaSpringBoot.service;

import com.socola.out.socolaSpringBoot.entity.Administracion.*;
import com.socola.out.socolaSpringBoot.repository.Administracion.*;
import com.socola.out.socolaSpringBoot.service.Interface.IAdministracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministracionServiceImpl implements IAdministracionService {

    //Repositories JPA
    @Autowired
    private IAdministradorDao iAdministradorDao;

    @Autowired
    private IClienteDao iClienteDao;
    @Autowired
    private IEmpleadoDao iEmpleadoDao;
    @Autowired
    private IProveedorDao iProveedorDao;
    @Autowired
    private IUsuarioDao iUsuarioDao;

    /**
     * Listados
     *
     */

    @Override
    public List <Administrador> listAdministrador() {
        return iAdministradorDao.findAll();
    }

    @Override
    public List <Cliente> listCliente() {
        return iClienteDao.findAll();
    }

    @Override
    public List <Empleado> listEmpleado() {
        return iEmpleadoDao.findAll();
    }

    @Override
    public List <Proveedor> listProveedor() {
        return iProveedorDao.findAll();
    }

    @Override
    public List <Usuario> listUsuario() {
        return iUsuarioDao.findAll();
    }

    /**
     * Busquedas por Id
     */

    @Override
    public Administrador findByAdministrador(Long idAdministrador) {
        return iAdministradorDao.findById(idAdministrador).orElse(null);
    }

    @Override
    public Cliente findByCliente(Long idCliente) {
        return iClienteDao.findById(idCliente).orElse(null);
    }

    @Override
    public Empleado findByEmpleado(Long idEmpleado) {
        return iEmpleadoDao.findById(idEmpleado).orElse(null);
    }

    @Override
    public Proveedor findByProveedor(Long idProveedor) {
        return iProveedorDao.findById(idProveedor).orElse(null);
    }

    @Override
    public Usuario findByUsuario(Long idUsuario) {
        return iUsuarioDao.findById(idUsuario).orElse(null);
    }

    /**
     * Guardar
     * @param admin-
     */

    @Override
    public Administrador saveAdministrador(Administrador admin) {
        return iAdministradorDao.save(admin);
    }

    @Override
    public Cliente saveCliente(Cliente client) {
        return iClienteDao.save(client);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return iEmpleadoDao.save(empleado);
    }

    @Override
    public Proveedor saveProveedor(Proveedor proveedor) {
        return iProveedorDao.save(proveedor);
    }

    @Override
    public Usuario savaUsuario(Usuario usuario) {
        return iUsuarioDao.save(usuario);
    }

}
