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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.ccontreras.news.model.News;

/**
 * El faker que implementa a (@link Contratos
 */
public final class ContratosImplFaker implements Contratos {
    /**
     * El logger
     */
    private  static final Logger log = LoggerFactory.getLogger(ContratosImplFaker.class);
    /**
     * La lista de las noticias
     */
    private final List<News> theNews = new ArrayList<>();

    /**
     * El contructor: genera 5 {@link News}
     */
    public ContratosImplFaker(){
        //lo utiliza el faker
        final Faker faker = Faker.instance();
        for (int i = 0; i < 5; i++){
            this.theNews.add(new News(
                    Integer.toUnsignedLong(i),
                    faker.book().title(),
                    faker.name().username(),
                    faker.name().fullName(),
                    faker.internet().url(),
                    faker.internet().avatar(),
                    faker.harryPotter().quote(),
                    faker.lorem().paragraph(3),
                    ZonedDateTime.now(ZoneId.of("-3"))
            ));
        }
    }

    /**
     * Obtiene la lista de noticias
     * @param size tamaño de la lista
     * @return la lista de noticias
     */
    @Override
    public List<News> retrieveNews(final Integer size) {
        //el ultimo 'tamaño' del elemento
        return theNews.subList(theNews.size() - size, theNews.size());
    }


    @Override
    public void saveNews(final News news) {
        //FIXME: no dulpplicados
        this.theNews.add(news);

    }
}
