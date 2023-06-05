package com.softtek.pruebasunitarias;

import com.softtek.pruebasunitarias.model.Calculadora;
import com.softtek.pruebasunitarias.model.Circulo;
import com.softtek.pruebasunitarias.model.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PruebasUnitariasApplicationTests {
    private Rectangulo r = null;
    private Circulo c = null;

    @BeforeEach
    public void inicializar(){
        this.r = new Rectangulo(1,1,3,2);
        this.c = new Circulo(1,1,2);
        this.r = new Rectangulo(3,2);
        this.c = new Circulo(2);
    }

    @Test
    public void testCalculadora(){
        Assertions.assertEquals(7,Calculadora.sumar(5,2));
        Assertions.assertEquals(10,Calculadora.restar(19,9));
        Assertions.assertEquals(8,Calculadora.multiplicar(4,2));
        Assertions.assertThrows(ArithmeticException.class,()-> Calculadora.dividir(5,0));
        Assertions.assertEquals(7,Calculadora.dividir(14,2));
    }

    @Test
    public void testAreas(){
        Assertions.assertEquals(6,this.r.calcularArea());
        Assertions.assertEquals(12.566370614359172,this.c.calcularArea());
    }

    @Test
    public void testPosicion(){
        Assertions.assertEquals("x = 0, y = 0, ancho = 3.0, alto = 2.0",this.r.posicion());
        Assertions.assertEquals("x = 0, y = 0, radio = 2.0",this.c.posicion());
    }
}