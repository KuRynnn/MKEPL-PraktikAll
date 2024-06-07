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
public class LingkaranTest {
    
    @Test
    public void testLingkaran() {
        Lingkaran lingkaran = new Lingkaran(7, "Lingkaran Contoh");
        assertEquals(43.96, lingkaran.hitungKeliling(), 0.01); // 2 * 3.14 * 7
        assertEquals(153.86, lingkaran.hitungLuas(), 0.01);   // 3.14 * 7 * 7
    }
}
