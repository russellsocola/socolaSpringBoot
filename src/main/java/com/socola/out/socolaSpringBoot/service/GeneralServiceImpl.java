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
        return iAlmacenDao.save(almacen);
    }

    @Override
    public Factura saveFactura(Factura factura) {
        return iFacturaDao.save(factura);
    }

    @Override
    public FichaTecnica saveFichaTecnica(FichaTecnica fichaTecnica) {
        return iFichaTecnicaDao.save(fichaTecnica);
    }

    @Override
    public Inventario saveInventario(Inventario inventario) {
        return iInventarioDao.save(inventario);
    }

    @Override
    public Pago savePago(Pago pago) {
        return iPagoDao.save(pago);
    }

    @Override
    public Pedido savePedido(Pedido pedido) {
        return iPedidoDao.save(pedido);
    }

    @Override
    public PedidoDetalle savePedidoDetalle(PedidoDetalle pedidoDetalle) {
        return iPedidoDetalleDao.save(pedidoDetalle);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return iProductoDao.save(producto);
    }

    @Override
    public Sede saveSede(Sede sede) {
        return iSedeDao.save(sede);
    }
}
