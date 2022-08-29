package com.cursojsf.bean.estudante;

import com.cursojsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.lang.invoke.LambdaConversionException;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable{
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Ricardo", "eh", "foda"};
    private List<String> nomesList = asList("Ricardo", "Renan", "Ayla", "Gustavo");
    private Set<String> nomesSet = new HashSet<>(asList("Jurema", "Yoran", "Zulu", "Haran"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;

    private boolean mostrarLink;

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("One Piece", "O mais longo");
        nomesMap.put("Naruto", "O mais lenga lenga");
//
////      EXEMPLO DE IMPRIMIR UM MAP
//        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


    }

    public void executar() {
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }
    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }
    public void esconderLink() {
        this.mostrarLink = false;
    }
    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public String executarRetorno(String param) {
        return "Quem eh o lindão? é o "+param;
    }

    public String irParaPagina2() {return "index2?faces-redirect=true";}
    public void executar(String param) {
        System.out.println("Fazendo uma busca no BD com PARAMETRO:"+param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void calcularCubo(LambdaExpression le, long value) {
        long result = (long)
            le.invoke(FacesContext.getCurrentInstance().getELContext()
                    ,value);
        System.out.println("resultado Lambda: "+ result);
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }
    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
