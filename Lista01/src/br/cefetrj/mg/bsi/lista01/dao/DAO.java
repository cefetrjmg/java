/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.dao;

/**
 *
 * @author aluno-2
 */
public interface DAO {
    public String inserir(Object o);
    public String atualizar(Object o);
    public String excluir(int id);
    public String listar();
    public Object buscar(int id);
    
    
}
