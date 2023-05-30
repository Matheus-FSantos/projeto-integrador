package br.com.senacsp.projetointegrador.model.dto;

import java.io.Serializable;

/**
 * <h1 align='center'>AddressDTO.class</h1>
 * <hr>
 * <p>
 * Classe de DTO do sistema, serve para formatar um Objeto do tipo Endereco
 * <em>(Mais usada para formatar um endereço valido na interface grafica)</em>
 *
 * <em>
 * (Sujeito a alterações)
 * </em>
 * </p>
 * <br>
 * <p>
 * GitHub do Projeto:
 * <em>http://github.com/Matheus-FSantos/projeto-integrador</em></p>
 * <br>
 *
 * @version 2.0
 * @since 2.0
 * @category Class
 * @author Matheus Ferreira Santos
 */
public class AddressDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String address;
    private String state;
    private String UF;
    private String CEP;

    /**
     * <h1 align='center'>Construtor</h1>
     * <hr>
     * <p>
     * Método construtor padrão da classe</p>
     *
     * @version 1.1
     * @since 1.0
     * @author Matheus Ferreira Santos
     * @category Constructor
     */
    public AddressDTO() {
        super();
    }

    /**
     * <h1 align='center'>Construtor</h1>
     * <hr>
     * <p>
     * Método construtor que recebe todos os argumentos da classe</p>
     *
     * @version 1.1
     * @param address
     * @param state
     * @param UF
     * @param CEP
     * @since 1.0
     * @author Matheus Ferreira Santos
     * @category Constructor
     */
    public AddressDTO(String address, String state, String UF, String CEP) {
        super();
        this.address = address;
        this.state = state;
        this.UF = UF;
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Address [address=" + address + ", state=" + state + ", UF=" + UF + ", CEP=" + CEP + "]";
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getUF() {
        return UF;
    }

    public String getCEP() {
        return CEP;
    }

}
