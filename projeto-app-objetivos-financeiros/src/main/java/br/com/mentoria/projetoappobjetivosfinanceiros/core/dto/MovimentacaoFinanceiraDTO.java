package br.com.mentoria.projetoappobjetivosfinanceiros.core.dto;
import br.com.mentoria.projetoappobjetivosfinanceiros.core.Enum.CreditoDebito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class MovimentacaoFinanceiraDTO {

    private Long id;

    private LocalDate data;

    private BigDecimal valor;

    private Long objetivoId;

    private CreditoDebito creditoDebito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getObjetivoId() {
        return objetivoId;
    }

    public void setObjetivoId(Long objetivoId) {
        this.objetivoId = objetivoId;
    }

    public CreditoDebito getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(CreditoDebito creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovimentacaoFinanceiraDTO that = (MovimentacaoFinanceiraDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(data, that.data) && Objects.equals(valor, that.valor) && Objects.equals(objetivoId, that.objetivoId) && creditoDebito == that.creditoDebito;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, valor, objetivoId, creditoDebito);
    }

    @Override
    public String toString() {
        return "MovimentacaoFinanceira{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                ", objetivoId=" + objetivoId +
                ", creditoDebito=" + creditoDebito +
                '}';
    }
}
