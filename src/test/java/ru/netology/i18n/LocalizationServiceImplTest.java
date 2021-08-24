package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        LocalizationServiceImpl localizationService=new LocalizationServiceImpl();
        String result=localizationService.locale(Country.RUSSIA);
        String expected="Добро пожаловать";
        assertEquals(expected,result);
    }
}
