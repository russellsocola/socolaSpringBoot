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
    public String saveAlmacen(Almacen almacen) {
        return "";
    }

    @Override
    public String saveFactura(Factura factura) {
        return "";
    }

    @Override
    public String saveFichaTecnica(FichaTecnica fichaTecnica) {
        return "";
    }

    @Override
    public String saveInventario(Inventario inventario) {
        return "";
    }

    @Override
    public String savePago(Pago pago) {
        return "";
    }

    @Override
    public String savePedido(Pedido pedido) {
        return "";
    }

    @Override
    public String savePedidoDetalle(PedidoDetalle pedidoDetalle) {
        return "";
    }

    @Override
    public String saveProducto(Producto producto) {
        return "";
    }

    @Override
    public String saveSede(Sede sede) {
        return "";
    }
}
