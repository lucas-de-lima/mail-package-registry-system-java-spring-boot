package com.lucasdelima.database;

import com.lucasdelima.dao.DeliveryDAO;
import com.lucasdelima.dto.DeliveryDTO;

import java.util.List;

public class DeliveryImpl implements DeliveryDAO {
    @Override
    public void save(DeliveryDTO entity) {
        System.out.println("save");
        System.out.println("enviar notificação no whatsapp do destinatário");
    }

    public void monitoringDeliveryStatus(String deliveryId) {
        System.out.println("monitorar status do pacote");
    }

    @Override
    public void update(DeliveryDTO entity) {

    }

    @Override
    public void delete(DeliveryDTO entity) {

    }

    @Override
    public DeliveryDTO findById(Long id) {
        return null;
    }

    @Override
    public List<DeliveryDTO> findAll() {
        return List.of();
    }
}
