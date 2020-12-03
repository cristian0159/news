/*
 * Copyright (c) 2020.
 * Copyright 2020 Cristian Contreras-Farias, cristian.contreras@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */

package cl.ucn.disc.dsm.ccontreras.news;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import cl.ucn.disc.dsm.ccontreras.news.model.News;
import cl.ucn.disc.dsm.ccontreras.news.services.Contratos;
import cl.ucn.disc.dsm.ccontreras.news.services.ContratosImplNewsApi;

/**
 * La Clase Main
 * @author Crsitian Contreras F.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * El logger
     */
    private static final Logger log = LoggerFactory.getLogger(MainActivity.class);

    /**
     * la ListView
     */
    protected ListView listView;

    /**
     * OnCreate
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.debug("onCreate..");
        setContentView(R.layout.activity_main);

        this.listView =  findViewById(R.id.am_lv_news);
        // obtener la noticia en el hilo del background
        AsyncTask.execute(()->{
            //Usa los contratos para adquirir las noticias
            Contratos contratos = new ContratosImplNewsApi("1feb332847ae452aa35f7c84ef56f55c");

            //Obtiene las noticias de NewsApi(internet)
            List<News> listNews = contratos.retrieveNews(30);

            //Contruccion de un simple adaptador para mostrar la lista de noticias(String)
            ArrayAdapter<String> adapter = new ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    listNews
            );
            this.listView.setAdapter(adapter);
        });
    }
}
