<?php

namespace App\utils;

class View{

    /**
     * Método responsável por retornar o conteúdo de uma view
     * @param string $value
     * @return string
     */

    private static function getContentView($view){
        $file = __DIR__. '/../../resources/view/' . $view . '.html';
        return file_exists($file) ? file_get_contents($file) : '';
    }

    /**
     * Método responsável por retornar o conteúdo renderizado de uma view
     * @param string $value
     * @param array $vars (string/numerico)
     * @return string
     */
    public static function render($view, $vars = []){
       $keys = array_keys($vars);

        $keys = array_map(function($item){
            return '{{' . $item . '}}';
        }, $keys);
        
        $contentView = self::getContentView($view);
        return str_replace($keys, array_values($vars), $contentView);
    }
}