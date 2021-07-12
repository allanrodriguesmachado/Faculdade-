<?php

namespace App\Controller\Pages;

use \App\utils\View;


class Page{

    /**
     * Método resposável por retornar header
     * @return string
     */
    private static function getHeader(){
        return View::render('pages/header');
    }

      /**
     * Método resposável por retornar footer
     * @return string
     */
    private static function getFooter(){
        return View::render('pages/footer');
    }

    /**
     * Método resposável por retornar o conteúdo da pagina
     * @return string
     */
    public static function getPage($title, $content){
        return View::render('pages/page',[
            'title' => $title,
            'header' => self::getHeader(),
            'content' => $content,
            'footer' => self::getFooter(),
        ]);
    }
}