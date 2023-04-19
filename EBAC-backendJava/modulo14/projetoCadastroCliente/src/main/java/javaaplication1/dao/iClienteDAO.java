/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication1.dao;
import javaaplication1.domain.Cliente;
/**
 *
 * @author franc
 */
public interface iClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
}
