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
public class KubusTest {
    
    //Ini test berhasil lho
    @Test
    public void testKubus() {
        Kubus kubus = new Kubus(5, "Kubus Contoh");
        assertEquals(150.0, kubus.hitungLuasPermukaan(), 0.01);
        assertEquals(150.0, kubus.hitungVolume(), 0.01);
    }
    
}
