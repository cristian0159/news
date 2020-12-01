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

package cl.ucn.disc.dsm.ccontreras.news.model;


import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;


/**
 * Testeo de news.
 * @author Cristian Contreras  F.
 */
public class TestNews {
    /**
     * El logger
     */
    private static final Logger log = LoggerFactory.getLogger(TestNews.class);

    /**
     * Contructor del testing
     */

    public void testContructor() {

        log.debug("Testing..");

        //Todos los datos ok
        News news = new News("El titulo",
                "The Source",
                "The Author",
                "The URL",
                "The URL image",
                "The Drescription",
                "The Content",
                ZonedDateTime.now(ZoneId.of("-3"))
        );

        log.debug("El id: {}.", news.getId());

        Assertions.assertEquals(332847ae452aa35f7c84ef56f55c, news.getId(), "Wrong id !");
        log.debug("Titulo nulo");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new News(null,
                    "The Source",
                    "The Author",
                    "The URL",
                    "The URL image",
                    "The Description",
                    "The Content",
                    ZonedDateTime.now(ZoneId.of("-3"))
            );
        });

        log.debug("Direccion nula ..");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new News("The Title",
                    null,
                    "The Author",
                    "The URL",
                    "The URL Image",
                    "The Description",
                    "The Content",
                    ZonedDateTime.now(ZoneId.of("-3"))
            );
        });

        log.debug("Autor Nulo ..");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new News("The Title",
                    "The source",
                    null,
                    "The URL",
                    "The URL Image",
                    "The Description",
                    "The Content",
                    ZonedDateTime.now(ZoneId.of("-3"))
            );
        });

        log.debug("Descripcion nula ..");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new News("The Title",
                    "The source",
                    "The Author",
                    "The URL",
                    "The URL Image",
                    null,
                    "The Content",
                    ZonedDateTime.now(ZoneId.of("-3"))
            );
        });

        log.debug("Contenido nulo ..");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new News("The Title",
                    "The source",
                    "The Author",
                    "The URL",
                    "The URL Image",
                    "The Description",
                    null,
                    ZonedDateTime.now(ZoneId.of("-3"))
            );
        });

        log.debug("Fecha publicacion nula ..");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new New("The Title",
                    "The source",
                    "The Author",
                    "The URL",
                    "The URL Image",
                    "The Description",
                    "The Content",
                    null
            );
        });

        log.debug(".. Done!");


    }
}