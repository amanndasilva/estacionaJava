/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

/**
 *
 * @author amand
 */
public class CarroBean {
    private String placa;
    private String cor;
    private String descricao;

    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public CarroBean(String placa, String cor, String descricao){
        this.placa = placa;
        this.cor = cor;
        this.descricao = descricao;
    }
    
    public CarroBean(){
    }
}