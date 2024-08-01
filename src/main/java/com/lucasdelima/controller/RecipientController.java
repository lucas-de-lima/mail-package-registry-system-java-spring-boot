package com.lucasdelima.controller;

import com.lucasdelima.dto.DeliveryDTO;
import com.lucasdelima.service.RecipientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/recipient")
public class RecipientController {
    RecipientService recipientService;

    public RecipientController(RecipientService recipientService) {
        this.recipientService = recipientService;
    }

    /**
     * -> portaria recebeu
     * -> portaria registrou
     * -> gerou código aleatório
     * -> enviar notificação no whatsapp do destinatário
     * -> destinatário confirma que vai retirar o pacote
     * -> destinatário retira o pacote confirmando o código que foi gerado
     * -> pronto.
     */

    @PutMapping("/register")
    public void register(DeliveryDTO delivery) {
        recipientService.register(delivery);
    }

}
