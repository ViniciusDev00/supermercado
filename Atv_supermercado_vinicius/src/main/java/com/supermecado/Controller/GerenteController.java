    package com.supermecado.Controller;

    import com.supermecado.model.Gerente;
    import org.springframework.web.bind.annotation.*;
    import com.supermecado.DataBase.DatabaseSimulado;

    import java.util.List;

    @RestController
    @RequestMapping("/Gerentes")
    public class GerenteController {

        @GetMapping
        public List<Gerente> listarGerentes() {
            return DatabaseSimulado.gerentes;
        }

        @PostMapping
        public String adicionarGerente(@RequestBody Gerente gerente) {
            DatabaseSimulado.gerentes.add(gerente);
            return "Gerente adicionado com sucesso!";
        }

        @GetMapping("/supervisionar-estoque")
        public String supervisionarEstoque() {
            return "Gerente supervisionando o estoque...";
        }

        @GetMapping("/supervisionar-vendas")
        public String supervisionarVendas() {
            return "Gerente supervisionando as vendas...";
        }
    }