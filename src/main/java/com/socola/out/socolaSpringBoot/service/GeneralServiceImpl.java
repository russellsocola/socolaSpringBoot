package com.socola.out.socolaSpringBoot.service;

import com.socola.out.socolaSpringBoot.entity.General.*;
import com.socola.out.socolaSpringBoot.repository.General.*;
import com.socola.out.socolaSpringBoot.service.Interface.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralServiceImpl implements IGeneralService {

    //Jpa's
    @Autowired
    private IAlmacenDao iAlmacenDao;
    @Autowired
    private IFacturaDao iFacturaDao;
    @Autowired
    private IFichaTecnicaDao iFichaTecnicaDao;
    @Autowired
    private IInventarioDao iInventarioDao;
    @Autowired
    private IPagoDao iPagoDao;
    @Autowired
    private IPedidoDao iPedidoDao;
    @Autowired
    private IPedidoDetalleDao iPedidoDetalleDao;
    @Autowired
    private IProductoDao iProductoDao;
    @Autowired
    private ISedeDao iSedeDao;


    /**
     * Listas
     *
     */

    @Override
    public List <Almacen> listarAlmacenes() {
        return iAlmacenDao.findAll();
    }

    @Override
    public List <Factura> listarFacturas() {
        return iFacturaDao.findAll();
    }

    @Override
    public List <FichaTecnica> listarFichasTecnicas() {
        return iFichaTecnicaDao.findAll();
    }

    @Override
    public List <Inventario> listarInventarios() {
        return iInventarioDao.findAll();
    }

    @Override
    public List <Pago> listarPagos() {
        return iPagoDao.findAll();
    }

    @Override
    public List <Pedido> listarPedidos() {
        return iPedidoDao.findAll();
    }

    @Override
    public List <PedidoDetalle> listarPedidoDetalles() {
        return iPedidoDetalleDao.findAll();
    }

    @Override
    public List <Producto> listarProductos() {
        return iProductoDao.findAll();
    }

    @Override
    public List <Sede> listarSedes() {
        return iSedeDao.findAll();
    }

    /**
     * Busquedas por Id
     */

    @Override
    public Almacen findByAlmacen(Long almacen) {
        return iAlmacenDao.findById(almacen).orElse(null);
    }

    @Override
    public Factura findByFactura(Long factura) {
        return iFacturaDao.findById(factura).orElse(null);
    }

    @Override
    public FichaTecnica findByFichaTecnica(Long ficha) {
        return iFichaTecnicaDao.findById(ficha).orElse(null);
    }

    @Override
    public Inventario findByInventario(Long inventario) {
        return iInventarioDao.findById(inventario).orElse(null);
    }

    @Override
    public Pago findByPago(Long pago) {
        return iPagoDao.findById(pago).orElse(null);
    }

    @Override
    public Pedido findByPedido(Long pedido) {
        return iPedidoDao.findById(pedido).orElse(null);
    }

    @Override
    public PedidoDetalle findByPedidoDetalle(Long pedidoDetalle) {
        return iPedidoDetalleDao.findById(pedidoDetalle).orElse(null);
    }

    @Override
    public Producto findByProducto(Long producto) {
        return iProductoDao.findById(producto).orElse(null);
    }

    @Override
    public  Sede findBySede(Long sede) {
        return iSedeDao.findById(sede).orElse(null);
    }

    /**
     * Save Datos
     */

    @Override
    public Almacen saveAlmacen(Almacen almacen) {
        try {
            return iAlmacenDao.save(almacen);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Factura saveFactura(Factura factura) {
        try {
            return iFacturaDao.save(factura);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public FichaTecnica saveFichaTecnica(FichaTecnica fichaTecnica) {
        try {
            return iFichaTecnicaDao.save(fichaTecnica);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Inventario saveInventario(Inventario inventario) {
        try {
            return iInventarioDao.save(inventario);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Pago savePago(Pago pago) {
        try {
            return iPagoDao.save(pago);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Pedido savePedido(Pedido pedido) {
        try {
            return iPedidoDao.save(pedido);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public PedidoDetalle savePedidoDetalle(PedidoDetalle pedidoDetalle) {
        try {
            return iPedidoDetalleDao.save(pedidoDetalle);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Producto saveProducto(Producto producto) {
        try {
            return iProductoDao.save(producto);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    @Override
    public Sede saveSede(Sede sede) {
        try {
            return iSedeDao.save(sede);
        }catch (Exception e){
            // Manejo de la excepción
            e.printStackTrace(); // O usa un logger para registrar el error
            return null;
        }
    }

    //Calculos y Filtrados

    // Obtener el número total de sedes
    @Override
    public long getTotalSedes() {
        return iSedeDao.count();
    }
}
