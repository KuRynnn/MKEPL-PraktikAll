/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.bangundatarbangunruangfull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class PrismaSegi3Test {
    
    @Test
    public void testPrismaSegi3() {
        PrismaSegi3 prismaSegi3 = new PrismaSegi3(3, 4, 10, "Prisma Segitiga Contoh");
        assertEquals(162.0, prismaSegi3.hitungLuasPermukaan(), 0.01); 
        assertEquals(60.0, prismaSegi3.hitungVolume(), 0.01);      
    }
}
