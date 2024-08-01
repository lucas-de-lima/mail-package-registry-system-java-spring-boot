package com.lucasdelima.service;

import com.lucasdelima.database.DeliveryImpl;
import com.lucasdelima.database.DeliveryStatus;
import com.lucasdelima.dto.DeliveryDTO;
import org.springframework.stereotype.Service;

@Service
public class RecipientService {
    private DeliveryImpl deliveryRepository;

    public void register(DeliveryDTO delivery) {
        deliveryRepository.save(
                new DeliveryDTO(
                        delivery.getRecipientName(),
                        delivery.getRecipientEmail(),
                        delivery.getRecipientPhone(),
                        delivery.getRecipientAddress(),
                        delivery.getDeliveryCode(),
                        DeliveryStatus.WAITING,
                        delivery.getDeliveryId(),
                        generateCode()
                )
        );
    }

    private String generateCode() {
        return "123456";
    }


}
