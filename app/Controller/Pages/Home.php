<?php

namespace App\Controller\Pages;

use \App\utils\View;
use \App\model\entity\Organization;

class Home extends Page{

    /**
     * Método resposável por retornar o conteúdo (view) da Home
     * @return string
     */
    public static function getHome(){
        $obOrganization = new Organization;

        $content = View::render('pages/home',[
            'name' => $obOrganization->name,
            'description' => $obOrganization->description,
            'site' => $obOrganization->site
        ]);

        return parent::getPage('Allan R', $content);
    }
}