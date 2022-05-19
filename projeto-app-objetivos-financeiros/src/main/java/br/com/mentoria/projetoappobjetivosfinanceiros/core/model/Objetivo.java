package br.com.mentoria.projetoappobjetivosfinanceiros.core.model;

import br.com.mentoria.projetoappobjetivosfinanceiros.core.Enum.Prazo;
import br.com.mentoria.projetoappobjetivosfinanceiros.core.Enum.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Objetivo {

    private Long id;

    private String descricao;

    private Status status;

    private String observacao;

    private LocalDate dataAlvo;

    private BigDecimal valor;

    private Prazo prazo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getDataAlvo() {
        return dataAlvo;
    }

    public void setDataAlvo(LocalDate dataAlvo) {
        this.dataAlvo = dataAlvo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Prazo getPrazo() {
        return prazo;
    }

    public void setPrazo(Prazo prazo) {
        this.prazo = prazo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objetivo objetivo = (Objetivo) o;
        return Objects.equals(id, objetivo.id) && Objects.equals(descricao, objetivo.descricao) && status == objetivo.status && Objects.equals(observacao, objetivo.observacao) && Objects.equals(dataAlvo, objetivo.dataAlvo) && Objects.equals(valor, objetivo.valor) && prazo == objetivo.prazo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, status, observacao, dataAlvo, valor, prazo);
    }

    @Override
    public String toString() {
        return "Objetivo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", observacao='" + observacao + '\'' +
                ", dataAlvo=" + dataAlvo +
                ", valor=" + valor +
                ", prazo=" + prazo +
                '}';
    }
}
