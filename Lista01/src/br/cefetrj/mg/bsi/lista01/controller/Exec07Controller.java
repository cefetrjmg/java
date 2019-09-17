/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.controller;

import br.cefetrj.mg.bsi.lista01.dao.Exec07DAO;
import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import br.cefetrj.mg.bsi.lista01.view.Exec07Form;

/**
 *
 * @author aluno-2
 */
public class Exec07Controller implements Controller {

    private static Exec07DAO dao = null;
    private Exec07Model model = null;
    private Exec07Form form = null;

    public static Exec07DAO getDao() {
        if (dao == null) {
            dao = new Exec07DAO();
        }
        return dao;
    }

    public void setForm(Exec07Form form) {
        this.form = form;
    }

    public Exec07Controller() {
        model = new Exec07Model();

    }

    public Exec07Controller(Exec07Form form) {
        this.form = form;
    }

    @Override
    public String inserir() {
        model.setAutor(form.getjTxtAutor().getText());
        model.setISBN(form.getJTxtIsbn().getText());
        model.setTitulo(form.getjTxtTitulo().getText());
        return getDao().inserir(model);

    }

    @Override
    public String atualizar() {
        model.setAutor(form.getjTxtAutor().getText());
        model.setISBN(form.getJTxtIsbn().getText());
        model.setTitulo(form.getjTxtTitulo().getText());
        model.setId(Integer.parseInt(form.getjTxtId().getText()));
        return getDao().atualizar(model);
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar() {
        if (!form.getjTxtId().getText().isEmpty()) {
            model = (Exec07Model) getDao().buscar(Integer.parseInt(form.getjTxtId().getText()));
            if (model != null) {
                form.getJTxtIsbn().setText(model.getISBN());
                form.getjTxtAutor().setText(model.getAutor());
                form.getjTxtTitulo().setText(model.getTitulo());
                form.getjBtnCadAtualizar().setText("Atualizar");
            }
        }

    }

}
