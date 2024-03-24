package com.example.pp.jpa;


import com.example.pp.jpa.entity.ClientEntity;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ClientRequestDtoEntityTest {

    @Test
    public void testConstructor() {
        String fullName = "Roman Vasilyevich Dovzhenko";
        String phone = "+79968017272";
        LocalDate birthday = LocalDate.of(1987, 11, 12);
        boolean messageSend = true;

        ClientEntity clientEntity = new ClientEntity(fullName, phone, birthday, messageSend);

        assertEquals(fullName, clientEntity.getFullName());
        assertEquals(phone, clientEntity.getPhone());
        assertEquals(birthday, clientEntity.getBirthday());
        assertEquals(messageSend, clientEntity.isMessageSend());
    }

    @Test
    public void testSetters() {
        ClientEntity clientEntity = new ClientEntity();

        String fullName = "Akim Aleksandrovich Parish";
        String phone = "+79586719625";
        LocalDate birthday = LocalDate.of(1998, 1, 1);
        boolean messageSend = false;

        clientEntity.setFullName(fullName);
        clientEntity.setPhone(phone);
        clientEntity.setBirthday(birthday);
        clientEntity.setMessageSend(messageSend);

        assertEquals(fullName, clientEntity.getFullName());
        assertEquals(phone, clientEntity.getPhone());
        assertEquals(birthday, clientEntity.getBirthday());
        assertEquals(messageSend, clientEntity.isMessageSend());
    }
    @Test
    public void testBuilder() {
        String fullName = "Vadim Alekseevich Zharkov";
        String phone = "+79085557951";
        LocalDate birthday = LocalDate.of(2000, 8, 31);
        boolean messageSend = true;

        ClientEntity clientEntity = com.example.pp.jpa.entity.ClientEntity.builder()
                .fullName(fullName)
                .phone(phone)
                .birthday(birthday)
                .messageSend(messageSend)
                .build();

        assertEquals(fullName, clientEntity.getFullName());
        assertEquals(phone, clientEntity.getPhone());
        assertEquals(birthday, clientEntity.getBirthday());
        assertEquals(messageSend, clientEntity.isMessageSend());
    }
}
