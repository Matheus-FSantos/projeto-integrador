package br.com.senacsp.projetointegrador.model.service;

import java.sql.SQLException;
import java.util.List;

import br.com.senacsp.projetointegrador.model.dao.AddressDAO;
import br.com.senacsp.projetointegrador.model.domain.Address;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

public class AddressService {

	private AddressDAO addressDAO;
	
	public AddressService() {
		this.addressDAO = new AddressDAO();
	}
	
	public List<Address> findAll() throws SQLException {
		return this.addressDAO.findAll();
	}
	
	public Address save(String address, String state, String UF, String CEP) throws SQLException, ApplicationException {
		return this.addressDAO.save(address, state, UF, CEP);
	}
	
	public Address findAddressByCEP(String CEP) throws SQLException, ApplicationException {
		return this.addressDAO.findByAddressCEP(CEP);
	}
	
	public Boolean deleteByCEP(String CEP) {
		try {
			return this.getAddressDAO().deleteByCEP(CEP);
		} catch(SQLException sqlException) {
			return false;
		} catch(ApplicationException applicationException) {
			return false;
		}
	}
	
	public AddressDAO getAddressDAO() {
		return addressDAO;
	}
	
}
