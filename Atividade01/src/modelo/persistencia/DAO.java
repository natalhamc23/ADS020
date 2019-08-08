package modelo.persistencia;

import java.util.List;

/**
 *
 * @author 18114290048
 */
public interface DAO<T> {

    List<T> listar() throws DadosException;

    void incluir(T entidade) throws DadosException;

    void alterar(T entidade) throws DadosException;

    void excluir (int id) throws DadosException;

    T consultar(int id) throws DadosException;
}
