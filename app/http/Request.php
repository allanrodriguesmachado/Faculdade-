<?php


namespace App\http;


class Request{

    /**
     * Método HTTP da requisição
     * @var string
     */
    private $httpMethod;

    /**
     * Uri da página
     * @var string
     */
    private $uri;

    /**
     * Parameters da URL ($_GET)
     * @var array
     */
    private $queryParams = [];

    /**
     * Variáveis recebidas no POST da pagina ($_POST)
     * @var array
     */
    private $postVaras = [];

    /**
     * Cabeçalho da requisição
     * @var array
     */
    private $headers = [];

    /**
     * Request constructor.
     */
    public function __construct(){
        $this->queryParams = $_GET ?? [];
        $this->postVaras = $_POST ?? [];
        $this->headers = getallheaders();
        $this->httpMethod = $_SERVER['REQUEST_METHOD'] ?? '';
        $this->uri = $_SERVER['REQUEST_URI'] ?? '';
    }
}