package Revisão.exe2;

import javax.xml.transform.Templates;
import java.security.PublicKey;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Object Tools;
    private Aluno responsavel;
    private Date data_retirada;
    private Date data_devolucao;
    private Livro livro_alugado;

    public Emprestimo(Aluno responsavel, Date data_retirada, Date data_devolucao, Livro livro_alugado) {
        this.responsavel = responsavel;
        this.data_retirada = data_retirada;
        this.data_devolucao = data_devolucao;
        this.livro_alugado = livro_alugado;
    }

    public Emprestimo(Aluno responsavel, Date data_retirada, Date data_devolucao) {
        this.responsavel = responsavel;
        this.data_retirada = data_retirada;
        this.data_devolucao = data_devolucao;
    }

    public <generated, body> Emprestimo(Aluno b1, Livro a1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change
    }
    public Aluno getEmprestimo() {
        return responsavel;
    }

    public void setEmprestimo(Aluno responsavel) {
        this.responsavel = responsavel;
    }

    public Livro getLivro_alugado() {
        return livro_alugado;
    }

    public void setLivro_alugado(Livro livro_alugado) {
        this.livro_alugado = livro_alugado;
    }

    public Date getData_retirada() {
        return data_retirada;
    }

    public void setData_retirada(Date data_retirada) {
        this.data_retirada = data_retirada;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    public Aluno getResponsavel() {
        return responsavel;
    }
public void setResponsavel(Aluno responsavel) {
    this.responsavel = responsavel;
}
@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprestimo other = (Emprestimo) obj;
        if (!this.responsavel.equals(other.responsavel)) {
            return false;
        }
        if (!this.livro_alugado.equals(other.livro_alugado)) {
            return false;
        }
        if (!this.data_retirada.equals(other.data_retirada)) {
            return false;
        }
        if (!this.data_devolucao.equals(other.data_devolucao)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Emprestimo{" + "responsavel=" + responsavel + ", data_retirada=" + data_retirada + ", data_devolucao=" + data_devolucao + ", livro_alugado=" + livro_alugado + '}';
    }


}
