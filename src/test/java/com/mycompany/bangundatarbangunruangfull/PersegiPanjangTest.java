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
public class PersegiPanjangTest {
    
   @Test
    public void testPersegiPanjang() {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5, "Persegi Panjang Contoh");
        assertEquals(30.0, persegiPanjang.hitungKeliling(), 0.01); // 2 * (10 + 5)
        assertEquals(50.0, persegiPanjang.hitungLuas(), 0.01);     // 10 * 5
    }
}
