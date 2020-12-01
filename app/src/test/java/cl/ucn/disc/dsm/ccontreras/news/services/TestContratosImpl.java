/*
 * Copyright (c) 2020.
 * Copyright 2020 Cristian Contreras-Farias, cristian.contreras@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */

package cl.ucn.disc.dsm.ccontreras.news.services;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import cl.ucn.disc.dsm.ccontreras.news.model.News;


/**
 * testeando los contratos
 * @author Cristian Contreras F.
 */
public class TestContratosImpl {
    /**
     * the logger
     */
    private static final Logger log = LoggerFactory.getLogger(TestContratosImpl.class);

    /**
     *el test para las noticias
     */


    @Test
    public void testRetrieveNews(){

        log.debug("Testing...");
        // La implementacion
        Contratos contratos = new ContratosImpl();
        //Lamado al metodo
        List<News> news = contratos.retrieveNews(5);
        Assertions.assertNotNull(news, "La lista esta vacia");
        Assertions.assertTrue(news.size() != 0, "Lista vacia?");
        Assertions.assertTrue(news.size() == 5,"El tamaño de la lsita es != de 5");
        log.debug("Done.");

    }

    /**
     * Muestra el faker
     */

    @Test
    public void testFaker(){

        //contruir el faker
        Faker faker = Faker.instance();
        for(int i = 0; i < 5; i++){
            log.debug("nombre: {}",faker.name().fullName());

        }
    }
}
