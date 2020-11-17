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

import org.threeten.bp.ZonedDateTime;

/**
 * the domain model: News
 * El dominio del modelo: News
 * @author Cristian Contreras F.
 */
public class News {
    /**
     * Id unica
     */
    private long id;
    /**
     * El titulo
     * resticciones: no nulo, tamaño > 2
     */
    private String title;
    /*
     * El titulo
     * resticciones: no nulo, tamaño > 2
     */
    private String source;
    /*
     * El autor
     */
    private String author;
    /**
     * La url
     */
    private String url;
    /*
     * la url de la imagen
     */
    private String urlImage;
    /**
     * la url de la imagen
     */
    private String description;
    /**
     * El contenido
     */
    private String content;
    /**
     * la fecha de la publicacion
     */
    private ZonedDateTime pucblishedAt;

    /**
     * El contructor
     * @param id
     * @param title
     * @param source
     * @param author
     * @param url
     * @param urlImage
     * @param description
     * @param content
     * @param pucblishedAt
     */
    public News(long id, String title, String source, String author, String url, String urlImage, String description, String content, ZonedDateTime pucblishedAt) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.author = author;
        this.url = url;
        this.urlImage = urlImage;
        this.description = description;
        this.content = content;
        this.pucblishedAt = pucblishedAt;
    }

    /**
     *
     * @return la id
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return el titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return la direccion
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @return el nombre del autor
     */
    public String getAuthor() {
        return author;
    }
    /**
     *
     * @return La url
     */

    public String getUrl() {
        return url;
    }
    /**
     *
     * @return la url de la imagen
     */

    public String getUrlImage() {
        return urlImage;
    }
    /**
     *
     * @return la descripcion
     */

    public String getDescription() {
        return description;
    }
    /**
     *
     * @return el contenido
     */

    public String getContent() {
        return content;
    }
    /**
     *
     * @return fecha de la publicacion
     */

    public ZonedDateTime getPucblishedAt() {
        return pucblishedAt;
    }
}
