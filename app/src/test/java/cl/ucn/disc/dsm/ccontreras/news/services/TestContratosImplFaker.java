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

import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import cl.ucn.disc.dsm.ccontreras.news.model.News;

/**
 * Testing para contratosImpl
 * @author  Cristian Contreras F.
 */
public final class TestContratosImplFaker {
    /**
     * El logger
     */
    private  static final Logger log = LoggerFactory.getLogger(TestContratosImplFaker.class);
    /**
     * El test para mostrar las noticias
     */
    public void testRetrieveNews(){
        log.debug("Testing..");
        //La implementacion concreta
        Contratos contratos = new ContratosImplFaker();

        //llamando al metodo
        List<News> news = contratos.retrieveNews(5);

        //...la lista no puede ser nula
        Assertions.assertNotNull(news, "La Lista es nula");

        //... la lista no puede estar vacia
        Assertions.assertFalse(news.isEmpty(), "La Lista esta vacia");

        //El tamaño(lista) = 5
        Assertions.assertEquals(5, news.size(), "El tamaño de la lista es distinto de 5");

        // el debug del log
        for(News n : news){
            log.debug("News:{}", n);
        }
        //tamaño = 0
        Assertions.assertEquals(0, contratos.retrieveNews(0).size(),"Lista != 0");
        //tamaño = 3
        Assertions.assertEquals(3, contratos.retrieveNews(3).size(),"Lista != 3");
        //tamaño = 10
        Assertions.assertEquals(10, contratos.retrieveNews(10).size(),"Lista != 10");
        log.debug("Done.");

    }
}
