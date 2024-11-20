/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;
import java.util.*;

/**
 *
 * @author amand
 */
public class Teste {
    public static void main(String[] args){
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        //Inserir
        cb.setPlaca("CVB1234");
        cb.setCor("Rosa");
        cb.setDescricao("Carro 6");
        
        System.out.println(cd.inserir(cb));
        
        //Alterar
        cb.setPlaca("CVB1234");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 6");
        
        System.out.println(cd.alterar(cb));
        
        //Excluir
        cb.setPlaca("ABC1589");
        
        System.out.println(cd.alterar(cb));
        
        
        //Listar
        List<CarroBean> lista = cd.listarTodos();
        
        if(lista != null){
            for(CarroBean carro : lista){
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descricao: " + carro.getDescricao());
            }
        }
    }
}
