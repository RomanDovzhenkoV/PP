package com.example.pp.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ClientRequestDtoTest {
    @Test
    void testConstructor() {
        String clientId = "1";
        String name = "John";
        String middleName = "Doe";
        String surname = "Smith";
        Long age = 30L;
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        String phone = "1234567890";

        ClientRequestDto clientRequestDto = new ClientRequestDto(clientId, name, middleName, surname, age, birthday, phone);

        assertEquals(clientId, clientRequestDto.getClientId());
        assertEquals(name, clientRequestDto.getName());
        assertEquals(middleName, clientRequestDto.getMiddleName());
        assertEquals(surname, clientRequestDto.getSurname());
        assertEquals(age, clientRequestDto.getAge());
        assertEquals(birthday, clientRequestDto.getBirthday());
        assertEquals(phone, clientRequestDto.getPhone());
    }

    @Test
    void testNoArgsConstructor() {
        ClientRequestDto clientRequestDto = new ClientRequestDto();

        assertNull(clientRequestDto.getClientId());
        assertNull(clientRequestDto.getName());
        assertNull(clientRequestDto.getMiddleName());
        assertNull(clientRequestDto.getSurname());
        assertNull(clientRequestDto.getAge());
        assertNull(clientRequestDto.getBirthday());
        assertNull(clientRequestDto.getPhone());
    }

    @Test
    void testBuilder() {
        String clientId = "2";
        String name = "Jane";
        String middleName = "Doe";
        String surname = "Doe";
        Long age = 25L;
        LocalDate birthday = LocalDate.of(1995, 10, 20);
        String phone = "9876543210";

        ClientRequestDto clientRequestDto = ClientRequestDto.builder()
                .clientId(clientId)
                .name(name)
                .middleName(middleName)
                .surname(surname)
                .age(age)
                .birthday(birthday)
                .phone(phone)
                .build();

        assertEquals(clientId, clientRequestDto.getClientId());
        assertEquals(name, clientRequestDto.getName());
        assertEquals(middleName, clientRequestDto.getMiddleName());
        assertEquals(surname, clientRequestDto.getSurname());
        assertEquals(age, clientRequestDto.getAge());
        assertEquals(birthday, clientRequestDto.getBirthday());
        assertEquals(phone, clientRequestDto.getPhone());
    }

    @Test
    void testSetters() {
        ClientRequestDto clientRequestDto = new ClientRequestDto();

        String clientId = "3";
        String name = "Alice";
        String middleName = "Jane";
        String surname = "Doe";
        Long age = 40L;
        LocalDate birthday = LocalDate.of(1980, 3, 1);
        String phone = "5555555555";

        clientRequestDto.setClientId(clientId);
        clientRequestDto.setName(name);
        clientRequestDto.setMiddleName(middleName);
        clientRequestDto.setSurname(surname);
        clientRequestDto.setAge(age);
        clientRequestDto.setBirthday(birthday);
        clientRequestDto.setPhone(phone);

        assertEquals(clientId, clientRequestDto.getClientId());
        assertEquals(name, clientRequestDto.getName());
        assertEquals(middleName, clientRequestDto.getMiddleName());
        assertEquals(surname, clientRequestDto.getSurname());
        assertEquals(age, clientRequestDto.getAge());
        assertEquals(birthday, clientRequestDto.getBirthday());
        assertEquals(phone, clientRequestDto.getPhone());
    }
}
