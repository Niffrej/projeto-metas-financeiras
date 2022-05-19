package br.com.mentoria.projetoappobjetivosfinanceiros.core.dto;

import br.com.mentoria.projetoappobjetivosfinanceiros.core.Enum.Prazo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class DashboardDTO {

    private Long objetivoId;

    private String descricao;

    private LocalDate dataAlvo;

    private BigDecimal valor;

    private Prazo prazo;

    private BigDecimal totalAcumulado;

    private BigDecimal acumuladoMensal;

    public Long getObjetivoId() {
        return objetivoId;
    }

    public void setObjetivoId(Long objetivoId) {
        this.objetivoId = objetivoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public BigDecimal getTotalAcumulado() {
        return totalAcumulado;
    }

    public void setTotalAcumulado(BigDecimal totalAcumulado) {
        this.totalAcumulado = totalAcumulado;
    }

    public BigDecimal getAcumuladoMensal() {
        return acumuladoMensal;
    }

    public void setAcumuladoMensal(BigDecimal acumuladoMensal) {
        this.acumuladoMensal = acumuladoMensal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DashboardDTO dashboard = (DashboardDTO) o;
        return Objects.equals(objetivoId, dashboard.objetivoId) && Objects.equals(descricao, dashboard.descricao) && Objects.equals(dataAlvo, dashboard.dataAlvo) && Objects.equals(valor, dashboard.valor) && prazo == dashboard.prazo && Objects.equals(totalAcumulado, dashboard.totalAcumulado) && Objects.equals(acumuladoMensal, dashboard.acumuladoMensal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objetivoId, descricao, dataAlvo, valor, prazo, totalAcumulado, acumuladoMensal);
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "objetivoId=" + objetivoId +
                ", descricao='" + descricao + '\'' +
                ", dataAlvo=" + dataAlvo +
                ", valor=" + valor +
                ", prazo=" + prazo +
                ", totalAcumulado=" + totalAcumulado +
                ", acumuladoMensal=" + acumuladoMensal +
                '}';
    }
}
